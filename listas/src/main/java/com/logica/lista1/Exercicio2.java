package com.logica.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);
        //2) Escreva um programa que pergunte o nome e o sobrenome do usuário e escreva na tela: "Olá, -usuário-".

        String nome, sobrenome;

        System.out.println("Digite seu nome: ");
        nome = sc1.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc1.nextLine();

        System.out.println("Olá "+nome+" "+sobrenome+".");
    }

}
