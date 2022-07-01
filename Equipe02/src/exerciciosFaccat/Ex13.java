package exerciciosFaccat;

import java.util.Scanner; 
public class Ex13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		int[] notasDeAula = new int[3]; 
		float mediaFinal; 
		
		
		for (int i = 0 ; i < notasDeAula.length; i++ ) {
			System.out.println("Digite o valor da nota " + i);
			notasDeAula[i] = sc.nextInt(); 		
		}
		
		for (int x = 0 ; x < notasDeAula.length; x++ ) {
			System.out.println(notasDeAula[x]);
		}
		
		mediaFinal = ((notasDeAula[0] * 2) + (notasDeAula[1] * 3) + (notasDeAula[2] * 5)) / 10; 
		System.out.println("A média final da aula será de: " + mediaFinal);
		
		sc.close();
	}
}
