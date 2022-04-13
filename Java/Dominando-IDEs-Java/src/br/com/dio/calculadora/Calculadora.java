package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a= teclado.nextDouble();

        System.out.println("Digite o segundo valor: ");
        b= teclado.nextDouble();

        double somar = somar(a, b);

        double subtrair = subtrair(a, b);

        double multiplicar = multiplicar(a, b);

        double divisao = divisao(a, b);

        System.out.println();

        System.out.println("Soma: "+somar);
        System.out.println("Subtração: "+subtrair);
        System.out.println("Multiplicação: "+multiplicar);
        System.out.println("Divisão: "+divisao);


    }

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double divisao(double  a, double  b){
        return a / b;
    }

}
