package com.logica.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //6) Construa um algoritmo que leia 1- a distância percorrida por um veículo em km 2- o total gasto em combustível em litros. No final deverá ser respondido o consumo médio deste veículo em km/l.
        
        double distancia, litro, media;

        System.out.println("Digite a distância percorrida(em KM): ");
        distancia = sc1.nextDouble();

        System.out.println("Digite a quantidade de litros gasta: ");
        litro = sc1.nextDouble();

        media = distancia/litro;

        System.out.printf("O consumo médio do carro é de %.2f km/l.%n", media);
    }

}
