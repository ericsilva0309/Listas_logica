package com.logica.lista3;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        int largura, altura;

        //perguntar a altura e largura
        System.out.println("Largura: ");
        largura = sc1.nextInt();
        
        System.out.println("Altura: ");
        altura = sc1.nextInt();

        //imprimir uma linha com a largura
        for (int j = 0; j < altura; j++) {
            for (int i = 0; i < largura; i++) {
                System.out.print("*");
            }
            System.out.println();    
        }
        
        //imprimir x linhas, onde x é a altura informada
        
    }

}
