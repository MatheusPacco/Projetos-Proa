package exerciciosManzano;

import java.util.Scanner;

public class L_M_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à \r\n"
				+ "soma dos quadrados dos três valores lidos");
	
		int[] valores = new int[3]; 
		float somaDosQuadrados = 0; 
		float somaTodosValores = 0; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor"); 
			valores[i] = sc.nextInt(); 
			
			somaTodosValores += valores[i]; 
			somaDosQuadrados += valores[i] * valores[i]; 
		}
		
		System.out.println("O quadrado da soma dos três valores: " + (somaTodosValores * somaTodosValores)); 
		System.out.println("A soma do quadrado dos três valores: " + somaDosQuadrados); 
		
		
		sc.close();
	}
}
