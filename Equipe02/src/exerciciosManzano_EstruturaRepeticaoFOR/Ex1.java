package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex1 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qualquer valor para que possamos reralizar sua tabuada do 1 - 10");
		int valor = sc.nextInt(); 
		
		System.out.println("tabuada do " + valor);
		System.out.println("-----------------------------------"); 
		for (int i = 1; i < 11; i++) {
			System.out.println(valor + " * " + i + " == " + valor * i);
		}
		
		sc.close();
	}
}