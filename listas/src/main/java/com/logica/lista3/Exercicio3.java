package com.logica.lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //3) Escreva um código que receba dois números inteiros e escreva todos os
        //números pares entre eles.

        int n1, n2;

        System.out.println("Digite o primeiro numero: ");
        n1 = sc1.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc1.nextInt();

        for (int i = n1; i < n2; i++) {
            if (i%2 == 0) {
                System.out.printf("%d, ",i);
            }      
        }
    }
}
