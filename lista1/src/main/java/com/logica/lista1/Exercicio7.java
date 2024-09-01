package com.logica.lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //7) Escreva um programa que receba quatro notas de um aluno e calcule a média aritmética dessas notas.

        double nota1, nota2, nota3, nota4, media;
        String nome, disciplina;

        System.out.println("Olá. Digite seu nome: ");
        nome = sc1.nextLine();

        System.out.println("Digite a matéria desejada: ");
        disciplina = sc1.nextLine();

        System.out.println("Digite suas notas do primeiro ao quarto bimestre: ");
        nota1 = sc1.nextDouble();
        nota2 = sc1.nextDouble();
        nota3 = sc1.nextDouble();
        nota4 = sc1.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;

        if (media < 5) {
            System.out.printf("A sua média em "+disciplina+" é %.1f%n",media);
            System.out.println("Parabéns! você é burro(a).");
            
        }
        if (media >= 5 && media <= 8.9) {
            System.out.printf("A sua média em "+disciplina+" é %.1f%n",media);
            System.out.println("Até que da pro gasto.");
            
        }
        if (media > 9) {
            System.out.printf("A sua média em "+disciplina+" é %.1f%n",media);
            System.out.println("Gênio(a)");
            
        }
        
    }

}
