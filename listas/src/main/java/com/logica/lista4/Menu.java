package com.logica.lista4;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

		do {
            
            
            System.out.println("=======================================");
            System.out.println("       Bem-vindo ao Menu de Exercícios");
            System.out.println("=======================================");
            System.out.println("Escolha um exercício para resolver:");
            System.out.println("1. Exercício 1: Soma das vendas");
            System.out.println("2. Exercício 2: Maior e menor valor");
            System.out.println("3. Exercício 3: Calculo ticket médio de vendas do dia");
            System.out.println("4. Exercício 4: Números pares.");
            System.out.println("5. Exercício 5: Lista de compras");
            System.out.println("6. Exercício 6: Lista de compras com remover");
            System.out.println("7. Exercício 7: Preço");
            System.out.println("8. Exercício 8: Impressao por ordem de preço");
            System.out.println("9. Sair");
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
                Exercicio8.resolucao();
                    break;
                case 9:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            // Pausar para que o usuário possa ver o resultado antes de voltar ao menu
            if (opcao != 9) {
                System.out.println("\nPressione Enter para retornar ao menu...");
                scanner.nextLine();
                scanner.nextLine();
				System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } while (opcao != 9);
    }
}
