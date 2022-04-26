/* Usando LOOP */


CREATE OR REPLACE FUNCTION multiplica
RETURN number is

    valor number(10);

BEGIN
    valor := 1;
    
    FOR contador in 1..10
    LOOP
        valor := valor * contador;    
    END LOOP;
    
    RETURN valor;

END multiplica;

SELECT multiplica() FROM dual;



CREATE OR REPLACE FUNCTION multiplica

RETURN number is
    valor number (10);
    
    CURSOR c01 is
        SELECT idade FROM cliente;
        
BEGIN
    valor := 1;
    
    FOR idadeC in c01
    LOOP
        valor := valor * idadeC.idade;    
    END LOOP;
    
    RETURN valor;

END multiplica;


SELECT multiplica() from dual;