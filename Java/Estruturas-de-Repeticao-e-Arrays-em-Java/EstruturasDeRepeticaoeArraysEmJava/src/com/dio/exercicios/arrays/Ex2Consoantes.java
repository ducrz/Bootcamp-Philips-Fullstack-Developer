package com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2Consoantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int cont = 0;
        do {
            System.out.println("Letra: ");
            String letra = teclado.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[cont] = letra;
                quantidadeConsoantes++;
            }
            cont++;

        } while(cont < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);

        teclado.close();
    }
}
