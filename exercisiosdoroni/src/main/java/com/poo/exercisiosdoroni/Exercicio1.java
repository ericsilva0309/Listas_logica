package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {

        int n1, n2;

		System.out.print("Digite o primeiro numero: ");
		Scanner scanner1 = new Scanner(System.in);
		n1 = scanner1.nextInt();

		System.out.print("O primeiro número é: "+n1+"\n");

		System.out.print("Digite o segundo número: ");
		n2 = scanner1.nextInt();

		System.out.println("O segundo número é: "+n2);

		System.out.print("A soma dos números é: "+(n1 + n2));
        
    }

}
