package com.logica.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        //5) Construa um algoritmo que calcule o valor de um terreno baseado na sua área e valor por m2.

        double valor_metro2, area, largura, comprimento, valorTerreno ;

        System.out.print("Informe a largura do terreno (em metros): ");
        largura = scanner.nextDouble();
        
        System.out.print("Informe o comprimento do terreno (em metros): ");
        comprimento = scanner.nextDouble();
        
        System.out.print("Informe o valor por metro quadrado (em reais): ");
        valor_metro2 = scanner.nextDouble();
        
        area = largura * comprimento;
        
        valorTerreno = area * valor_metro2;
        
        System.out.printf("A área do terreno é: %.2f metros quadrados%n", area);
        System.out.printf("O valor do terreno é: R$ %.2f%n", valorTerreno);
        
        
    }

}
