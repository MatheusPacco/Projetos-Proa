package exerciciosFaccat;

import java.util.Scanner; 
public class areaDoRetangulo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite o valor da base do retângulo"); 
		int base = sc.nextInt(); 
		
		System.out.println("Digite o valor da altura do retângulo"); 
		int altura = sc.nextInt(); 
		
		System.out.println("A área do retângulo é a multiplicação de sua base pela sua altura");
		System.out.println("A área do retângulo atribuido é de: " + (altura * base) + "M^2");

		sc.close();
	}
}
