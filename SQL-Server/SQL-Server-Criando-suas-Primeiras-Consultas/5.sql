use Ecommerce;

select *
from Clientes;

--Inserindo Chave Prim�ria
alter table Clientes add constraint pk_cliente primary key(Codigo);

--insert Clientes values(1, 'Julio', 'J', getDate());



select * from PedidoItem;

--insert PedidoItem values(2,2, 10.5, 1);

select * from Pedido;

select * from PedidoItem;

-- Chave estrangeira � sempre c�pia de uma chave prim�ria, de mesmo tipo e mesma quantidade
alter table PedidoItem add constraint fk_pedido foreign key(CodigoPedido) references Pedido (Codigo);

