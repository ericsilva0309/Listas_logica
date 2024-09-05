package com.logica.lista3;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

		do {
            
            
            System.out.println("=======================================");
            System.out.println("       Bem-vindo ao Menu de Exercícios");
            System.out.println("=======================================");
            System.out.println("Escolha um exercício para resolver:");
            System.out.println("1. Exercício 1: Crônometro.");
            System.out.println("2. Exercício 2: Tabuada.");
            System.out.println("3. Exercício 3: Números pares.");
            System.out.println("4. Exercício 4: Jogo da adivinhação.");
            System.out.println("5. Exercício 5: Verifique login e senha.");
            System.out.println("6. Pirâmide.");
            System.out.println("7. Retângulo.");
            System.out.println("8. Sair");
            System.out.print("Opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
            }
            opcao = scanner.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (opcao) {
                case 1:
                    Exercicio1.resolucao();
                    break;
                case 2:
                    Exercicio2.resolucao();
                    break;
                case 3:
                    Exercicio3.resolucao();
                    break;
                case 4:
                    Exercicio4.resolucao();
                    break;
                case 5:
                    Exercicio5.resolucao();
                    break;
                case 6:
                    Exercicio6.resolucao();
                    break;
                case 7:
                    Exercicio7.resolucao();
                    break;
                case 8:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            // Pausar para que o usuário possa ver o resultado antes de voltar ao menu
            if (opcao != 8) {
                System.out.println("\nPressione Enter para retornar ao menu...");
                scanner.nextLine();
                scanner.nextLine();
				System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } while (opcao != 8);
    }
}
