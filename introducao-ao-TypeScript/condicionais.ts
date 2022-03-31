interface IUsuario {
    id: string;
    email: string;
}

interface IAdmin extends IUsuario {
    cargo: 'gerente' | 'coordenador' | 'supervisor';
}

function redireciona(usuario: IUsuario | IAdmin) {
    if ('cargo' in usuario) { //Se existe cargo em usuario
        //Redireciona para Admin
    } else {
        //Redireciona para Área User
    }
}