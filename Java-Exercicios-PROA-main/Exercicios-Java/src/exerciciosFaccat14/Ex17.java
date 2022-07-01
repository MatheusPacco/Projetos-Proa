package exerciciosFaccat14;

import java.util.Scanner;
public class Ex17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever \r\n"
				+ "uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o \r\n"
				+ "aluno é aprovado). Escrever também a média calculada."); 
		
		System.out.println("Digite a primeira nota");
		int notaUm = sc.nextInt(); 		
		
		System.out.println("Digite a segunda nota");
		int notaDois = sc.nextInt(); 	
		
		float media = (float) (notaUm + notaDois) / 2; 
		
		if (media >= 6) {
			System.out.println("A sua média é de " + media +" parabéns você foi aprovado"); 
		}
		else {
			System.out.println("A sua média é de " + media + " Você não foi aprovado"); 
		}
		
		sc.close();
	}	
}
