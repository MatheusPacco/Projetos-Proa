Algoritmo "Apresentar o Quadrado do valor 6-I-J"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa dos Santos
// Descrição   : Receber um valor inteiro e apresentar o quadrado desse valor
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 23/03/2022
Var
Valor, ValorDois, Quadrado, Dif:real


Inicio
ESCREVAL ("Digite o primeiro valor valor")
LEIA (Valor)

Quadrado <- Valor^2

ESCREVAL ("O primeiro valor elevado ao quadrado é, ", Quadrado)

ESCREVAL ("Digite o segundo valor")
LEIA (ValorDois)

Quadrado <- ValorDois^2
ESCREVAL ("O segundo valor elevado ao quadrado é, ", Quadrado)

Dif <- (Valor^2) - (ValorDois^2)
ESCREVAL("A diferença entre o quadrado dos dois valores é: ", Dif)

Fimalgoritmo