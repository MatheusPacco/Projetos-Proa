Algoritmo "Calculo de Temperatura 6-A-B"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Jailson Costa do Santos
// Descri��o   : Calculo de Celsius para Fahrenheit e vice-versa
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 21/03/2022
Var
C, F, op: real


Inicio
ESCREVAL ("Escolha uma das op��es")
ESCREVAL ("Convers�o de Fahrenheit para Celsius - Digite 1")
ESCREVAL ("Convers�o de Celsius para Fahrenheit - Digite 2")
LEIA (op)

SE (op = 1) ENTAO
   ESCREVAL("Digite o valor em Fahrenheit")
   LEIA (F)
   C <- (F-32)*(5/9)
   ESCREVAL("A convers�o de Fahrenheit para Celsius resultou em: ", C,"�C")
SENAO
   ESCREVAL("Digite o valor em Celsius")
   LEIA (C)
   F <- (9*C+160)/5
   ESCREVAL("A convers�o de Celsius para Fahrenheit resultou em: ", F,"�F")
FIMSE

Fimalgoritmo