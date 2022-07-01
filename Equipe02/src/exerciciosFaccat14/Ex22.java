package exerciciosFaccat14;

import java.util.Scanner;
public class Ex22 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais \r\n"
		+ "de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. \r\n"
		+ "Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva \r\n"
		+ "o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas \r\n"
		+ "(considere que o m�s possua 4 semanas exatas).");
		
		int jornadaDeTrabalho = 160; 
		
		System.out.println("Digite o total de horas trabalhadas no m�s");
		int horasTotais = sc.nextInt(); 
		
		System.out.println("Qual o valor de pagamento por hora");
		int precoHora = sc.nextInt();
		
		float salario = horasTotais * precoHora; 
		
		
		if (horasTotais > jornadaDeTrabalho) {
			int horasExtras = horasTotais - jornadaDeTrabalho; 
			float acrescimoSalarial = (float) (horasExtras * (precoHora * 1.5));
			float salarioTotal = salario + acrescimoSalarial;
			
			System.out.println("O sal�rio total, com base no acr�scimo de R$ " + acrescimoSalarial + " por conta das " +  horasExtras + " horas extras");
			System.out.println("Ser� de R$ " + salarioTotal); 
		} else {
			System.out.println("Seu sal�rio � de R$ " + salario); 
		}
		
		
		sc.close();
	}	
}
