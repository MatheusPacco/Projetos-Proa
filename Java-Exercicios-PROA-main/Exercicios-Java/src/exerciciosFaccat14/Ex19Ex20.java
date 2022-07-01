package exerciciosFaccat14;

import java.util.Scanner;
public class Ex19Ex20 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles."); 
		
		System.out.println("Digite o primeiro valor!");
		float valor1 = sc.nextFloat(); 

		System.out.println("Digite o segundo valor!");
		float valor2 = sc.nextFloat(); 
		
		
		if (valor1 > valor2) {
			System.out.println("O valor 1 é maior que o segundo valor"); 
			System.out.println(valor1 + " > " + valor2);
		}
		else {
			System.out.println("O valor 2 é maior que o valor 1");
			System.out.println(valor2 + " > " + valor1);
		}
		
		sc.close();
	}	
}
