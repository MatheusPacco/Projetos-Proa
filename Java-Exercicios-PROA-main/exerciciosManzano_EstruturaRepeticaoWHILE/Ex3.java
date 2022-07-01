package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex3 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100)");
		
		int i = 1; 
		int totalSoma = 0; 
		
		while(i <= 100) {
			totalSoma += i; 
			i++; 
		}
		
		System.out.println("A soma total de todos os valores inteiros até 100, é igual a: " + totalSoma);
		sc.close();
	}
}
