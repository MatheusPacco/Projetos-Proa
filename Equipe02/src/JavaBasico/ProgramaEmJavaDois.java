package JavaBasico;

import java.util.Scanner; 

public class ProgramaEmJavaDois {

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in); 
			
		System.out.println("Digite um n�mero"); 
		int numero = sc.nextInt();
		
		System.out.println("Digite um valor"); 
		int numeroDois = sc.nextInt(); 
		
		int soma= numero + numeroDois;
		System.out.println("A soma das duas vari�veis � de " + soma); 
		
	}
}
