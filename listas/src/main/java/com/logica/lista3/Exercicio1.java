package com.logica.lista3;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

    // 1) Escreva um programa que sirva como um cronômetro. O usuário deve
    //digitar um numero em segundos e o programa deve contabilizar os segundos
    //digitados. O programa deve receber somente números entre 1 e 59, do
    //contrário ele retornar um erro e solicitar que o usuário digite um número válido.

        int n1;

        do{System.out.println("Digite os segundos (entre 1 e 59): ");
            n1 = sc1.nextInt();

        if (n1 <= 0 || n1 > 59) {
            System.out.println("Número inválido! Por favor, digite um número entre 1 e 59.");
        }
    } while (n1 < 1 || n1 > 59);

    for (int i = 1; i <= n1; i++) {
        System.out.print("Tempo: " + i + " segundo(s)\r");
        Aguarde.aguarde(1);
        Limpa.limpa_windows();
    }
    System.out.println("Tempo concluído!");

    }

}
