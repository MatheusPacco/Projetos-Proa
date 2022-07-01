package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex13 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" O algoritmo irá demonstrar a fatoração do 1 ao 10");
		
		System.out.println("A sequência a seguir:");
		System.out.println("---------------------------------------");
		
		for(int i = 0; i <= 10; i++) {
			int acumuladores = 1;
			
				for(int x = 1; x <= i; x++){
					acumuladores = acumuladores * x;
					//System.out.println("Valor acumulador atual" + acumuladores);

				}
				
				System.out.println("O fatorial do valor !" + i + " = " + acumuladores);
			
		}
		
		
		sc.close();
	}
}
