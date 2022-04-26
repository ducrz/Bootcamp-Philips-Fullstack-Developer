/* FUNCTIONS */
CREATE OR REPLACE FUNCTION SomaIdadeSexo(sexo_p in varchar)
RETURN number is

totalIdade number(10);

BEGIN
	SELECT sum(c.idade)
	INTO totalIdade
	FROM cliente c
	WHERE sexo = sexo_p;
	
	RETURN totalIdade;

END SomaIdadeSexo;


SELECT SomaIdadeSexo('M')
FROM dual;

DROP FUNCTION SomaIdadeSexo;
