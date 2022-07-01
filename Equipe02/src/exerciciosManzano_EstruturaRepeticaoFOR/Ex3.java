package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex3 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("iremos realizar a soma de todos os valores PARES do 1 até o 500");
		
		int acumuladorSoma = 0; 
		int validadorPar = 2; 
		
		System.out.println("-----------------------------------"); 
		
		for (int i = 1; i < 501; i++) {
			if(i % validadorPar == 0) {
				acumuladorSoma += i; 
			}
		}
		
		System.out.println("A soma total é igual a = " + acumuladorSoma); 
		
		sc.close();
	}
}
