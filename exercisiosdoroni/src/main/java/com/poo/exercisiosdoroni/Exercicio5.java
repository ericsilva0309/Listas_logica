package com.poo.exercisiosdoroni;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {

        double hora, hora_extra, valor_hora = 10.00, valor_extra = 15.00;
        double total_hora, total_extra;

        System.out.println("Digite o total de horas trabalhadas no ano: ");
        Scanner sc1 = new Scanner(System.in);
        hora = sc1.nextInt();

        System.out.println("Digite o total de horas extras trabalhadas no ano: ");
        hora_extra = sc1.nextInt();

        total_hora = valor_hora * hora;
        total_extra = valor_extra * hora_extra; 

        System.out.println("Seu salário anual é de: "+(total_hora+total_extra));


        
    }

}
