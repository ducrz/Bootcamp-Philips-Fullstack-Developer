package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4ParEImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int quantidadeDeNumeros = teclado.nextInt();

        int quantPar = 0, quantImpar = 0;

        int count = 0;

        do {
            System.out.println("Número: ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0){ //Se é par
                quantPar++;
            }else{ //Caso seja impar
                quantImpar++;
            }

            count++;
        } while (count < quantidadeDeNumeros);

        System.out.println("Quantidade Pares: " + quantPar);
        System.out.println("Quantidade Ímpares: " + quantImpar);
        teclado.close();
    }
}
