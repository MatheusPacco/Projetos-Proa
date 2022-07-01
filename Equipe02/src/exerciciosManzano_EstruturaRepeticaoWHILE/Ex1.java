package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex1 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apresentar os quadrados dos números inteiros de 15 a 200.");
		
		int i = 15; 
		
		while(i <= 200) {
			System.out.println("O quadrado do valor: " + i + " é: " + (i * i)); 
			i++; 
		}
		
		
		
		sc.close();
	}
}
