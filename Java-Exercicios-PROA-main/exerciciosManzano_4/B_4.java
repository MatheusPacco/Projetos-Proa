package exerciciosManzano_4;

import java.util.Scanner;

public class B_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um \r\n"
				+ "valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se \r\n"
				+ "de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1. "); 
		
		
		int valorQualquer; 
		
		System.out.println("Digite qualuqer valor");
		valorQualquer = sc.nextInt();
		
		if(valorQualquer < 0) {
			valorQualquer *= -1; 
		}
		
		System.out.println("O modulo do valor digitado é de: " + valorQualquer);
		sc.close();
	}
}
