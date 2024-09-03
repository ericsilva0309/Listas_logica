package com.logica.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

       // O programa irá fazer 3 perguntas e encaminhar ocliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
       // das condições a seguir ele deve ser encaminhado para a fila preferencial. As
      //  condições são: Ter mais de 65 anos, se deficiente ou gestante.

      int opcao;

      do{
        System.out.println("Selecione uma das opções abaixo:");
        System.out.println("1 - O paciente é gestante");
        System.out.println("2 - O paciente tem mais de 65 anos");
        System.out.println("3 - O paciente é deficiente");
        System.out.println("4 - Nenhuma das opções");
        opcao = sc1.nextInt();

      switch (opcao) {
        case 1:
        case 2:
        case 3:
            System.out.println("Você está na fila preferencial.");
            break;

        case 4:
            System.out.println("Você está na fila normal.");
            break;

        default:
            System.out.print("\033[H\033[2J\n");
            System.out.flush();
            System.out.println("Opção inválida. Por favor, selecione uma opção válida.\n");
            break;
    }
  } while (opcao < 1 || opcao > 4);

 }

}