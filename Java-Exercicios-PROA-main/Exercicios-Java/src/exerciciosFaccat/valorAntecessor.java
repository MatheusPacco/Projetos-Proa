package exerciciosFaccat;

import java.util.Scanner; 

public class valorAntecessor {
	public static void main(String args[]) {
		
		// Atribuindo uma instância em um objeto, para uso de determinada função da classe
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite qualquer valor e iremos expor seu antecessor");
		int valorQualquer = sc.nextInt(); 
		int antecessor = valorQualquer - 1;
		
		System.out.print("O valor antecessor de " + valorQualquer + " é: " + antecessor);
		
		sc.close();
	}
}
