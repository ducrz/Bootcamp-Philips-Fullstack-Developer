/* Usando TRIGGER */

CREATE OR REPLACE TRIGGER before_clientes
BEFORE INSERT OR UPDATE
	ON cliente
	FOR EACH ROW

DECLARE
	emailValido boolean;
	
BEGIN
	if(:new.email is not null) then
		emailValido := REGEXP_LIKE(:new.email, '^[A-Za-z]+[A-Za-z0-9.]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$');
        if(emailValido= false) then
            raise_application_error(-20001, 'o email' || :new.email || ' do cliente ' || :new.cliente_id || ' não é válido');
        end if;
        
     end if;
END;



ALTER TRIGGER before_clientes ENABLE;
ALTER TRIGGER before_clientes DISABLE;

DROP TRIGGER before_clientes;


/* Inserção de cliente com e-mail válido e inválidos */
INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(10, 'João', 'Pereira', 29, 'M', 'joaopereira@email.com');

UPDATE cliente
SET email = '@email.com'
WHERE cliente_id = 10;

INSERT INTO cliente
(cliente_id, nome, sobrenome, idade, sexo, email)
VALUES
(10, 'João', 'Pereira', 29, 'M', 'joaopereiraemail.com');



/* Criando tabela log_delete_cliente e Trigger*/

CREATE TABLE log_delete_cliente
( 
    cliente_id number(10) NOT NULL,
    data_exclusao date
);
SELECT * FROM log_delete_cliente;


CREATE OR REPLACE TRIGGER after_delete_clientes
AFTER DELETE
	ON cliente
	FOR EACH ROW
	
DECLARE

BEGIN
	INSERT INTO log_delete_cliente
	VALUES (:old.cliente_id, sysdate);
END;

DELETE cliente
WHERE cliente_id =10;

SELECT * FROM log_delete_cliente;


