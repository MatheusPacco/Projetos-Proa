Algoritmo "Apresentar o Quadrado do valor 6-M-N"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Jailson Costa dos Santos
// Descri��o   : Receber tr�s valores e apresentar a soma do quadrado dos tr�s
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

ESCREVAL ("A soma do valor do quadrado dos tr�s n�meros seguintes: ", Valor, ",", ValorDois, ",", ValorTres)
ESCREVAL ("A soma do quadrado deles, ser� de: ", Soma)

Quadrado <- Valor + ValorDois + ValorTres
Quadrado <- Quadrado^2
ESCREVAL ("O quadrado da soma dos tr�s valores � de: ", Quadrado )
Fimalgoritmo