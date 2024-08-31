package com.logica.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //4) Construa um algoritmo que leia um número inteiro na tela e responda o número antecessor e o sucessor.

        int n1, sucessor, antecessor;

        System.out.println("Digite um número: ");
        n1 = sc1.nextInt();

        sucessor = n1 + 1;
        antecessor = n1 - 1;

        System.out.println("Sucessor = "+sucessor);
        System.out.println("Antecessor = "+antecessor);
        
    }

}
