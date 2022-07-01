Algoritmo "Combustivel gasto por viagem"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/03/2022
Var
L, T, VM, D:real
Inicio

ESCREVAL ("Qual foi o tempo total de viagem")
LEIA (T)
ESCREVAL ("Qual foi a Velocidade média percorrida durante a viagem")
LEIA (VM)

D <- T * VM

ESCREVAL ("A distância total percorrida durante a viagem foi de: ", D)

L <- D/12

ESCREVAL ("A quantidade de Litros gastos foi de: ", L)


Fimalgoritmo