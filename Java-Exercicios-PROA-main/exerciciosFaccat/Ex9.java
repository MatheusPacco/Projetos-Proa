package exerciciosFaccat;

import java.util.Scanner; 
public class Ex9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o seu salário e iremos calcular seu reajuste salarial");
		float salario = sc.nextFloat(); 
		
		System.out.println("Digite o percentual de reajuste salarial");
		int percentual = sc.nextInt(); 
		
		float reajusteTotal =  salario + (salario*percentual / 100); 
		
		System.out.println("O seu salario total, com base no percentual de reajuste é de: R$" + reajusteTotal + " total");
		
		sc.close();
	}
}
