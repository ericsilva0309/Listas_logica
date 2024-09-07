package com.logica.lista4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);
        
        // Duas listas: uma para armazenar os itens e outra para os preços
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        int opcao;

        // Estrutura de repetição para o menu
        do {
            // Exibindo o menu de opções
            System.out.println("1. Adicionar item e preço");
            System.out.println("2. Ver lista com preços");
            System.out.println("3. Ver lista por ordem de preço (crescente)");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha após a escolha da opção

            if (opcao == 1) {
                System.out.println("Digite o nome do item:");
                String item = scanner.nextLine();
                listaDeCompras.add(item);

                System.out.println("Digite o preço do item:");
                double preco = scanner.nextDouble();
                precos.add(preco);  // Adiciona o preço à lista

                System.out.println("Item e preço adicionados!");
            
            // Condicional para exibir a lista de compras com os preços
            } else if (opcao == 2) {
                System.out.println("Lista de compras com preços:");
                // Percorre a lista e exibe os itens e seus respectivos preços
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.println("- " + listaDeCompras.get(i) + ": R$ " + precos.get(i));
                }
            
            // Condicional para ordenar e exibir a lista por ordem de preço (crescente)
            } else if (opcao == 3) {
                imprimirListaOrdenada(listaDeCompras, precos);  // Chama o método para ordenar e imprimir a lista
            }
        } while (opcao != 4);
    }

    // Método que imprime a lista de compras em ordem crescente de preços
    private static void imprimirListaOrdenada(ArrayList<String> listaDeCompras, ArrayList<Double> precos) {
        // Cria cópias das listas originais para ordenar sem modificar as listas originais
        ArrayList<String> listaOrdenada = new ArrayList<>(listaDeCompras);
        ArrayList<Double> precosOrdenados = new ArrayList<>(precos);

        // Laço de repetição para ordenar as listas usando um método simples (bubble sort)
        for (int i = 0; i < precosOrdenados.size(); i++) {
            for (int j = i + 1; j < precosOrdenados.size(); j++) {
                // Se o preço atual for maior que o próximo, troca de lugar
                if (precosOrdenados.get(i) > precosOrdenados.get(j)) {
                    // Troca os preços
                    double tempPreco = precosOrdenados.get(i);
                    precosOrdenados.set(i, precosOrdenados.get(j));
                    precosOrdenados.set(j, tempPreco);

                    // Troca os itens correspondentes
                    String tempItem = listaOrdenada.get(i);
                    listaOrdenada.set(i, listaOrdenada.get(j));
                    listaOrdenada.set(j, tempItem);
                }
            }
        }

        // Exibimos a lista ordenada
        System.out.println("Lista de compras ordenada por preço (crescente):");
        for (int i = 0; i < listaOrdenada.size(); i++) {
            System.out.println("- " + listaOrdenada.get(i) + ": R$ " + precosOrdenados.get(i));
        }
    }
}
