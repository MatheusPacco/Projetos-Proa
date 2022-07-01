Algoritmo "Troca de valores 6-F"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa dos Santos
// Descrição   : O objetivo é trocar o valor contido em A para B e vice-versa
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 23/03/2022
Var
A, B, troca:real


Inicio
ESCREVAL ("Digite o valor do A")
LEIA (A)
ESCREVAL ("Digite o valor do B")
LEIA (B)

troca <- A
A <- B
B <- troca

ESCREVAL ("Os valores foram trocados, agora o valor A é: ", A)
ESCREVAL ("Os valores foram trocados, agora o valor B é: ", B)
Fimalgoritmo