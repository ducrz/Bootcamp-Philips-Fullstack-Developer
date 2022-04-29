CREATE OR REPLACE PROCEDURE incluir_registro
(p_ID_VENDA IN NUMBER, p_QUANTIDADE IN NUMBER, p_DESCRICAO IN VARCHAR2) 


IS

BEGIN

INSERT INTO venda (ID_VENDA, QUANTIDADE, DESCRICAO) VALUES (p_ID_VENDA, p_QUANTIDADE, p_DESCRICAO);
COMMIT;

END;
