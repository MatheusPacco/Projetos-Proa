Algoritmo "REVENDEDORA DE CARROS"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2022
Var

Salario, SalarioFinal, Comissao, numCarrosVendidos, Vendas, ValorDeVendas: real


Inicio

ESCREVAL ("Digite seu Salario")
LEIA (Salario)
ESCREVAL ("Digite a quantidade de carros vendidos")
LEIA (numCarrosVendidos)
ESCREVAL ("Digite o valor de comissão fixa por carros vendidos")
LEIA (Comissao)
ESCREVAL ("Digite o valor total de vendas")
LEIA (Vendas)

Comissao <- Comissao * numCarrosVendidos
Vendas   <- Vendas*0.05
SalarioFinal <- Salario + Vendas + Comissao

ESCREVAL ("Sua comissão por carros vendidos será de: R$", Comissao)
ESCREVAL ("Seu percentual de vendas será de: R$", Vendas)
ESCREVAL ("Seu salario final será de R$", SalarioFinal)
Fimalgoritmo