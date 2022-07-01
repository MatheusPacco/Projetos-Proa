package exerciciosManzano_4;

import java.util.Scanner;

public class D_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
				+ "dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 7. Se o valor da \r\n"
				+ "m�dia for menor que 7, solicitar a nota de exame, somar com o valor da m�dia e obter nova m�dia. \r\n"
				+ "Se a nova m�dia for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi \r\n"
				+ "aprovado em exame. Se o aluno n�o foi aprovado, indicar uma mensagem informando esta \r\n"
				+ "condi��o. Apresentar com as mensagens o valor da m�dia do aluno, para qualquer condi��o"); 
		
		
		int[] notas = new int[4]; 
		float notaMedia = 0; 
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "� nota"); 
			notas[i] = sc.nextInt();	
			notaMedia += notas[i]; 
		}
		
		notaMedia = notaMedia / 4; 
		
		if(notaMedia >= 7) {
			System.out.println("Voc� foi aprovado e sua m�dia � de: " + notaMedia);
		} else {
			System.out.println("Voc� n�o foi aprovado e sua m�dia � de: " + notaMedia);
			
			System.out.println("Digite o valor da sua prova de recupera��o");
			notaMedia += sc.nextInt(); 
			notaMedia = notaMedia / 2; 
			
			if(notaMedia >= 5) {
				System.out.println("VOc� foi aprovado e sua m�dia � de: " + notaMedia); 
			} else {
				System.out.println("Voc� n�o foi aprovado e sua m�dia � de: " + notaMedia);
			}
			
		}
		
		sc.close();
	}
}
