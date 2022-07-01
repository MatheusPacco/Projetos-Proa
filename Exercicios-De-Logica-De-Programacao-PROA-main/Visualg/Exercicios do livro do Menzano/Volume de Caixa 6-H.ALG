Algoritmo "Calculo de Volume de uma Caixa 6-H"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa dos Santos
// Descrição   :Calculo do Volume de uma caixa
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 23/03/2022
Var
A, B, C, D, SomaTotal, MultTotal:real


Inicio
ESCREVAL ("Digite o valor do A")
LEIA (A)
ESCREVAL ("Digite o valor do B")
LEIA (B)
ESCREVAL ("Digite o valor do C")
LEIA (C)
ESCREVAL ("Digite o valor do D")
LEIA (D)

SomaTotal <- A + B + C + D
SomaTotal <- SomaTotal + C + D + B
SomaTotal <- SomaTotal + D + B


MultTotal <- A * B * C * D
MultTotal <- MultTotal * C * D * B
MultTotal <- MultTotal * D * B



ESCREVAL ("A soma distributiva máxima entre as variáveis é, ", SomaTotal)
ESCREVAL ("A multiplicação distributiva máxima entre as variáveis é, ", MultTotal)
Fimalgoritmo