package exerciciosManzano_4;

import java.util.Scanner;

public class D_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
				+ "dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da \r\n"
				+ "média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média. \r\n"
				+ "Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi \r\n"
				+ "aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta \r\n"
				+ "condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição"); 
		
		
		int[] notas = new int[4]; 
		float notaMedia = 0; 
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota"); 
			notas[i] = sc.nextInt();	
			notaMedia += notas[i]; 
		}
		
		notaMedia = notaMedia / 4; 
		
		if(notaMedia >= 7) {
			System.out.println("Você foi aprovado e sua média é de: " + notaMedia);
		} else {
			System.out.println("Você não foi aprovado e sua média é de: " + notaMedia);
			
			System.out.println("Digite o valor da sua prova de recuperação");
			notaMedia += sc.nextInt(); 
			notaMedia = notaMedia / 2; 
			
			if(notaMedia >= 5) {
				System.out.println("VOcê foi aprovado e sua média é de: " + notaMedia); 
			} else {
				System.out.println("Você não foi aprovado e sua média é de: " + notaMedia);
			}
			
		}
		
		sc.close();
	}
}
