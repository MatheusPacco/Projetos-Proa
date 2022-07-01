package exerciciosManzano;

import java.util.Scanner;
public class C_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Vamos começar o algoritmo de cálculo de volume");
		float PI = 3.14F; 
		int[] valoresEquacao = new int[2]; 
		float volumeTotal; 

		System.out.println("Digite o valor da altura da lata de óleo");
		valoresEquacao[0] = sc.nextInt(); 
		System.out.println("Digite o valor do RAIO da lata de óleo");
		valoresEquacao[1] = sc.nextInt(); 
		
		
		volumeTotal = PI * (valoresEquacao[1] * valoresEquacao[1]) * valoresEquacao[0]; 
		
		System.out.println("O volume total da lata de óleo será de: " + volumeTotal + " m3");
		
		
		sc.close();
	}
}
