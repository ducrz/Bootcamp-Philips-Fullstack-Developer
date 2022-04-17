package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5Tabuada {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Número: ");
            int numero = teclado.nextInt();

            System.out.println("Tabuada de " + numero + ":");

            for (int i = 0; i <= 10; i = i + 1) {
                System.out.println(numero + " X " + i + " = " + (numero * i));
            }
            teclado.close();
        }
    }

