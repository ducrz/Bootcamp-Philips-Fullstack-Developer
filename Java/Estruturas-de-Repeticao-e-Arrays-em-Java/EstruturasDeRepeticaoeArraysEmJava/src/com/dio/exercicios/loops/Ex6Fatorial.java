package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Número: ");
        int fatorial = teclado.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial+ "!=");

        for(int i = fatorial; i > 0; i--) {
            multiplicacao *= i;

            if (i != 1) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + "=" + (multiplicacao));
            }
        }
        teclado.close();
    }
}
