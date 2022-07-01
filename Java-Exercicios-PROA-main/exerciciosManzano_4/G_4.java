package exerciciosManzano_4;

import java.util.Scanner;

public class G_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3. "); 
		
		
		int[] valores = new int[4]; 
		int nValores = 0; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota"); 
			valores[i] = sc.nextInt();	
			
			if(valores[i] % 2 == 0 && valores[i] % 3 == 0 ) {
				nValores += 1; 
				System.out.println("O valor: " + valores[i] + " é divisível por 2 e por 3"); 
			}
		}
		
		System.out.println("O número de valores divisíveis por 2 e por 3 é de: " + nValores);
		
		
		sc.close();	
	}
}	
