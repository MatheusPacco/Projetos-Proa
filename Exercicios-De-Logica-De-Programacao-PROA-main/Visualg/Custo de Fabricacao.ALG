Algoritmo "Custo de Fabricação"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2022
Var
// Seção de Declarações das variáveis 
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
ESCREVAL ("O total de impostos atribuidos ao valor final será de: R$", CustoFabrica*imposto/100)
ESCREVAL ()
ESCREVAL ("O total de porcentagem do Distribuidor atribuidos ao valor final será de: R$", CustoFabrica*PorcentagemDistribuidor/100)
ESCREVAL ()
ESCREVAL ("O custo final para o consumidor será deR$", CustoFinal)
Fimalgoritmo