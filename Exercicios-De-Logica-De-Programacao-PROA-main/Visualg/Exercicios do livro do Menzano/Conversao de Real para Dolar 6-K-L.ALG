Algoritmo "Apresentar o Quadrado do valor 6-K-L"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Jailson Costa dos Santos
// Descri��o   : Convers�o de dolar para real e vice-versa
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 23/03/2022
Var
op, R, D, ValorDaCotacao:real


Inicio

ESCREVAL ("Escolha a op��o que deseja:")
ESCREVAL ("Convers�o de REAL para DOlAR - Digite 1")
ESCREVAL ("Convers�o de DOLAR para REAL - Digite 2")
LEIA (op)


SE (op = 1) ENTAO
   ESCREVAL ("--------------------------------")
   ESCREVAL ("DIGITE QUANTOS REAIS VOC� TEM")
   LEIA (R)
   ESCREVAL ("DIGITE O VALOR DA COTA��O ATUAL")
   LEIA (ValorDaCotacao)
   
   D <-  R/ValorDaCotacao
   ESCREVAL ("Segundo a convers�o voc� poder ter at�, $", D)

FIMSE
SE (op = 2) ENTAO
   ESCREVAL ("--------------------------------")
   ESCREVAL ("DIGITE QUANTOS D�LARES VOC� TEM")
   LEIA (D)
   ESCREVAL ("DIGITE O VALOR DA COTA��O ATUAL")
   LEIA (ValorDaCotacao)

   R <-  D*ValorDaCotacao
   ESCREVAL ("Segundo a convers�o voc� poder ter at�, R$", R)
FIMSE



Fimalgoritmo