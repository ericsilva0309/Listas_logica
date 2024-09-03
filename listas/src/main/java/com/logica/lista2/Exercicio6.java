package com.logica.lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        //Se o aluno ficar com média acima de 6 nas 2 primeiras
        //provas ele passou. Senão o programa deverá perguntar a nota de recuperação
       // que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
        //somente para os alunos que precisarem.

        double nota1, nota2, media, nota_recuperacao;

        System.out.println("Digite a sua primeira nota: ");
        nota1 = sc1.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        nota2 = sc1.nextDouble();

        media = (nota1+nota2)/2;

        if (media >= 6) {
            System.out.println("Parabéns, você passou com média: " + media);
        } else {
            System.out.println("Você não atingiu a média mínima. Sua média atual é: " + media);
            System.out.println("Digite a nota da prova de recuperação:");

          nota_recuperacao = sc1.nextDouble();

            if (nota1 < nota2) {
                nota1 = nota_recuperacao;
            } else {
                nota2 = nota_recuperacao;
            }

            media = (nota1 + nota2) / 2;

            if (media >= 6) {
                System.out.println("Você passou na recuperação! Sua média final é: " + media);
            } else {
                System.out.println("Você não passou. Sua média final é: " + media);
            }
        }
    }
}