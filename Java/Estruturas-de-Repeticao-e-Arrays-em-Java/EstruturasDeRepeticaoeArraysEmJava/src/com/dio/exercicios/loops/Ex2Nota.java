package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota de 0 a 10: ");
        int nota = teclado.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite Novamente! Nota: ");
            nota = teclado.nextInt();
        }

        System.out.println("Nota: " + nota);
        teclado.close();
    }
}
