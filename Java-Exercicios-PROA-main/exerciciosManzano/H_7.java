package exerciciosManzano;

import java.util.Scanner;

public class H_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula \r\n"
				+ "VOLUME ← COMPRIMENTO * LARGURA * ALTURA.\r\n");
	
		float volume, comprimento, largura, altura; 
		
		System.out.println("Digite o valor do comprimento"); 
		comprimento = sc.nextFloat(); 
		
		System.out.println("Digite o valor da largura"); 
		largura = sc.nextFloat(); 
		
		System.out.println("Digite o valor da altura"); 
		altura = sc.nextFloat(); 
		
		volume = comprimento * largura * altura; 
		
		System.out.println("O valor do volume da caixa é de : " + volume + " m3"); 		
		
		sc.close();
	}
}
