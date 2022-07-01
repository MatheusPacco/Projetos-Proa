package exerciciosFaccat14;

import java.util.Scanner;
public class Ex24 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que \r\n"
		+ "ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que \r\n"
		+ "ultrapassar este valor, calcular e escrever o seu salário total. ");
		
		System.out.println("Digite o salário fixo do funcionário"); 
		float salario = sc.nextFloat(); 
		
		System.out.println("Digite o valor total de vendas efetuadas"); 
		float vendas = sc.nextFloat();
		
		if (vendas <= 1500.00) {
			float salarioFinal = (float) (salario + (vendas * 1.03)); 
			System.out.println("O salário total com base na venda de R$" + vendas + ", será de R$ " + salarioFinal );
			
		} else {
			float salarioFinal = (float) (salario + (vendas * 1.05)); 
			System.out.println("O salário total com base na venda de R$" + vendas + ", será de R$ " + salarioFinal );
		}; 
		
		
		sc.close();
	}	
}
