package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        
        String nome, disciplina;
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite seu nome: ");
        Scanner sc1 = new Scanner(System.in);
        nome = sc1.nextLine();

        System.out.println("Digite a disciplina: ");
        disciplina = sc1.nextLine();

        System.out.println("Digite as suas notas: ");
        nota1 = sc1.nextDouble();
        nota2 = sc1.nextDouble();
        nota3 = sc1.nextDouble();
        nota4 = sc1.nextDouble();
        media = (nota1+nota2+nota3+nota4)/4;
        
        

        System.out.printf("Sua média em "+disciplina+" é: %.1f"+media);
    }
}
