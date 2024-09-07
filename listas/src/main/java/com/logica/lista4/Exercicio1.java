package com.logica.lista4;

public class Exercicio1 {
    public static void resolucao() {

                // Criando um vetor (array) com os valores das vendas do dia
                double[] vendas = {150.0, 200.5, 340.8, 120.0, 50.0};
        
                // Variável para armazenar a soma das vendas
                double soma = 0;
        
                // Loop para somar todas as vendas
                for (int i = 0; i < vendas.length; i++) {
                    soma += vendas[i];  // Adiciona o valor da venda ao total
                }
        
                // Exibe a soma total das vendas
                System.out.println("Fechamento do dia (soma das vendas): R$ " + soma);
            }
    }
