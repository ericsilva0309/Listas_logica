package com.logica.lista3;
public class Aguarde {

    public static void aguarde(int segundos) {
        try {
            for (int i = 0; i < segundos; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}