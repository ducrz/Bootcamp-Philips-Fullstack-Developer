/* Criando Tabelas cliente e endereco */
CREATE TABLE cliente
(
    cliente_id number(10) NOT NULL,
    nome varchar2(100) NOT NULL,
    sobrenome varchar2(100) NOT NULL,
    idade number(3),
    sexo varchar(1),
    email varchar2(100),
    CONSTRAINT cliente_pk PRIMARY KEY (cliente_id)
);

CREATE TABLE endereco
(
    endereco_id number(19) NOT NULL,
    cidade varchar2(100) NOT NULL,
    bairro varchar2(100) NOT NULL,
    rua varchar2(100) NOT NULL,
    cliente_id number(10) NOT NULL,
    CONSTRAINT endereco_pk PRIMARY KEY (endereco_id),
    CONSTRAINT cliente_fk
        FOREIGN KEY (cliente_id)
        REFERENCES cliente(cliente_id)

);

SELECT * FROM cliente;

SELECT * FROM endereco;


/* Inserindo Clientes */

INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(1, 'Carlos', 'Silva',42, 'M', 'carlossilva@email.com' );

INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(2, 'Matheus', 'Pereira',18, 'M', 'mateuspereira@email.com' );

INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(3, 'Ana', 'Silva',23, 'F', 'anasilva@email.com' );

INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(4, 'Maria', 'Oliveira',37, 'F', 'mariaoliveira@email.com' );

INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(5, 'Lucas', 'Rosa',26, 'M', 'lucasrosa@email.com' );

INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(6, 'Luan', 'Coelho',16, 'M', 'luancoelho@email.com' );

SELECT * FROM cliente;

/* Inserindo Endereços */
INSERT INTO endereco
(endereco_id, cidade, bairro, rua, cliente_id)
VALUES
(1,'São Paulo', 'Pinheiros', 'Sebastião Velho', 1 );

INSERT INTO endereco
(endereco_id, cidade, bairro, rua, cliente_id)
VALUES
(2,'São Paulo', 'Pinheiros', 'Artur de Azevedo', 2 );

INSERT INTO endereco
(endereco_id, cidade, bairro, rua, cliente_id)
VALUES
(3,'São Paulo', 'Vila Medeiros', 'Ataliba Vieira', 3 );

INSERT INTO endereco
(endereco_id, cidade, bairro, rua, cliente_id)
VALUES
(4,'São Paulo', 'Vila Medeiros', 'Alves Porto', 4 );

INSERT INTO endereco
(endereco_id, cidade, bairro, rua, cliente_id)
VALUES
(5,'Florianópolis', 'Centro', 'São Francisco', 5 );

INSERT INTO endereco
(endereco_id, cidade, bairro, rua, cliente_id)
VALUES
(6,'Florianópolis', 'Santa Mônica', 'Zenon Fernandes', 6 );

SELECT * FROM endereco;

