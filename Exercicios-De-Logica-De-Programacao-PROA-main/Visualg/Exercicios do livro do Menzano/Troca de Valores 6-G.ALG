Algoritmo "Troca de valores 6-G"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Jailson Costa dos Santos
// Descri��o   : Multiplica��o e adi��o distributiva entre 4 valores diferentes
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



ESCREVAL ("A soma distributiva m�xima entre as vari�veis �, ", SomaTotal)
ESCREVAL ("A multiplica��o distributiva m�xima entre as vari�veis �, ", MultTotal)
Fimalgoritmo