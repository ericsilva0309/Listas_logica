package com.logica.lista3;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //2) Desenvolva um programa que receba um número do usuário e escreva a
        //tabuada dele.

        int n1,resultado,contador;
        
        System.out.println("Digite um número para ver sua tabuada: ");
        n1 = sc1.nextInt();
        Limpa.limpa_windows();
        for(contador=1; contador <= 10; contador++)
    {
        resultado = n1*contador;
			System.out.println(n1+" X "+contador+" = "+resultado);
        }
        
    }

}
