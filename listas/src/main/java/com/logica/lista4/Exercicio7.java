package com.logica.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("1. Adicionar item e preço");
            System.out.println("2. Ver lista com preços");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.println("Digite o nome do item:");
                String item = scanner.nextLine();
                listaDeCompras.add(item);

                System.out.println("Digite o preço do item:");
                double preco = scanner.nextDouble();
                precos.add(preco);

                System.out.println("Item e preço adicionados!");
            } else if (opcao == 2) {
                System.out.println("Lista de compras com preços:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.println("- " + listaDeCompras.get(i) + ": R$ " + precos.get(i));
                }
            }
        } while (opcao != 3);
    }
}
