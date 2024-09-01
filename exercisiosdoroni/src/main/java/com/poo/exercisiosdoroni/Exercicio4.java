package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {

        int ano_nascimento, ano_futuro = 2035;

        System.out.println("Digite o ano que você nasceu: ");
        Scanner sc1 = new Scanner(System.in);
        ano_nascimento = sc1.nextInt();
        ano_futuro -= ano_nascimento;

        System.out.println("Sua idade em 2035 será: "+ano_futuro);
        
    }

}
