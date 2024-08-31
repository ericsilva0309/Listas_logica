package com.logica.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //3) Escreva uma calculadora que receba um valor em reais e converta para dólar. Considere o valor do dólar a R$5,25.
        
        double real, dolar = 5.25;

        System.out.println("Escreva o valor em real(R$): ");
        real = sc1.nextDouble();

        dolar = real/dolar;

        System.out.printf("O valor em dólar é: %.2f"+dolar);
    }

}
