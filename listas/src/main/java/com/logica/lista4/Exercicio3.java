package com.logica.lista4;

public class Exercicio3 {
    public static void resolucao() {
        double[] vendas = {150.0, 200.5, 340.8, 120.0, 50.0};

        double soma = 0;

        // Somando todas as vendas
        for (int i = 0; i < vendas.length; i++) {
            soma += vendas[i];
        }

        // Calculando o ticket médio
        double ticketMedio = soma / vendas.length;

        // Exibindo o ticket médio
        System.out.println("Ticket médio de vendas: R$ " + ticketMedio);
    }
}
