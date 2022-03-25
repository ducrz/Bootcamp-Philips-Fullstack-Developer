const DIO = "Digital Innovation One";

let firstName = "Eduardo";
let lastName = "Silva Monteiro";

let fullName = `Nome Completo: ${firstName} ${lastName}`;

console.log(fullName);

let nome = "Eduardo";
let sobrenome = "Monteiro";

//let nomeCompleto = nome + sobrenome;
let concatenado = nome.concat(sobrenome);

console.log(concatenado.length);


let exemplo = new String("texto"); //Objeto

console.log(typeof exemplo);

console.log(exemplo.length);

let vazio = ""; //String vazia

//Iterável

var nomeString = "Edu";

console.log(nomeString[1]);
console.log(nomeString.length);

concatenado = nome + "" + sobrenome;

console.log(concatenado);

concatenado = nome + "\n" + sobrenome;

console.log(concatenado);

concatenado = `${nome} ${sobrenome}`;

console.log(concatenado);

concatenado = `${nome} 
${sobrenome}`;

console.log(concatenado);

concatenado = "\"";
console.log(concatenado);

let frase = "Olá, tudo bem?";

console.log(frase.split(" "));

console.log(frase.includes("tudo"));

console.log(frase.startsWith("O"));

console.log(frase.startsWith("R"));

console.log(frase.endsWith("?"));


let stringModificada = frase.replace(",", "!");

console.log(stringModificada);












