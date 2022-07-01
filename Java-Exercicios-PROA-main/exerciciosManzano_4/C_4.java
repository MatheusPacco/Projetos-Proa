package exerciciosManzano_4;

import java.util.Scanner;

public class C_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
				+ "dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 5. Se o aluno n�o \r\n"
				+ "foi aprovado, indicar uma mensagem informando esta condi��o. Apresentar junto das mensagens o \r\n"
				+ "valor da m�dia do aluno para qualquer condi��o."); 
		
		
		int[] notas = new int[4]; 
		float notaMedia = 0; 
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "� nota"); 
			notas[i] = sc.nextInt();	
			notaMedia += notas[i]; 
		}
		
		notaMedia = notaMedia / 4; 
		
		if(notaMedia >= 5) {
			System.out.println("Voc� foi aprovado e sua m�dia � de: " + notaMedia);
		} else {
			System.out.println("Voc� n�o foi aprovado e sua m�dia � de: " + notaMedia);
		}
		
		sc.close();
	}
}	
