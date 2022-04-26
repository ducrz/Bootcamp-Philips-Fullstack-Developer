/* Usando IF-ELSE */
CREATE OR REPLACE FUNCTION descIdade(idade_p number)
return varchar is
    retorno varchar(100);

BEGIN

    IF idade_p < 0 OR idade_p > 200 THEN
        retorno := 'Idade Inválida';
    ELSIF idade_p >= 18 THEN
        retorno := 'Maior de Idade';
    ELSIF idade_p >= 12 THEN
        retorno := 'Adolescente';
    ELSE
        retorno := 'Criança';
    END IF; 
    
    
    return retorno;   

END descIdade;

SELECT nome, idade, descIdade(idade) FROM cliente;