package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura atual(celsius): ");
        Scanner sc1 = new Scanner(System.in);
        celsius = sc1.nextDouble();

        fahrenheit = (celsius*1.8)+32;
        
        System.out.println(celsius+" graus Celsius equivalem a "+fahrenheit+" graus Fahrenheit.");
        
    }

}
