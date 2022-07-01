package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex10 {
public static void main(String arg[]) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer. \r\n"
		+ "Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético \r\n"
		+ "DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve \r\n"
		+ "apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo"); 
	    
	    System.out.println(""); 
	    
	    System.out.println("Digite o valor que será dividido"); 
	    int valorUm = sc.nextInt(); 
	    
	    System.out.println("Digite o valor que será o divisor"); 
	    int valorDois = sc.nextInt(); 
	    
	    int i = 1, resultado = 0, mult = 0, cont = 0;
	    int validador = 0; 
	    
	    do {
	    	
	    	mult = valorDois * i; 
	    	resultado = valorUm - mult; 
	    	
	    	
	    	if(resultado < 0) {
	    		validador = 1; 
	    	} else {
	    		cont ++; 
		    	i++; 
	    	}
	    	
	    	
	    }while(validador == 0); 
	    
	    System.out.println("O número quociente de divisão é de: " + cont); 
	    
	    sc.close();
	    
		}
}
