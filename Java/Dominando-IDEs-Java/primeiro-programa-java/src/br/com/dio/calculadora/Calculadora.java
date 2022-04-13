package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o Primeiro Valor");
		a = teclado.nextDouble();
		
		System.out.println("Digite o segundo valor");
		b = teclado.nextDouble();
		
		double soma= soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Soma= "+soma);
		System.out.println("Subtração= "+subtracao);
		System.out.println("Multiplicação= "+multiplicacao);
		System.out.println("Divisão= "+divisao);
		
		teclado.close();
		
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

	public  static double multiplicacao(double a, double b) {
		return a * b;
	}

	public  static double subtracao(double a, double b) {
		return a - b;
	}

	public  static double soma(double a, double b) {
		return a + b;
	}	
	
	
}

