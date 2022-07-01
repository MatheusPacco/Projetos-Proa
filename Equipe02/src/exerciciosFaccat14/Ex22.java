package exerciciosFaccat14;

import java.util.Scanner;
public class Ex22 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais \r\n"
		+ "de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. \r\n"
		+ "Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva \r\n"
		+ "o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas \r\n"
		+ "(considere que o mês possua 4 semanas exatas).");
		
		int jornadaDeTrabalho = 160; 
		
		System.out.println("Digite o total de horas trabalhadas no mês");
		int horasTotais = sc.nextInt(); 
		
		System.out.println("Qual o valor de pagamento por hora");
		int precoHora = sc.nextInt();
		
		float salario = horasTotais * precoHora; 
		
		
		if (horasTotais > jornadaDeTrabalho) {
			int horasExtras = horasTotais - jornadaDeTrabalho; 
			float acrescimoSalarial = (float) (horasExtras * (precoHora * 1.5));
			float salarioTotal = salario + acrescimoSalarial;
			
			System.out.println("O salário total, com base no acréscimo de R$ " + acrescimoSalarial + " por conta das " +  horasExtras + " horas extras");
			System.out.println("Será de R$ " + salarioTotal); 
		} else {
			System.out.println("Seu salário é de R$ " + salario); 
		}
		
		
		sc.close();
	}	
}
