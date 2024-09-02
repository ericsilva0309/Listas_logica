package com.logica.lista2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista2Application {
	    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

		do {
            
            
            System.out.println("=======================================");
            System.out.println("       Bem-vindo ao Menu de Exercícios");
            System.out.println("=======================================");
            System.out.println("Escolha um exercício para resolver:");
            System.out.println("1. Exercício 1: Verificar par ou impar");
            System.out.println("2. Exercício 2: Verificar qual número é maior");
            System.out.println("3. Exercício 3: Verifique se o usuário é gestante, tem mais de 65 anos ou é deficiente.");
            System.out.println("4. Exercício 4: Verificação de idade e permissões.");
            System.out.println("5. Exercício 5: Verifique login e senha.");
            System.out.println("6. Exercício 6: Calculadora de média de provas.");
            System.out.println("7. Exercício 7: Programa Identificador de Divisibilidade");
            System.out.println("8. Exercício 8: Jogo de perguntas e respostas (múltipla escolha).");
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