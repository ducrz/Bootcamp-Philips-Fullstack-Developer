/* Mentoria do dia 28/04/2022 
    Códigos adaptados para uso na Oracle Cloud
*/

SELECT * FROM venda;

/* Procedure incluir_registro */

CREATE OR REPLACE PROCEDURE incluir_registro
(p_ID_VENDA IN venda.id_venda%TYPE, p_QUANTIDADE IN venda.quantidade%TYPE, p_DESCRICAO IN venda.descricao%type) 


IS

BEGIN

INSERT INTO venda (ID_VENDA, QUANTIDADE, DESCRICAO) VALUES (p_ID_VENDA, p_QUANTIDADE, p_DESCRICAO);
COMMIT;

END;

EXECUTE incluir_registro(77, 3, 'Inserido via Procedure');

SELECT * FROM venda;


/* Procedure incluir_registro2 */
CREATE OR REPLACE PROCEDURE incluir_registro2
(p_ID_VENDA IN venda.id_venda%type, p_QUANTIDADE IN venda.quantidade%type) 

IS    
    v_DESCRICAO venda.descricao%type;
BEGIN

    IF p_QUANTIDADE < 10 THEN
       v_DESCRICAO := 'Venda pequena';
    ELSIF p_QUANTIDADE < 50 THEN
       v_DESCRICAO := 'Venda Média';
    ELSIF p_QUANTIDADE < 100 THEN
       v_DESCRICAO := 'Venda Grande';   
    ELSE     
       v_DESCRICAO := 'Ótima venda';  
    END IF;    

INSERT INTO venda (ID_VENDA, QUANTIDADE, DESCRICAO) VALUES (p_ID_VENDA, p_QUANTIDADE, v_DESCRICAO);
COMMIT;
END;

EXECUTE incluir_registro2(35, 105);

SELECT * FROM venda;


/* FUNCTIONS */

/* Function obter_descricao_venda*/

CREATE OR REPLACE FUNCTION obter_descricao_venda
(p_VENDA_ID IN venda.id_venda%type)

RETURN venda.descricao%type

IS
v_DESCRICAO venda.descricao%type;

BEGIN

SELECT DESCRICAO INTO v_DESCRICAO FROM venda WHERE ID_VENDA=p_VENDA_ID;

RETURN v_DESCRICAO;

COMMIT;

END;


/* Chamando Função obter_descricao_venda */

SET SERVEROUTPUT ON;
DECLARE

result venda.descricao%type;

BEGIN
    result := obter_descricao_venda(1);
    
    DBMS_OUTPUT.PUT_line(result);

END;


SELECT * FROM venda;


SET SERVEROUTPUT ON;
DECLARE

result venda.descricao%type;

BEGIN
    result := obter_descricao_venda(35);
    
    DBMS_OUTPUT.PUT_line(result);

END;

/* FUNCTION obter_quantidade_venda */

CREATE OR REPLACE FUNCTION obter_quantidade_venda
(p_VENDA_ID IN venda.id_venda%type)

RETURN venda.quantidade%type

IS
v_QUANTIDADE venda.quantidade%type;

BEGIN

SELECT QUANTIDADE INTO v_QUANTIDADE FROM venda WHERE ID_VENDA=p_VENDA_ID;
RETURN v_QUANTIDADE;
COMMIT;

END;




SET SERVEROUTPUT ON;
DECLARE

result venda.quantidade%type;

BEGIN
    result := obter_quantidade_venda(1);
    
    DBMS_OUTPUT.PUT_line(result);

END;



SET SERVEROUTPUT ON;
DECLARE

result venda.quantidade%type;

BEGIN
    result := obter_quantidade_venda(1);
    
    DBMS_OUTPUT.PUT_line(result);

END;
