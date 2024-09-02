package com.logica.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //1) Escreva um programa que recebe um número digitado pelo usuário e responda se o número inserido é par ou ímpar ou 0.

        int n1, par = 0, impar = 0;

        System.out.println("Digite um número: ");
        n1 = sc1.nextInt();

        if (n1 %2 == 0) {          
            System.out.println("O número digitado é par.");
            
        }else{       
            System.out.println("O número digitado é impar.");
        }
        
    }

}
