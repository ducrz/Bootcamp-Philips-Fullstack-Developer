use Ecommerce;

create table Produtos(

	Codigo int,
	Nome varchar(100),
	Descricao varchar(200),
	Preco float
)

create table Clientes(
	Codigo int NOT NULL,
	Nome varchar(200) NOT NULL,
	TipoPessoa char(1) NOT NULL
)

create table Pedido(
	Codigo int NOT NULL,
	DataSolicitacao datetime not null,
	FlagPago bit not null,
	TotalPedido float not null,
	CodigoCliente int not null
)
create table PedidoItem(
	CodigoPedido int NOT NULL,
	CodigoProduto int not null,
	Preco float not null,
	Quantidade int not null
)