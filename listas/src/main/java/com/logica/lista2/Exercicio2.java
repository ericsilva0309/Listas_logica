package com.logica.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //2) Desenvolva um algoritmo que seja capaz de receber dois números digitados  pelo usuário e diga qual deles é maior.

        int n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = sc1.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc1.nextInt();

        if (n1 > n2) {
            System.out.printf("%d é maior do que %d",n1,n2);
            
        }else{
            System.out.printf("%d é menor que %d",n1,n2);
        }
        
    }

}