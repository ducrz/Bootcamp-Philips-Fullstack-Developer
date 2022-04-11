use Ecommerce;

select * from Clientes;

select * from Produtos;

insert Produtos values(1, 'Caneta', 'Caneta Preta', 1.50);
insert Produtos values(2, 'Caderno', 'Caderno Universitário', 20.99);

select * from Produtos;

select * from Pedido;

insert Pedido values(1, getDate(), 0, 3, 7);

Insert Pedido values(2, getDate(), 0, 22.49, 1);



select * from Pedido;


select * from PedidoItem;

insert PedidoItem values(1, 1, 1.5, 2);

insert PedidoItem values(2, 1, 1.5, 1);

insert PedidoItem values(2, 2, 20.99, 1);


select * from Pedido;
select * from PedidoItem;


select * from Clientes;

insert Clientes (Codigo, Nome, TipoPessoa) values(2, 'João', 'F');


select ISNULL(DataCriacao, getDate()), *
from Clientes;


select *, 
			case 
				when TipoPessoa = 'J' then 'Jurídica'
				when TipoPessoa = 'F' then 'Física'
				else 'Pessoa Indefinida'
			end;
from Clientes;


select * from Pedido;


select *, CONVERT(varchar, DataSolicitacao, 103)
from Pedido;

select *, 
			case 
				when TipoPessoa = 'J' then 'Jurídica'
				when TipoPessoa = 'F' then 'Física'
				else 'Pessoa Indefinida'
			end+CONVERT(varchar, GETDATE(), 103)
from Clientes;
