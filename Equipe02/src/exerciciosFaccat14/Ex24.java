package exerciciosFaccat14;

import java.util.Scanner;
public class Ex24 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que \r\n"
		+ "ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que \r\n"
		+ "ultrapassar este valor, calcular e escrever o seu sal�rio total. ");
		
		System.out.println("Digite o sal�rio fixo do funcion�rio"); 
		float salario = sc.nextFloat(); 
		
		System.out.println("Digite o valor total de vendas efetuadas"); 
		float vendas = sc.nextFloat();
		
		if (vendas <= 1500.00) {
			float salarioFinal = (float) (salario + (vendas * 1.03)); 
			System.out.println("O sal�rio total com base na venda de R$" + vendas + ", ser� de R$ " + salarioFinal );
			
		} else {
			float salarioFinal = (float) (salario + (vendas * 1.05)); 
			System.out.println("O sal�rio total com base na venda de R$" + vendas + ", ser� de R$ " + salarioFinal );
		}; 
		
		
		sc.close();
	}	
}
