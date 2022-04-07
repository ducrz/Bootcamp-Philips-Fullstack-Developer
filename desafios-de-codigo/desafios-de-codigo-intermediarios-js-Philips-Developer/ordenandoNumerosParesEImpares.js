// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalItems = parseInt(gets());
let pares = []; //Array de Pares
let impares = []; //Array de Impares

for (let i = 0; i < totalItems; i++) {
    let number = parseInt(gets());
    if (number % 2 == 0) { //Verifica se é par
        pares.push(number);
    }
    else { //Caso seja ímpar
        impares.push(number);
    }
}
pares.sort((a, b) => a - b); //Ordena em ordem crescente
impares.sort((a, b) => b - a); //Ordena em ordem decrescente

for (let i = 0; i < pares.length; i++) {
    print(pares[i]);
}
for (let i = 0; i < impares.length; i++) {
    print(impares[i]);
}