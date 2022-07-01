Algoritmo "Apresentar o Quadrado do valor 6-M-N"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Jailson Costa dos Santos
// Descrição   : Receber três valores e apresentar a soma do quadrado dos três
// Autor(a)    : Matheus Pacco Silva
// Data atual  : 23/03/2022
Var
Soma, Valor, ValorDois, ValorTres:real
Quadrado :real


Inicio
ESCREVAL ("Digite o primeiro valor")
LEIA (Valor)
ESCREVAL ("Digite o segundo valor")
LEIA (ValorDois)
ESCREVAL ("Digite o terceiro valor")
LEIA (ValorTres)

Soma <- (Valor^2) + (ValorDois^2) + (ValorTres^2)

ESCREVAL ("A soma do valor do quadrado dos três números seguintes: ", Valor, ",", ValorDois, ",", ValorTres)
ESCREVAL ("A soma do quadrado deles, será de: ", Soma)

Quadrado <- Valor + ValorDois + ValorTres
Quadrado <- Quadrado^2
ESCREVAL ("O quadrado da soma dos três valores é de: ", Quadrado )
Fimalgoritmo