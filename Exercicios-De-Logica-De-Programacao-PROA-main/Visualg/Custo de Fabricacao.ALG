Algoritmo "Custo de Fabrica��o"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2022
Var
// Se��o de Declara��es das vari�veis 
CustoFabrica, PorcentagemDistribuidor, Imposto, CustoFinal: real

Inicio
ESCREVAL ("Digite o custo de fabrica")
LEIA (CustoFabrica)
ESCREVAL ("Digite a porcentagem do distribuidor")
LEIA (PorcentagemDistribuidor)
ESCREVAL ("Digite o imposto sobre o custo")
LEIA (Imposto)


CustoFinal <- CustoFabrica + (CustoFabrica*imposto /100) + (CustoFabrica*PorcentagemDistribuidor /100)

ESCREVAL("------------------------------------------------------------")
ESCREVAL ("O total de impostos atribuidos ao valor final ser� de: R$", CustoFabrica*imposto/100)
ESCREVAL ()
ESCREVAL ("O total de porcentagem do Distribuidor atribuidos ao valor final ser� de: R$", CustoFabrica*PorcentagemDistribuidor/100)
ESCREVAL ()
ESCREVAL ("O custo final para o consumidor ser� deR$", CustoFinal)
Fimalgoritmo