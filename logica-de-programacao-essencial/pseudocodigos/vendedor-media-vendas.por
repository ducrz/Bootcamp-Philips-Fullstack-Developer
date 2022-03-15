programa
{
	
	funcao inicio()
	{
		real janeiro,fevereiro,marco,abril,media
		cadeia vendedor

		escreva("Digite o nome do Vendedor: ")
		leia(vendedor)
		
		escreva("Digite o valor em vendas de Janeiro: ")
		leia(janeiro)
		escreva("Digite o valor em vendas de Fevereiro: ")
		leia(fevereiro)
		escreva("Digite o valor em vendas de Março: ")
		leia(marco)
		escreva("Digite o valor em vendas de Abril: ")
		leia(abril)

		media= (janeiro+fevereiro+marco+abril)/4
		
		escreva("A Média de Vendas do Vendedor "+vendedor+" é "+media)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */