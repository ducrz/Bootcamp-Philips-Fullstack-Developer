package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		System.out.println("Hello World! "+" Soma = "+(a+b));

		//Criando Objetos
		
		Gato gato = new Gato(null, null, b);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}

}

class Livros{
	private String nome;
	private String npag;
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + "]";
	}	
	
	
	
}
