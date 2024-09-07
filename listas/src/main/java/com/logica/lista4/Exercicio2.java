package com.logica.lista4;

public class Exercicio2 {
        public static void resolucao() {
            double[] vendas = {150.0, 200.5, 340.8, 120.0, 50.0};
    
            // Inicializamos o maior e menor valor como o primeiro elemento do vetor
            double maior = vendas[0];
            double menor = vendas[0];
    
            // Percorremos o vetor para encontrar o maior e o menor valor
            for (int i = 1; i < vendas.length; i++) {
                if (vendas[i] > maior) {
                    maior = vendas[i];  // Atualiza o maior valor
                }
                if (vendas[i] < menor) {
                    menor = vendas[i];  // Atualiza o menor valor
                }
            }
    
            // Exibe o maior e menor valor
            System.out.println("Maior valor de compra: R$ " + maior);
            System.out.println("Menor valor de compra: R$ " + menor);
        }
    }

