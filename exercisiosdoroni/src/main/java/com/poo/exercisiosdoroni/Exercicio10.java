package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio10 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        int segundossc, segundos, minuto, hora;

        System.out.println("Digite a hora em segundos: ");
        segundossc = sc1.nextInt();

        hora = segundossc/3600;
        minuto = (segundossc%3600)/60;
        segundos = segundossc%60;

        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundos);
        
    }

}
