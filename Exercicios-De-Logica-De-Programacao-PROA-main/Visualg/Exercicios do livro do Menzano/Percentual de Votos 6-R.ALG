Algoritmo "Percentual de votos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa do Santos
// Descrição   : Calcular votos nulos,validos, brancos e o percentual disso
//             com base no número de eleitores e o percentual de voto
//             por candidato

// Autor(a)    : Matheus Pacco Silva
// Data atual  : 21/03/2022
Var
A, B, C: inteiro
VN, VB, VValidos:inteiro
PVotosValidos: real
TotalEleitores:inteiro
PA,PB,PC:real


Inicio
ESCREVAL ("Digite a quantidade votos válidos no candidato A")
LEIA (A)
ESCREVAL ("Digite a quantidade votos válidos no candidato B")
LEIA (B)
ESCREVAL ("Digite a quantidade votos válidos no candidato C")
LEIA (C)
ESCREVAL ("Digite a quantidade votos Nulos")
LEIA (VN)
ESCREVAL ("Digite a quantidade votos Brancos")
LEIA (VB)

VValidos <- A + B + C
TotalEleitores <- VValidos + VN + VB
PVotosValidos <- (VValidos*100)/TotalEleitores

ESCREVAL ("VOTOS VALIDOS: ", VValidos)
ESCREVAL ("TOTAL DE ELEITORES: ", TotalEleitores)
ESCREVAL ("PERCENTUAL DE VOTOS VALIDOS: ", PVotosValidos)
ESCREVAL ()
/////////////////////////////////////////////////////////////
PA <- (A*100)/TotalEleitores
PB <- (B*100)/TotalEleitores
PC <- (C*100)/TotalEleitores

ESCREVAL ("A quantidade de votos validos no A foi de: ", A)
ESCREVAL ("E seu percentual de votos validos foi de: ", PA,"%")
ESCREVAL ("-----------------------------------------------------------------")

ESCREVAL ("A quantidade de votos validos no B foi de: ", B)
ESCREVAL ("E seu percentual de votos validos foi de: ", PB,"%")
ESCREVAL ("-----------------------------------------------------------------")

ESCREVAL ("A quantidade de votos validos no C foi de: ", C)
ESCREVAL ("E seu percentual de votos validos foi de: ", PC,"%")


Fimalgoritmo