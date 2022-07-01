package exerciciosFaccat14;

import java.util.Scanner;
public class Ex28_30 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Esse algoritmo tem quatro objetivos, ler tr�s valores e informar se os valores s�o positivos, negativos ou zero ");
		System.out.println("Informar o maior, expor os valores em ordem crescente e realizar a soma dos dois maiores");
		System.out.println("");
		
		int valores[] = new int[3]; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� valor"); 
			valores[i] = sc.nextInt();
			
			if(valores[i]>0) {
				System.out.println("O valor: " + valores[i] + " � positivo"); 
			} else if (valores[i]<0) {
				System.out.println("O valor: " + valores[i] + " � negativo"); 
			} else {
				System.out.println("O valor: " + valores[i] + " � igual a ZERO"); 
			}
			
			System.out.println(""); 
		}
		
		
		// Validando qual dele � o maior e em ordem crescente
		// Expor o maior valor
		// Expor a soma dos dois maiores
	
		if(valores[0] > valores[1] && valores[1] > valores[2]) {
			int[] x = maiorMenorValor(valores); 
			System.out.println("A ordem � a crescente � de: " + valores[2] + " > " + valores[1] + " > " + valores[0]);
			System.out.println("A soma dos dois maiores valores � igual a: " + (x[0] + valores[1]));
		} 
		
		if(valores[0] > valores[2] && valores[2] > valores[1]) {
			int[] x = maiorMenorValor(valores); 
			System.out.println("A ordem � a crescente � de: " + valores[1] + " > " + valores[2] + " > " + valores[0]);
			System.out.println("A soma dos dois maiores valores � igual a: " + (x[0] + valores[2]));
		} 
		
		if(valores[1] > valores[0] && valores[0] > valores[2]) {
			int[] x = maiorMenorValor(valores); 
			System.out.println("A ordem � a crescente � de: " + valores[2] + " > " + valores[0] + " > " + valores[1]);
			System.out.println("A soma dos dois maiores valores � igual a: " + (x[0] + valores[0]));
		} 
		
		if(valores[1] > valores[2] && valores[2] > valores[0]) {
			int[] x = maiorMenorValor(valores); 
			System.out.println("A ordem � a crescente � de: " + valores[0] + " > " + valores[2] + " > " + valores[1]);
			System.out.println("A soma dos dois maiores valores � igual a: " + (x[0] + valores[2]));
		} 
		
		if(valores[2] > valores[0] && valores[0] > valores[1]) {
			int[] x = maiorMenorValor(valores); 
			System.out.println("A ordem � a crescente � de: " + valores[1] + " > " + valores[0] + " > " + valores[2]);
			System.out.println("A soma dos dois maiores valores � igual a: " + (x[0] + valores[0]));
		} 
		
		if(valores[2] > valores[1] && valores[1] > valores[0]) {
			int[] x = maiorMenorValor(valores); 
			System.out.println("A ordem � a crescente � de: " + valores[0] + " > " + valores[1] + " > " + valores[2]);
			System.out.println("A soma dos dois maiores valores � igual a: " + (x[0] + valores[1]));
		} 
		
		sc.close();
	}

	private static int[] maiorMenorValor(int[] valores) {
		int maiorMenor[] = new int[2];
		maiorMenor[1] = valores[0];
		
		// a posi��o 0 ser� respons�vel pelo MAIOR VALOR
		// a posi��o 1 � o menor valor
		
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] > maiorMenor[0]) {
				maiorMenor[0] = valores[i]; 
			}  
			
			if (valores[i] < maiorMenor[1]) {
				maiorMenor[1] = valores[i]; 
			}
			
		}
		
		System.out.println("O maior valor �: " + maiorMenor[0] + " e o menor valor � " + maiorMenor[1]); 
		
		return maiorMenor; 
	}
}
