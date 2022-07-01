package exerciciosManzano;

import java.util.Scanner;

public class E_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula \r\n"
				+ "PRESTACAO ← VALOR + (VALOR * TAXA/100) * TEMPO).");
		
		float prestacao, valor,  taxa; 
		int tempo; 
		
		System.out.println("Digite o valor da prestação em questão");
		valor = sc.nextFloat(); 
		
		System.out.println("Digite a taxa do prestação em caso de atraso");
		taxa = sc.nextFloat(); 
		
		System.out.println("Digite o tempo de atraso da prestação");
		tempo = sc.nextInt();
		
		prestacao = valor + (valor * taxa/100) * tempo; 
		
		System.out.println("O valor acomulado da prestação será de R$ " + prestacao); 
		
		sc.close();
	}
}
