package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex9 {
	public static void main(String arg[]) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo \r\n"
		+ "seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo \r\n"
		+ "usuário. "); 
	    
	    System.out.println(""); 
	    
	    int maior = 0, menor = 0, i = 0; 
	    
	    do {
	    	
	    	System.out.println("Digite qualquer valor!!");
	    	int valores = sc.nextInt(); 	    
	    
	    	
	    	if(valores > maior) {
	    		maior = valores; 
	    	} else if(menor > valores || menor == 0) {
	    		menor = valores; 
	    	}
	    	
	    	if(valores < 0) {
	    		i = 2; 
	    	}
	    	
	    }while(i <= 1);
	    
	    System.out.println("O maior valor é " + maior); 
	    System.out.println("O menor valor é " + menor); 
	    sc.close();
	    
		}
}
