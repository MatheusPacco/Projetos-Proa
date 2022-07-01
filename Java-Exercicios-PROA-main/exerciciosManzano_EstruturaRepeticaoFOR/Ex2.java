package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("iremos realizar a soma de todos os valores do 1 até o 100");
		
		int acumuladorSoma = 0; 
		
		System.out.println("-----------------------------------"); 
		for (int i = 1; i < 101; i++) {
			acumuladorSoma += i; 
		}
		
		System.out.println("A soma total é igual a = " + acumuladorSoma); 
		
		sc.close();
	}
}
