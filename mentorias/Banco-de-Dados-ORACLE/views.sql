/* Usando VIEW */

CREATE VIEW clienteInfo as
	SELECT (nome || '' || sobrenome) nomeCompleto,
		decode(sexo, 'M', 'Masculino','Feminino') Sexo,
		idade,
		email,
		cliente_id cliente
	
	FROM cliente;

SELECT * FROM clienteInfo;


CREATE VIEW enderecoCliente as

	SELECT('Cidade: ' || e.cidade || ',bairro: ' || e.bairro || ',rua: '|| e.rua) Endereco_Completo,
            e.cliente_id cliente,
            c.nomeCompleto	
	FROM endereco e,
		clienteInfo c
	
	WHERE e.cliente_id = c.cliente;


SELECT * from enderecoCliente;

DROP VIEW clienteInfo;


DROP VIEW enderecoCliente;
