// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalDeDias = parseInt(gets());

let qtdAnos, qtdMeses;

qtdAnos = parseInt(totalDeDias / 365);
totalDeDias = totalDeDias % 365;

qtdMeses = parseInt(totalDeDias / 30);
totalDeDias = totalDeDias % 30;

let resultado = (qtdAnos + " ano(s) " + '\n' +
    qtdMeses + " mes(es)" + '\n' +
    totalDeDias + " dia(s)");

print(resultado);