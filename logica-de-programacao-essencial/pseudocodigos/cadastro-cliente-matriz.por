programa
{
	
	funcao inicio()
	{
		cadeia cadastro[3][3]={{"João","São Paulo","(11)99999-9999"},{"Maria","Vitória","(27)99999-9999"},{"Ana","Santos","(13)99999-9999"}}
		inteiro contador=0

		faca{
			escreva("Cliente: "+cadastro[contador][0]+" Cidade: "+cadastro[contador][1]+" Telefone: "+cadastro[contador][2]+"\n")
			contador++
		}enquanto(contador <= 2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */