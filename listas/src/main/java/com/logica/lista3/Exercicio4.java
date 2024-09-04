package com.logica.lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //4) Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
        //para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
        //"Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio".
        int numeroEscolhido, numero, tentativa, diferenca;
        boolean acertou = false;

        System.out.println("Jogador 1, escolha um número entre 1 e 100: ");
        numeroEscolhido = sc1.nextInt();

        Limpa.limpa_windows();

        System.out.println("Jogador 2, tente adivinhar o número.");

        do {
            System.out.println("Digite seu palpite: ");
            tentativa = sc1.nextInt();

            if (tentativa == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
            } else {
                diferenca = Math.abs(numeroEscolhido - tentativa);
                if (diferenca <= 2) {
                    System.out.println("Quase lá!");
                } else if (diferenca <= 10) {
                    System.out.println("Tá quente!");
                } else if (diferenca <= 20) {
                    System.out.println("Tá morno.");
                } else {
                    System.out.println("Tá frio!");
                }

                if (tentativa < numeroEscolhido) {
                    System.out.println("Muito baixo!");
                } else {
                    System.out.println("Muito alto!");
                }
            }

        } while (!acertou);
    }
}