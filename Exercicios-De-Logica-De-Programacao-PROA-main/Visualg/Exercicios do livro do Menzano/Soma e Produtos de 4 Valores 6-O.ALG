Algoritmo "Apresentar o Quadrado do valor 6-O"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa dos Santos
// Descrição   : Ler 4 valores e apresentar o produto do primeiro com o terceiro
               // e a soma do segundo com o quarto
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 23/03/2022
Var
Valor, ValorDois, ValorTres, ValorQuatro:inteiro
Soma, P: real


Inicio
ESCREVAL ("Digite o primeiro valor")
LEIA (Valor)
ESCREVAL ("Digite o segundo valor")
LEIA (ValorDois)
ESCREVAL ("Digite o terceiro valor")
LEIA (ValorTres)
ESCREVAL ("Digite o quarto valor")
LEIA (ValorQuatro)

Soma <- ValorDois + ValorQuatro
P <- Valor * ValorTres

ESCREVAL ("A soma do segundo com o quarto valor é ", Soma)

ESCREVAL ("O Produto do primerio com o terceiro valor é ", P )
Fimalgoritmo