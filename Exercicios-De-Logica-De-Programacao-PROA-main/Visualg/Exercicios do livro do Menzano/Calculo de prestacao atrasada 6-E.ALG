Algoritmo "Prestação Atrasada"
// Disciplina   : [Lógica de Programação]
// Professor   : Jailson Costa dos Santos
// Descrição   : Um programa que exibe o valor de uma prestação em atraso!
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 22/03/2022
Var
P, V, TX, TP :real


Inicio

ESCREVAL ("DIGITE O VALOR DA PRESTAÇÃO:")
LEIA (V)
ESCREVAL ("Digite a taxa mensal da prestacao:")
LEIA (TX)
ESCREVAL ("Digite os meses de atraso: ")
LEIA (TP)

P <- V + V *(TX/100)*TP )
ESCREVAL ("O valor de UMA prestação em atraso: ", P)
Fimalgoritmo