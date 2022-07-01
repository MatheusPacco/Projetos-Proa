package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex11 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		    
		System.out.println("Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares \r\n"
				+ "situados na faixa numérica de 1 a 10");
		
		
		System.out.println("");
	
		int i = 0; 
		
		while(i <= 10) {
			int acumuladores = 1;
			int x = 1;
			
				while(x <= i){
					acumuladores = acumuladores * x;
					x++;
					System.out.println("Valor acumulador atual" + acumuladores);

				}
				
				System.out.println("O fatorial do valor !" + i + " = " + acumuladores);
			
			i++;
		}
		
		sc.close();
	}
}
