package exerciciosFaccat14;

import java.util.Scanner;
public class Ex16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem \r\n"
				+ "compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e \r\n"
				+ "escreva o custo total da compra."); 
		
		System.out.println("Quantas maçãs você deseja comprar");
		int qtsMacas = sc.nextInt(); 		
		
		if (qtsMacas < 12) {
			System.out.println("Você que deseja comprar " + qtsMacas + " e irá sair por R$" + (qtsMacas*1.30)); 
		} else {
			System.out.println("Você que deseja comprar " + qtsMacas + " e irá sair por R$" + (qtsMacas)); 
		}
		
		sc.close();
	}	
}

