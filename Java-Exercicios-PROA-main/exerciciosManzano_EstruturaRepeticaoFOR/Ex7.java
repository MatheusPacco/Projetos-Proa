package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex7 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		    
		System.out.println(" Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo");
		
		System.out.println("");
	
		int anterior = 0,atual = 0, proximo = 1;
		
		   
	    for(int cont = 1; cont <= 15; cont ++) {
	        anterior = atual;
	        atual = proximo;
	        proximo = atual + anterior;

	        System.out.println(atual);
	    }
		
		sc.close();
	}
}	
