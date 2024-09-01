package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {

        double dividendo, divisor, resto, quociente;

        System.out.println("Digite o dividendo: ");
        Scanner sc1 = new Scanner(System.in);
        dividendo = sc1.nextDouble();

        System.out.println("Digite o divisor: ");
        divisor = sc1.nextDouble();

        resto = dividendo%divisor;
        quociente = dividendo/divisor ;

        System.out.println("Dividendo =  "+dividendo);
        System.out.println("Divisor =  "+divisor);
        System.out.printf("Quociente = "+quociente);
        System.out.print("\nResto =  "+resto);
        
    }

}
