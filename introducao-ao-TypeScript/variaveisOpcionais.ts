interface IUsuario {
    id: string,
    email: string,
    cargo?: 'funcionário' | 'gerente' | 'coordenador' | 'supervisor'; //Dado Opcional
}

function redirecione(usuario: IUsuario) {

    if (usuario.cargo) {
        //redirecionar(usuario.cargo);
    }
    else {
        //Redirecionar para a área do USER
    }

}