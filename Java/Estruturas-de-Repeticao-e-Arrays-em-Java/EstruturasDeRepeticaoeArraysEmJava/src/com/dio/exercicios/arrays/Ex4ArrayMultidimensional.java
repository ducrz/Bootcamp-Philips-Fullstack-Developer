package com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        int menor = Integer.MIN_VALUE;
        int linha = 0, coluna = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);

                if (M[i][j] < menor) {
                    menor = M[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("\nMatriz");
        for (int[] linhaM: M) {
            for (int colunaM : linhaM) {
                System.out.print(colunaM + " ");
            }
            System.out.println();
        }
    }
}
