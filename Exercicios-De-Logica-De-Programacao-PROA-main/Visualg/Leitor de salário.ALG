Algoritmo "Leitor de Sal�rio"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2022
Var
Salario, reajuste, newSalario, aumento: real

virgula : caracter
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
ESCREVAL ("Digite o seu sal�rio mensal atual")
LEIA (salario)
ESCREVAL ("Digite o percental de reajuste salarial!")
LEIA (reajuste)

aumento <- (salario * reajuste)/100
newSalario <- salario + aumento
virgula <- ",00"
ESCREVAL ("O seu novo sal�rio vai ser: R$",newSalario, virgula)
Fimalgoritmo