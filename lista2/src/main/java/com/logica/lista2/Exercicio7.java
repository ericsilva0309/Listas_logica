package com.logica.lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
        //um determinado número informado pelo usuário é divisível por X (Que também
        //deve ser informado pelo usuário)

        double dividendo, divisor, resultado;

        System.out.println("digite o número que deseja dividir: ");
        dividendo = sc1.nextDouble();

        System.out.println("Agora digite o seu divisor: ");
        divisor = sc1.nextDouble();

        resultado = dividendo/divisor;

        if (dividendo %divisor == 0) {
            System.out.printf("%.1f é divisivel por %.1f%nO resultado da divisão é %.1f",dividendo,divisor,resultado);
            
        }else{
            System.out.printf("%.1f não é divisivel por %.1f",dividendo,divisor);
        }
        
    }

}
