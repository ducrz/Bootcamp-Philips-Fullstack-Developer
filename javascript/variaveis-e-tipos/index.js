/* 
Diferença entre Var e Let
*/

//Hoisting com VAR

numberOne = 1;

console.log(numberOne + 2);

var numberOne;


//Hoisting com LET - Não Funciona

//numberTwo = 1;

//console.log(numberTwo + 2);

//let numberTwo;

//Let / Var

var firstName = "Eduardo";
let lastName = "Monteiro";

if (firstName === "Eduardo") {
    var firstName = "Edu";
    lastName = "Silva Monteiro"; //Reatribuindo

    console.log(lastName);

}

console.log(firstName, lastName);
