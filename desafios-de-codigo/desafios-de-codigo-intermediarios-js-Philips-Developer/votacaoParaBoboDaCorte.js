// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

const c = parseInt(gets());
var v = new Array(c);
let rafael = true; //Declara rafael e inicializa com true


for (let i = 0; i < c; i++) { //For de i - Insere dados de entrada no array v
    v[i] = parseInt(gets());
}

const votosRafael = Number(v.shift()); //Remove primeiro elemento e atribui a votosRafael


for (let j = 0; j < c; j++) { //For de j - Percore o array e pega os votos de cada candidato, exceto de Rafael
    const votosDemaisCandidatos = Number(v[j]);

    if (votosRafael < votosDemaisCandidatos) { //Se votos do Rafael foram menores que algum dos demais candidatos
        rafael = false;
    }


};

print(rafael ? "S" : "N");