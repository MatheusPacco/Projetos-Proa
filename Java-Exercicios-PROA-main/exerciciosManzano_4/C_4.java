package exerciciosManzano_4;

import java.util.Scanner;

public class C_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
				+ "dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não \r\n"
				+ "foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o \r\n"
				+ "valor da média do aluno para qualquer condição."); 
		
		
		int[] notas = new int[4]; 
		float notaMedia = 0; 
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota"); 
			notas[i] = sc.nextInt();	
			notaMedia += notas[i]; 
		}
		
		notaMedia = notaMedia / 4; 
		
		if(notaMedia >= 5) {
			System.out.println("Você foi aprovado e sua média é de: " + notaMedia);
		} else {
			System.out.println("Você não foi aprovado e sua média é de: " + notaMedia);
		}
		
		sc.close();
	}
}	
