package com.logica.lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //8) Suponha que voce trabalhe em um laboratório e seu colega mediu a temperatura de um objeto em Fahrenheit. Escreva um programa capaz de converter em Celsius.

        int fahrenheit = 50, celsius, opcao;

        if (fahrenheit > 40) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.printf("xxxxxxx CUIDADO! xxxxxxx %nEste objeto está a %dF !!%n", fahrenheit);
            System.out.print("xxxxxxxxxxxxxxxxxxxxxxxx\n\n");
            
            do {
                System.out.println("Deseja converter mesmo assim?");
                System.out.print("1 - Sim\n2 - Não\n");
                opcao = sc1.nextInt();

                switch (opcao) {
                    case 1:
                        celsius = (fahrenheit - 32) * 5 / 9;
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        System.out.printf("A temperatura convertida para Celsius é = %d Graus%n%nPrograma encerrado.%n", celsius);
                        break;

                    case 2:
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Opção inválida. Tente novamente.\n");
                        break;
                }
            } while (opcao != 2); // Continua até que a opção 2 seja escolhida
        }


    }

}