//Generic Types

function adicionaApendiceALista<T>(array: T[], valor: T) {
    return array.map(() => + valor);
}

adicionaApendiceALista([1, 2, 3], 5);