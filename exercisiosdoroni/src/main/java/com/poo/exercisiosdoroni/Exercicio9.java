package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio9 {
    public static void resolucao() {
    
    double distancia, gasto, media;

    System.out.println("Digite a distancia percorrida(em KM): ");
    Scanner sc1 = new Scanner(System.in);
    distancia = sc1.nextDouble();

    System.out.println("Digite a quantidade de litros usada: ");
    gasto = sc1.nextDouble();

    media = distancia/gasto;
    System.out.printf("O consumo médio do carro é de %.2f km/l.%n", media);
    }

}
