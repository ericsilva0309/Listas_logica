package com.logica.lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        String usuarioCorreto = "eric123", senhaCorreta = "eric321", senha, login;
        double erro=0;
        int tentativasRestantes = 3;
        boolean acessoConcedido = false;

        while (tentativasRestantes > 0 && !acessoConcedido) {
            System.out.println("Digite seu login: ");
            login = sc1.nextLine();

            System.out.println("Digite sua senha: ");
            senha = sc1.nextLine();

            if (login.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                acessoConcedido = true;
            } else {
                tentativasRestantes--;

                if (!login.equals(usuarioCorreto)) {
                    System.out.println("Erro: Login incorreto.");
                }

                if (!senha.equals(senhaCorreta)) {
                    System.out.println("Erro: Senha incorreta.");
                }

                if (tentativasRestantes > 0) {
                    System.out.println("Você tem " + tentativasRestantes + " tentativas restantes.");
                    if (tentativasRestantes == 1) {
                        System.out.println("Última tentativa, mais um erro e seu acesso será bloqueado!");
                    }
                } else {
                    System.out.println("Acesso bloqueado após 3 tentativas erradas.");
                }
            }
        }

    }
}