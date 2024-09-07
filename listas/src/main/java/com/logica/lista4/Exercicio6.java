package com.logica.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        int opcao;

        do {
            System.out.println("1. Adicionar item");
            System.out.println("2. Ver lista");
            System.out.println("3. Remover item");
            System.out.println("4. Sair");
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
            } else if (opcao == 3) {
                System.out.println("Digite o nome do item a remover:");
                String item = scanner.nextLine();
                listaDeCompras.remove(item);
                System.out.println("Item removido!");
            }
        } while (opcao != 4);
    }
}
