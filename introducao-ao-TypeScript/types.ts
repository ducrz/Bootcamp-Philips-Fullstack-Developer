/*
type iAnimal = {
    nome: string,
    tipo: 'terrestre' | 'aquático',
    domestico: boolean;

}

interface IFelino extends IAnimal {
    visaoNoturna: boolean;
}
interface ICanino extends IAnimal {
    visaoNoturna: boolean;
    porte: 'pequeno' | 'medio' | 'grande'
}

type IDomestico = IFelino | ICanino;

const animal: IDomestico = {
    domestico: true,
    nome: 'cachorro',
    porte: 'pequeno',
    tipo: "terrestre"

}

*/