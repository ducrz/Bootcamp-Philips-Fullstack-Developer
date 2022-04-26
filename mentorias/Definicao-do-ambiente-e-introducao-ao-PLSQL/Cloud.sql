/*Comandos adaptados da mentoria e usados na Oracle Cloud */

CREATE TABLE Venda
(ID_Venda NUMBER(5), QUANTIDADE NUMBER(5), Descricao VARCHAR2(100));


SELECT * FROM Venda;

ALTER TABLE Venda ADD CONSTRAINT Venda_id_pk  PRIMARY KEY (ID_Venda);

/* PL / SQL */

/* Primeiro Exemplo */
SET SERVEROUTPUT ON;

DECLARE   
 v_ID NUMBER(5) := 1;

BEGIN    
    dbms_output.put_line(v_ID);

END;

/* Segundo Exemplo */
DECLARE
    acrescimo NUMBER(5,2) := 0.25;
    salarioFuncionario number(5);
    novoSalario number(5);
BEGIN
    salarioFuncionario := 5600;
    novoSalario := (salarioFuncionario*acrescimo)+salarioFuncionario;
    dbms_output.put_line (novoSalario);
END;

/* Terceiro Exemplo */
DECLARE
    v_ID_VENDA venda.id_venda%type := 1;
    v_QUANTIDADE venda.quantidade%type := 2;
    v_DESCRICAO venda.descricao%type := 'Venda realizada com sucesso!!!';
BEGIN
    INSERT INTO venda (ID_VENDA, QUANTIDADE, DESCRICAO) VALUES (v_ID_VENDA, v_QUANTIDADE, v_DESCRICAO);
END;

SELECT * FROM VENDA;

DECLARE
    v_ID_VENDA venda.id_venda%type := 2;
    v_QUANTIDADE venda.quantidade%type := 5;
    v_DESCRICAO venda.descricao%type := 'Venda realizada com sucesso!!!';
BEGIN
    INSERT INTO venda (ID_VENDA, QUANTIDADE, DESCRICAO) VALUES (v_ID_VENDA, v_QUANTIDADE, v_DESCRICAO);
END;

SELECT * FROM VENDA;
