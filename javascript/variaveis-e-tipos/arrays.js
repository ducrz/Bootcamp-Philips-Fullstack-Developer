let array = []; //Array vazio

array.push(3); //Adiciona no final da lista

console.log(array);

array.push(2);
console.log(array);

array.pop(); //Tira o último elemento
console.log(array);

array.push(2);
array.push(5);

array.shift(); //Tira o primeiro elemento

array.unshift(1); //Adiciona no início da lista

console.log(array);

for (let i = 0; i < array.length; i++) {
    console.log(array[i]);
}

array.includes(3);

array.every(item => item === 5);

array.some(item => item => 5);

array.reverse();

