package exerciciosManzano;

import java.util.Scanner;

public class I_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler dois inteiros (vari�veis A e B) e imprimir o resultado do quadrado da diferen�a do primeiro valor pelo \r\n"
				+ "segundo.");
	
		int valorUm, 
		valorDois; 
		
		System.out.println("Digite um valor"); 
		valorUm = sc.nextInt(); 
		
		System.out.println("Digite um valor"); 
		valorDois = sc.nextInt(); 
		
		
		System.out.println("A diferen�a do primeiro valor pelo segundo � de: " + (valorUm - valorDois)); 
		sc.close();
	}
}
