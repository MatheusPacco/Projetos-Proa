package exerciciosFaccat14;

import java.util.Scanner;

public class Ex14 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite qualquer valor"); 
		int valorQualquer = sc.nextInt(); 		
		
		if (valorQualquer > 10) {
			System.out.println("O valor digitado: " + valorQualquer + " é maior do que 10"); 
		} 
		else if (valorQualquer == 10) {
			System.out.println("O valor digitado é igual a 10!"); 
		} 
		else {
			System.out.println("O valor digitado: " + valorQualquer + " é menor do que 10"); 
		} 
		
		sc.close();
	}
	
}
