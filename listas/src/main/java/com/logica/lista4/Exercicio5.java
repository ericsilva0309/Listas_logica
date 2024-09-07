package com.logica.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        int opcao;

        do {
            System.out.println("1. Adicionar item");
            System.out.println("2. Ver lista");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.println("Digite o nome do item:");
                String item = scanner.nextLine();
                listaDeCompras.add(item);
                System.out.println("Item adicionado!");
            } else if (opcao == 2) {
                System.out.println("Lista de compras:");
                for (String item : listaDeCompras) {
                    System.out.println("- " + item);
                }
            }
        } while (opcao != 3);

    }
}
