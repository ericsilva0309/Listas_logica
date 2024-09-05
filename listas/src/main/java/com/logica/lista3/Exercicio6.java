package com.logica.lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Informe o número de andares da pirâmide: ");
        int andares = scanner.nextInt();

        // Este loop controla o número de linhas (andares) da pirâmide
        for (int i = 1; i <= andares; i++) {
            // 'i' começa em 1 e aumenta até o número total de andares.
            // Em cada iteração, uma nova linha (andar) da pirâmide é desenhada.
            
            // Loop para imprimir os espaços em branco antes dos asteriscos
            // O número de espaços diminui conforme o andar aumenta
            for (int j = 0; j < andares - i; j++) {
                // 'j' começa em 0 e vai até 'andares - i - 1'.
                // Isso cria a quantidade correta de espaços em branco antes de cada linha de asteriscos.
                // Exemplo: Se o número de andares for 5 e 'i' for 1, ele imprime 4 espaços em branco.
                System.out.print(" "); // Imprime um espaço em branco
            }

            // Loop para imprimir os asteriscos (*)
            // O número de asteriscos aumenta conforme o andar aumenta
            for (int k = 0; k < (2 * i - 1); k++) {
                // 'k' começa em 0 e vai até '2 * i - 2'.
                // A fórmula '2 * i - 1' gera o número correto de asteriscos para cada andar.
                // Exemplo: No andar 1, imprime 1 asterisco; no andar 2, imprime 3 asteriscos, etc.
                System.out.print("*"); // Imprime um asterisco
            }
        }

    }
}
