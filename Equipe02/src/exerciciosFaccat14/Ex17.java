package exerciciosFaccat14;

import java.util.Scanner;
public class Ex17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever \r\n"
				+ "uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o \r\n"
				+ "aluno � aprovado). Escrever tamb�m a m�dia calculada."); 
		
		System.out.println("Digite a primeira nota");
		int notaUm = sc.nextInt(); 		
		
		System.out.println("Digite a segunda nota");
		int notaDois = sc.nextInt(); 	
		
		float media = (float) (notaUm + notaDois) / 2; 
		
		if (media >= 6) {
			System.out.println("A sua m�dia � de " + media +" parab�ns voc� foi aprovado"); 
		}
		else {
			System.out.println("A sua m�dia � de " + media + " Voc� n�o foi aprovado"); 
		}
		
		sc.close();
	}	
}
