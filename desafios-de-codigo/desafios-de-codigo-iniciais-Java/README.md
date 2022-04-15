# Desafios de Código Iniciais Java Js - Philips Developer - DIO

## Multiplicação Simples

### Desafio 1

Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

### Entrada

A entrada contém 2 valores inteiros.

### Saída

Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD =    ; //implemente o código que representa a multiplicação.
		
		System.out.println("PROD = " +     );
		
		sc.close();
		
	}
}

```

## Pink e Cérebro

### Desafio 2

Pink e Cérebro dividem um apartamento e estão juntos 24h por dia desde o começo da pandemia. Para passar o temp, Pink cria problemas matemáticos para Cérebro resolver, o último deles foi uma lista de números com a seguinte pergunta: quantos números da lista são múltiplos de 2, 3, 4 e 5?

Apesar de parecer simples, porém, quando a lista contém muitos números, Cérebro se confunde e acaba errando alguns cálculos.

Ajude Cérebro a resolver o desadio de Pink.

### Entrada

A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Pink.

A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Pink.


### Saída

Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente.

```java
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int multiplosDe2 = 0, multiplosDe3 = 0, multiplosDe4 = 0, multiplosDe5 = 0;

        for (int i = 0; i < n; i++) {
            int li = sc.nextInt();
            if (li % 2 == 0) {
                multiplosDe2++;
            }
            if (li % 3 == 0) {
                multiplosDe3++;
            }
            //TODO: Complete a solução criando as condições e incrementos para os múltiplos de 4 e 5.
        }

        System.out.printf("%d Multiplo(s) de 2\n", multiplosDe2);
        System.out.printf("%d Multiplo(s) de 3\n", multiplosDe3);
        System.out.printf("%d Multiplo(s) de 4\n", multiplosDe4);
        System.out.printf("%d Multiplo(s) de 5\n", multiplosDe5);

    }
}

```


## Quadrado e ao Cubo

### Desafio 3

Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

### Entrada

O arquivo de entrada contém um número inteiro positivo N.


### Saída

Imprima a saída conforme o exemplo fornecido.


```java
import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N; i++) {
            //TODO: Complete os espaços em branco para obter o quadrado e o cubo de "i".
            int iAoQuadrado = (int) Math.pow(     ,     );
            int iAoCubo = (int) Math.pow(     ,     );
            System.out.println(i + " " +        + " " +        );
        }
    }

}

```