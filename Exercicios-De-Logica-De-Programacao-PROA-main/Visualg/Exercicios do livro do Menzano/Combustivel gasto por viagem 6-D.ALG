Algoritmo "Combustivel gasto por viagem"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/03/2022
Var
L, T, VM, D:real
Inicio

ESCREVAL ("Qual foi o tempo total de viagem")
LEIA (T)
ESCREVAL ("Qual foi a Velocidade m�dia percorrida durante a viagem")
LEIA (VM)

D <- T * VM

ESCREVAL ("A dist�ncia total percorrida durante a viagem foi de: ", D)

L <- D/12

ESCREVAL ("A quantidade de Litros gastos foi de: ", L)


Fimalgoritmo