package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex10 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que apresente os resultados da soma e da m�dia aritm�tica dos valores \r\n"
				+ "pares situados na faixa num�rica de 50 a 70.");
		
		System.out.println("Digite o valor que deseja iniciar"); 
		int valorMinimo = sc.nextInt(); 
		
		System.out.println("Digite o valor m�ximo que deseja chegar"); 
		int valorMaximo = sc.nextInt(); 
		
		int cont = 0, soma = 0, media = 0;  
	
		for (int i = valorMinimo; i <= valorMaximo; i++) {
			if(i % 2 == 0) {
				soma += i; 
				cont += 1;  
				
				System.out.println("Esse valor � PAR " + i); 
			}
		}
		
		media = soma / cont; 
		System.out.println("A m�dia da soma dos valores digitados que s�o pares de " + valorMinimo + " at� " + valorMaximo); 
		System.out.println("M�DIA: " + media); 
		sc.close();
	}
	
}	
