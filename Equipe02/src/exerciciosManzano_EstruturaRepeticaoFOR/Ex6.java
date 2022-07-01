package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex6 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do exponte");
		int valorQualquer = sc.nextInt(); 
		
		System.out.println("Digite até que expoente o valor " + valorQualquer + " deve ser elevado");
		int expoente = sc.nextInt(); 
		
	
	System.out.println("O expoente de " + valorQualquer + " até o " +  expoente + " igual a:"); 
		System.out.println("-----------------------------------"); 
		
		for (int i = 0; i <= expoente; i++) {
			int resultadoExpoente = 0; 
			for (int x = 0; x <= i; x++) {
				resultadoExpoente *= valorQualquer; 
				
				if(x == 0 ) {
					resultadoExpoente = 1; 
				} else if (x == 1){
					resultadoExpoente = valorQualquer; 
				}
			}
			
			System.out.println(valorQualquer + " ^ " + i + " == " + resultadoExpoente);
		}
		
		
		sc.close();
	}
}
