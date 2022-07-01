package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex9 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a leitura de 10 valores num�ricos e apresente no final o total do \r\n"
				+ "somat�rio e a m�dia aritm�tica dos valores lidos.");
		
		System.out.println("Digite a quantidade de valores que dever� ser lido"); 
		int nArray = sc.nextInt(); 
		int[] valores = new int[nArray]; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� valor"); 
			valores[i] = sc.nextInt(); 
			
			if(i == (valores.length - 1)) {
				for(int i1 = 0; i1 < valores.length; i1++ ) {
					System.out.println(valores[i1]); 
				}
			}
		}
		
		int somaTotalFinal = SomaTotal(valores); 
		System.out.println("A somat�ria total dos valores � de: " + somaTotalFinal);
		System.out.println("A m�dia aritm�tica dos valores � de: " + Media(somaTotalFinal, valores.length));
		
		
		sc.close();
	}
	
	public static int SomaTotal(int[] valores) {
		int SomaTotal = 0; 
		
		for(int i = 0; i < valores.length; i++) {
			SomaTotal += valores[i];  
		}
		
		return SomaTotal;
	}
	
	public static float Media(int somaTotalFinal,int tamanhoArray) {
		float mediaFinal = somaTotalFinal / tamanhoArray;
		return mediaFinal; 
	}
}
