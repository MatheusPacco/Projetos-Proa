package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer");
		
		System.out.println(""); 
		System.out.println("Digite o valor que deseja saber a tabuada!"); 
		int base = sc.nextInt(); 
		
		int i = 1; 
		
		while(i <= 10) {
			System.out.println(base + " X " + i + " = " + (base*i)); 
			i++; 
		}
		
		sc.close();
	}
}
