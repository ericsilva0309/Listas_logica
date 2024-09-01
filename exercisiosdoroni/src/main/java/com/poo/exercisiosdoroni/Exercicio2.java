package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {

        int num1;

        System.out.print("escreva um número: ");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();

        System.out.println("Seu sucessor é: "+(num1+1));
        System.out.println("Seu antecessor é: "+(num1-1));
        
    }

}
