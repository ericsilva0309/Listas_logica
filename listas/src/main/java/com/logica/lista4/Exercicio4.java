package com.logica.lista4;

public class Exercicio4 {
    public static void resolucao() {
        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};

        int contadorPares = 0;

        // Percorrendo a lista para contar os números pares
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {  // Verifica se o número é par
                contadorPares++;
            }
        }

        // Exibe a quantidade de números pares
        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}

