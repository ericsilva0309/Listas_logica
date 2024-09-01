package com.logica.lista1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lista1Application.class, args);
		int opcao;
		Scanner sc1 = new Scanner(System.in);


		do {
            System.out.println("===== MENU DE EXERCÍCIOS =====");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exercício 4");
            System.out.println("5. Exercício 5");
            System.out.println("6. Exercício 6");
            System.out.println("7. Exercício 7");
            System.out.println("8. Exercício 8");
            System.out.println("0. Sair");
			System.out.print("=============================\n\n");
            System.out.print("Escolha uma opção: ");
            opcao = sc1.nextInt();

            switch (opcao) {
                case 1: System.out.println("Executando o Exercício 1...");
                    Exercicio1.resolucao();
                    break;
                case 2: System.out.println("Executando o Exercício 2...");
                    Exercicio2.resolucao();
                    break;
                case 3: System.out.println("Executando o Exercício 3...");
                    Exercicio3.resolucao();
                    break;
                case 4: System.out.println("Executando o Exercício 4...");
                    Exercicio4.resolucao();
                    break;
                case 5: System.out.println("Executando o Exercício 5...");
                    Exercicio5.resolucao();
                    break;
                case 6: System.out.println("Executando o Exercício 6...");
                    Exercicio6.resolucao();
                    break;
                case 7: System.out.println("Executando o Exercício 7...");
                    Exercicio7.resolucao();
                    break;
                case 8: System.out.println("Executando o Exercício 8...");
                    Exercicio8.resolucao();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

    }

 }