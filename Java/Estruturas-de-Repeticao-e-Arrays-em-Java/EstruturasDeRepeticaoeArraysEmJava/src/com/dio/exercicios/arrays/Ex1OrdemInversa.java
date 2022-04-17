package com.dio.exercicios.arrays;

public class Ex1OrdemInversa {
    public static void main(String[] args) {
        int[] array = {0, -5, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int cont = 0;
        while (cont < (array.length)) {
            System.out.print(array[cont] + " ");
            cont++;
        }


        System.out.println("\nVetor: ");
        for (int i = (array.length -1); i >= 0; i-- ) {
            System.out.print(array[i] + " ");
        }
    }
}
