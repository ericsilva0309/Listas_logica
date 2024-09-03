package com.logica.lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
        //algum deles estiver errado o programa deve retornar ao usuário quais das opções
        //está errada, se é o login ou a senha.

        String usuario = "leogamer123", senha = "leozin312", opcao1, opcao2;

        System.out.println("Digite o usuário: ");
        opcao1 = sc1.nextLine();

        System.out.println("Digite a senha: ");
        opcao2 = sc1.nextLine();

        if (opcao1.equals(usuario) && opcao2.equals(senha)) {
            System.out.println("Bem-vindo ao sistema!");
        } else {
           System.out.println("Usuario ou senha incorreto.");
        }
    }
}