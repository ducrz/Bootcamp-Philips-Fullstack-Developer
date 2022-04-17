package com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class Ex1NomeEIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = teclado.next();

            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = teclado.nextInt();

            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
        teclado.close();
    }
}