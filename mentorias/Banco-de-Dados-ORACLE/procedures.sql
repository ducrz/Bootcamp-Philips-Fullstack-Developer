/* Procedures */
CREATE OR REPLACE PROCEDURE atualizarNomeCliente(cliente_p number, nome_p varchar, sobrenome_p varchar)
is
qtd number(1);

BEGIN
	SELECT count(*)
	INTO qtd
	FROM cliente
	WHERE cliente_id = cliente_p;
	
	if(qtd < 1) then
		raise_application_error(-20001, 'Não existe o cliente' || cliente_p);
	end if;
    
	UPDATE cliente
	SET nome = nome_p, sobrenome = sobrenome_p
	WHERE cliente_id = cliente_p;
	commit;
	
END atualizarNomeCliente;

EXEC atualizarNomeCliente(1, 'Carlos Henrique', 'Lopes');
SELECT * FROM cliente WHERE cliente_id=1;

DROP PROCEDURE atualizarNomeCliente;
