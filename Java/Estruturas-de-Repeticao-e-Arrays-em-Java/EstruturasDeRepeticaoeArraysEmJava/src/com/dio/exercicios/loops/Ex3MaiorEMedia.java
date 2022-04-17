package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3MaiorEMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double maior = 0;
        double soma = 0;


        int count = 0;

        do {
            System.out.println("Número: ");
            double numero = teclado.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            soma = soma + numero;
            count = count + 1;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma / 5);
        teclado.close();
    }

}
