package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex4 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de \r\n"
				+ "1 at� 500. ");
		
		int i = 1; 
		int totalSoma = 0; 
		
		while(i <= 500) {
			if(i % 2 == 0) {
				totalSoma += i; 
			}
			i++; 
		}
		
		System.out.println("A soma total de todos os valores inteiros e pares at� 500, � igual a: " + totalSoma);
		sc.close();
	}
}	
