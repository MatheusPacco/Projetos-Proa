Algoritmo "REVENDEDORA DE CARROS"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2022
Var

Salario, SalarioFinal, Comissao, numCarrosVendidos, Vendas, ValorDeVendas: real


Inicio

ESCREVAL ("Digite seu Salario")
LEIA (Salario)
ESCREVAL ("Digite a quantidade de carros vendidos")
LEIA (numCarrosVendidos)
ESCREVAL ("Digite o valor de comiss�o fixa por carros vendidos")
LEIA (Comissao)
ESCREVAL ("Digite o valor total de vendas")
LEIA (Vendas)

Comissao <- Comissao * numCarrosVendidos
Vendas   <- Vendas*0.05
SalarioFinal <- Salario + Vendas + Comissao

ESCREVAL ("Sua comiss�o por carros vendidos ser� de: R$", Comissao)
ESCREVAL ("Seu percentual de vendas ser� de: R$", Vendas)
ESCREVAL ("Seu salario final ser� de R$", SalarioFinal)
Fimalgoritmo