package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex5 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O algoritmo irá devolver os expoentes de 1 até o 15 do valor 3");
				
		int tres = 3; 
	
		System.out.println("O expoente de 3 do 1 até o 15 é igual a:"); 
		System.out.println("-----------------------------------"); 
		
		for (int i = 0; i <= 15; i++) {
			int resultadoExpoente = 0; 
			for (int x = 0; x <= i; x++) {
				resultadoExpoente *= tres; 
				
				if(x == 0 ) {
					resultadoExpoente = 1; 
				} else if (x == 1){
					resultadoExpoente = 3; 
				}
			}
			
			System.out.println(tres + " ^ " + i + " == " + resultadoExpoente);
		}
		
		
		sc.close();
	}
}
