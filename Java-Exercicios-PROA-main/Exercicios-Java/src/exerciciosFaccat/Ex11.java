package exerciciosFaccat;

import java.util.Scanner; 
public class Ex11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, \r\n"
				+ "mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele \r\n"
				+ "efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas \r\n"
				+ "vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do \r\n"
				+ "vendedor");
		
		float pli = 5;
		
		System.out.println("Digite o salário fixo");
		float salario = sc.nextFloat(); 		
		
		System.out.println("Digite a quantidade de carros vendidos");
		int qtdCarrosVendidos = sc.nextInt();
		
		System.out.println("Digite a comissão fixa pela venda de cada carro");
		float comissao = sc.nextFloat();
		
		System.out.println("Digite o valor total de suas vendas");
		float vendasTotais = sc.nextFloat();
		
		
		float pliTotal = vendasTotais/100 * 5;
		float comissaoPorCarrosVendidos = comissao * qtdCarrosVendidos; 
		float salarioTotal = salario + comissaoPorCarrosVendidos + pliTotal; 
		
		System.out.println("O salário total do funcionário será de R$: " + salarioTotal);
		
		
		sc.close();
	}
}
