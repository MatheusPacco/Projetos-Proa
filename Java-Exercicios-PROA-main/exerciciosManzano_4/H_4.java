package exerciciosManzano_4;

import java.util.Scanner;

public class H_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Efetuar a leitura de quatro n�meros inteiros e apresentar os n�meros que s�o divis�veis por 2 e 3. "); 
		
		
		int[] valores = new int[5]; 
		int maior = 0, menor = 0; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i + 1) + " valor"); 
			valores[i] = sc.nextInt();	
			
			if(menor == 0) {
				menor = valores[i]; 
			}
			
			if(valores[i] > maior) {
				maior = valores[i]; 
			} else if (valores[i] < menor){
				menor = valores[i]; 
			}
		}
		
		System.out.println("O MAIOR valor digitado �: " + maior); 
		System.out.println("O MENOR valor digitado �: " + menor); 	
		
		sc.close();
	}
}	
