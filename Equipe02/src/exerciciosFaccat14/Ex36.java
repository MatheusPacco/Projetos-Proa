package exerciciosFaccat14;

import java.util.Scanner;
public class Ex36 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades \r\n"
				+ "dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma \r\n"
				+ "das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais \r\n"
				+ "novo com a mulher mais velha.");
	
		System.out.println("Digite a idade do primerio homem");
		int homemUm = sc.nextInt(); 
		
		System.out.println("Digite a idade do segundo homem");
		int homemDois = sc.nextInt(); 
		
		System.out.println("Digite a idade da primeira mulher");
		int mulherUm = sc.nextInt(); 
		
		System.out.println("Digite a idade da segunda mulher");
		int mulherDois = sc.nextInt(); 
		
		int arrayIdades[] = RecebeValores(homemUm, homemDois, mulherUm, mulherDois); 
		
		System.out.print(arrayIdades); 
		
		int soma = arrayIdades[0] + arrayIdades[3]; 
		int produto = arrayIdades[1] + arrayIdades[2]; 
		System.out.println(""); 
		System.out.println("A soma da idade dohomem mais velho com a idade da mulher mais nova é de: " + soma); 
		System.out.println("O produto da idade do homem mais novo com a idade da mulher mais velha é de: " + produto); 
		
		sc.close();
	}
	

	private static int[] RecebeValores(int homemUm, int homemDois, int mulherUm, int mulherDois) {
		int arrayGeral[] = new int[4]; 
		// Para adicionar em cada posição é necessário o Cochete; 
		
		if(homemUm > homemDois) {
			arrayGeral[0] = homemUm; 
			arrayGeral[1] = homemDois; 
		} else {
			arrayGeral[0] = homemDois; 
			arrayGeral[1] = homemUm; 
		}
		
		if(mulherUm > mulherDois) {
			arrayGeral[2] = mulherUm; 
			arrayGeral[3] = mulherDois; 
		} else {
			arrayGeral[2] = mulherDois; 
			arrayGeral[3] = mulherUm; 
		}
		
		for (int i = 0; i < arrayGeral.length; i++) {
			System.out.println(arrayGeral[i]); 
		}
		
		return arrayGeral; 
	}
	
}
