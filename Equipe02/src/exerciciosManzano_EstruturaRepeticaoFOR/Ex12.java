package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex12 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que efetue a leitura de valores positivos inteiros at� que um valor negativo \r\n"
				+ "seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo \r\n"
				+ "usu�rio.  ");
		
		System.out.println(""); 
		
		int maior = 0 , menor = 0, valorQualquer; 

		for(int i = 0; i <= 1;) {
			System.out.println("Digite um valor qualquer"); 
			valorQualquer = sc.nextInt(); 
			
			if(valorQualquer > maior) {
				maior = valorQualquer; 
			} else if (menor > valorQualquer) {
				menor = valorQualquer; 
				i = 2; 
			}
		}
		
		System.out.println("O maior valor �: "+ maior);
		System.out.println("O menor valor �: "+ menor);
		sc.close();
	}
}
