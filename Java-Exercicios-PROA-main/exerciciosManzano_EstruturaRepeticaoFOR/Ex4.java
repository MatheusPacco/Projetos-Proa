package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex4 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("iremos apresentar todos os valores ímpares dentro do limite que você digitar !");
		int valorMaximo = sc.nextInt(); 
				
		int validadorPar = 2; 
		
		System.out.println("Os valores ímpares dentro de " + valorMaximo + " são:"); 
		System.out.println("-----------------------------------"); 
		
		for (int i = 1; i <= valorMaximo; i++) {
			if(!(i % validadorPar == 0)) {
				System.out.println(i); 
			}
		}
		
		sc.close();
	}
}
