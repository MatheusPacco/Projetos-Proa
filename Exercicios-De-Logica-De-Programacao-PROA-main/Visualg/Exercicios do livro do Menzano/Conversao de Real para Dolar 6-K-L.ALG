Algoritmo "Apresentar o Quadrado do valor 6-K-L"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa dos Santos
// Descrição   : Conversão de dolar para real e vice-versa
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 23/03/2022
Var
op, R, D, ValorDaCotacao:real


Inicio

ESCREVAL ("Escolha a opção que deseja:")
ESCREVAL ("Conversão de REAL para DOlAR - Digite 1")
ESCREVAL ("Conversão de DOLAR para REAL - Digite 2")
LEIA (op)


SE (op = 1) ENTAO
   ESCREVAL ("--------------------------------")
   ESCREVAL ("DIGITE QUANTOS REAIS VOCÊ TEM")
   LEIA (R)
   ESCREVAL ("DIGITE O VALOR DA COTAÇÃO ATUAL")
   LEIA (ValorDaCotacao)
   
   D <-  R/ValorDaCotacao
   ESCREVAL ("Segundo a conversão você poder ter até, $", D)

FIMSE
SE (op = 2) ENTAO
   ESCREVAL ("--------------------------------")
   ESCREVAL ("DIGITE QUANTOS DÓLARES VOCÊ TEM")
   LEIA (D)
   ESCREVAL ("DIGITE O VALOR DA COTAÇÃO ATUAL")
   LEIA (ValorDaCotacao)

   R <-  D*ValorDaCotacao
   ESCREVAL ("Segundo a conversão você poder ter até, R$", R)
FIMSE



Fimalgoritmo