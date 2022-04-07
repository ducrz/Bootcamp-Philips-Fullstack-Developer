# Desafios de Código Intermediários Js - Philips Developer - DIO

## Idade em Dias

### Desafio 1

Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 

### Entrada

O arquivo de entrada contém um valor inteiro.

### Saída

Imprima a saída conforme exemplo fornecido.

```javascript
// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalDeDias = parseInt(gets());

let qtdAnos, qtdMeses;

qtdAnos = parseInt(          );
totalDeDias= totalDeDias %       ;

qtdMeses= parseInt(             );
totalDeDias=                            ;

let resultado = (qtdAnos + " ano(s) " + '\n' + 
qtdMeses +" mes(es)" + '\n' +
totalDeDias + " dia(s)");

print(resultado);
```

## Ordenando Números Pares e Ímpares

### Desafio 2

Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

    Primeiro os Pares
    Depois os Ímpares

Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

### Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

### Saída

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

```javascript
// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalItems = parseInt(gets());
let pares = [];
let impares = [];

for (let i = 0; i <          ; i++) {
  let number = parseInt(gets());
  if (              ){
    pares.push(number);
  }
  else {
    impares.push(number);
  }
}
pares.sort((a, b) =>       );
impares.sort((a, b) =>        );

for(let i = 0; i < pares.length;i++){
  print(        )
}
for(let i = 0; i < impares.length;i++){
  print(          )
}

```


## Votação para Bobo da Corte

### Desafio 3

O Império dos Artificialistas é governado por um generoso Monarca. A personalizada do Monarca é conhecida por todo o mundo, principalmente por sua forma como valoriza o bom humor de seu povo, que tem o direito a diversidade cultura. Um dos destaques fica a cargo do bobo da corte, eleito anualmente em um concurso internacional.

O jovem Rafael é um comediante promissor, que sonha em se tornar o bobo da corte nesse grande concurso. Para isso, ele vem se preparando com muita dedicação há vários meses. Chegada a época do concurso do bobo da corte, um total de N candidatos se inscreveram, e como Rafael sabia que ser o primeiro candidato a se inscrever torna-se critério de desempate, foi o primeiro a se inscrever! O concurso dará apenas 5 minutos para cada participante e no final cada cidadão dará seu voto ao futuro bob da corte que achar melhor.

Sendo assim, após a votação, resta apenas apurar os resultados, que será realizado por urna eletrônica com N inteiros, correspondentes ao total de votos em cada candidato, ordenado pela ordem de inscrição. Sua missão é determinar se o jovem Rafael foi eleito ou não.

### Entrada

A primeira linha da entrada contém um inteiro N (2 ≤ N ≤ 104). As N linhas seguintes conterão N inteiros positivos v 1 , . . . , vN , um em cada linha, correspondentes ao número de votos recebido por cada um dos candidatos, em ordem de inscrição. Sabendo-se que a população total é de 100.000 pessoas, o número total de votos não será superior a este valor.

### Saída

Seu programa produzirá apenas uma linha contendo o caractere ‘S’ se o jovem Rafael foi o eleito para bobo da corte, ou o caractere ‘N’ caso contrário.

```javascript
// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

const c = parseInt(gets());
var v = new Array(c);

for (let i = 0; i < c; i++){
  v[i] = parseInt(gets());
}

let  primeiroInscrito = true;

const teste  = Number(v.shift());


for(              ) {
  const bobo  = Number(v[i]);

  if (              ) {
    primeiroInscrito = false;
  }
};

print(primeiroInscrito ? "S" : "N");

```