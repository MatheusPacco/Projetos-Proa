Algoritmo "Leitor de Salário"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2022
Var
Salario, reajuste, newSalario, aumento: real

virgula : caracter
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
ESCREVAL ("Digite o seu salário mensal atual")
LEIA (salario)
ESCREVAL ("Digite o percental de reajuste salarial!")
LEIA (reajuste)

aumento <- (salario * reajuste)/100
newSalario <- salario + aumento
virgula <- ",00"
ESCREVAL ("O seu novo salário vai ser: R$",newSalario, virgula)
Fimalgoritmo