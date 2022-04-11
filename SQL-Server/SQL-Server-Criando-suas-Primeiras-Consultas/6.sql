use Ecommerce;

select * from Clientes;


select * from Produtos;
select * from PedidoItem;


select * from Pedido;


alter table Pedido add CodigoStatus int;
alter table Pedido add DescStatus varchar(50);


update Pedido set CodigoStatus = 1, DescStatus='Em Andamento';

select * from Pedido;

select * from Status;



