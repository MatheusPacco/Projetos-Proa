Algoritmo "Anos Meses e dias de vida de uma pessoa"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa do Santos
// Descrição   : O algoritmo recebe a idade da pessoas e deve calcular todos os anoa
//             meses e dias de vida
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 21/03/2022
Var
idade, ano, mes, dia: inteiro


Inicio
ESCREVAL ("Digite sua idade")
LEIA (idade)

ano <- idade
mes <- ano*12
dia <- mes*30

ESCREVAL (dia)



Fimalgoritmo