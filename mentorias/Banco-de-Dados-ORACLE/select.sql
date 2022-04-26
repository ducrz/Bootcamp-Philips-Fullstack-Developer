/* Uso do Select */

SELECT c.cliente_id, c.nome, c.sobrenome, c.idade
FROM cliente c
WHERE c.idade >= 23;


SELECT *
FROM cliente c
WHERE c.sobrenome = 'Silva';


SELECT c.nome, c.sobrenome
FROM cliente c
WHERE c.cliente_id =3
OR c.email = 'lucasrosa@email.com';



SELECT c.cliente_id, (c.nome || '' || c.sobrenome) nomeCompleto, c.sexo, e.rua, e.bairro, e.cidade
FROM cliente c,
     endereco e
WHERE c.cliente_id = e.cliente_id
AND c.sexo='M'
ORDER BY e.cidade;

SELECT c.sobrenome,
	count(c.sobrenome) total
FROM cliente c
GROUP BY c.sobrenome;

SELECT c.sobrenome
FROM cliente c
WHERE c.sobrenome in ('Rosa', 'Pereira');


SELECT MIN(c.idade)
FROM cliente c;

SELECT MAX(c.idade)
FROM cliente c;

SELECT c.nome, LENGTH(c.nome), SUBSTR(c.nome, 1,4), UPPER(c.nome), LOWER(C.NOME)
FROM cliente c
ORDER BY c.cliente_id;


