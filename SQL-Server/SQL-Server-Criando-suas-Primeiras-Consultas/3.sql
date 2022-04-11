use Ecommerce;

select * from Clientes;

--Com o Into
insert into Clientes (codigo,nome,TipoPessoa) values (1,'Eduardo', 'F');

--Sem o Into
insert Clientes (codigo,nome,TipoPessoa) values (2,'Eduardo', 'F');

-- Ordem invertida
insert Clientes (TipoPessoa, codigo, nome) values ('F', 3, 'Eduardo');


--Sem as Colunas
insert into Clientes values (4,'Eduardo', 'F');

insert into Clientes values (5, 'Eduardo', 'F'),(6, 'Eduardo', 'J');

select * from Clientes;


select Nome from Clientes;


select * from Clientes where TipoPessoa = 'J';

update Clientes set Codigo = 7, Nome='José' where TipoPessoa = 'J';

select Nome from Clientes;

-- Update sem Where - NUNCA PODE OCORRER

select * from Clientes;


delete
from Clientes
where Codigo in(5,4,3,2);

select * from Clientes;


select *
from Clientes
WHERE Codigo=7
AND TipoPessoa = 'J';


select *
from Clientes
WHERE Codigo=1
OR TipoPessoa = 'J';
