interface ICachorro {
    nome: string;
    idade: number;
    parqueFavorito?: string;
}

type ICachorroSomenteLeitura = {
    +readonly [K in keyof ICachorro]-?: ICachorro[K];
}
/*
class MeuCachorro implements ICachorro {
    idade;
    nome;
    parqueFavorito;
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

const cao = new MeuCachorro('Dunga', 15);
*/
