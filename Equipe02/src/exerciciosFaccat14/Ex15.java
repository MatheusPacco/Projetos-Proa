package exerciciosFaccat14;

import java.util.Scanner;
public class Ex15 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite qualquer valor"); 
		float valorQualquer = sc.nextInt(); 		
		
		if (valorQualquer >= 0) {
			System.out.println("O valor digitado: " + valorQualquer + " é POSITIVO"); 
		} 
		else {
			System.out.println("O valor digitado: " + valorQualquer + " é negativo"); 
		} 
		
		sc.close();
	}
	
}
