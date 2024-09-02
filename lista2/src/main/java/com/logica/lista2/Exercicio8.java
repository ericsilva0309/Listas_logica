package com.logica.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //8) Crie um joguinho de perguntas e respostas múltipla escolha. O programa
        //deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo. Se
        //o usuário chegar até o final o programa deve exibir o número de acertos.

        int erros = 0;
        int acertos = 0;

        String[] perguntas = {
            "1. Qual é o nome da teoria que sugere que o universo está em constante expansão?\n(A) Teoria do Big Bang\n(B) Teoria da Relatividade\n(C) Teoria das Cordas",
            "2. Qual invenção é atribuída a Nikola Tesla que transformou a eletricidade?\n(A) Corrente Alternada\n(B) Ressonância Magnética\n(C) Telefone",
            "3. Qual é o nome do processo em que uma célula se divide para formar duas células filhas idênticas?\n(A) Mitose\n(B) Meiose\n(C) Fissão Binária",
            "4. Qual é o nome do fenômeno em que o Sol parece desaparecer por trás da Lua?\n(A) Eclipse Solar\n(B) Eclipse Lunar\n(C) Alvorada",
            "5. Qual empresa desenvolveu o sistema operacional Android?\n(A) Apple\n(B) Google\n(C) Microsoft",
            "6. Qual é o nome da linguagem de programação criada para substituir o JavaScript em navegadores web?\n(A) TypeScript\n(B) Python\n(C) Ruby"
        };

        char[] respostasCorretas = {'A', 'A', 'B', 'A', 'B', 'A'};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("\n"+perguntas[i]);
            System.out.print("\nSua resposta: ");
            char resposta = sc1.next().toUpperCase().charAt(0);

            if (resposta == respostasCorretas[i]) {
                acertos++;
                System.out.println("\nResposta correta!");
            } else {
                erros++;
                System.out.println("\nResposta errada!");
            }

            if (erros == 3) {
                System.out.println("Você errou 3 vezes. Fim de jogo.");
                break;
            }

        }

        if (erros < 3) {
            System.out.println("\nParabéns! Você terminou o jogo.");
            System.out.println("Número de acertos: " + acertos + " de " + perguntas.length);
        }

    }

}
