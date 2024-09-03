package com.logica.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //Pessoas com menos de 16 anos não podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
        //responsáveis. Maiores de 18 podem entrar normalmente

        int idade;

        System.out.println("Digite sua idade: ");
        idade = sc1.nextInt();
        
        if(idade <= 15){
            System.out.print("\033[H\033[2J");
                System.out.flush();
            System.out.println("Menores de 16 não são permitidos.");
        }
        if(idade >= 16 && idade <= 17){
            System.out.print("\033[H\033[2J");
                System.out.flush();
            System.out.println("Necessário acompanhamento de um responsável.");
        }
        if (idade > 18) {
            System.out.print("\033[H\033[2J");
                System.out.flush();
            System.out.println("Entrada permitida.");
            
        }
    }

}