package exerciciosFaccat14;

import java.util.Scanner;
public class Ex16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem \r\n"
				+ "compradas pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e \r\n"
				+ "escreva o custo total da compra."); 
		
		System.out.println("Quantas ma��s voc� deseja comprar");
		int qtsMacas = sc.nextInt(); 		
		
		if (qtsMacas < 12) {
			System.out.println("Voc� que deseja comprar " + qtsMacas + " e ir� sair por R$" + (qtsMacas*1.30)); 
		} else {
			System.out.println("Voc� que deseja comprar " + qtsMacas + " e ir� sair por R$" + (qtsMacas)); 
		}
		
		sc.close();
	}	
}

