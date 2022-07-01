package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex9 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do \r\n"
				+ "somatório e a média aritmética dos valores lidos.");
		
		System.out.println("Digite a quantidade de valores que deverá ser lido"); 
		int nArray = sc.nextInt(); 
		int[] valores = new int[nArray]; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor"); 
			valores[i] = sc.nextInt(); 
			
			if(i == (valores.length - 1)) {
				for(int i1 = 0; i1 < valores.length; i1++ ) {
					System.out.println(valores[i1]); 
				}
			}
		}
		
		int somaTotalFinal = SomaTotal(valores); 
		System.out.println("A somatória total dos valores é de: " + somaTotalFinal);
		System.out.println("A média aritmética dos valores é de: " + Media(somaTotalFinal, valores.length));
		
		
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
