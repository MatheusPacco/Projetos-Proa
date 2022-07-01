package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex11 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que possibilite calcular a �rea total de uma resid�ncia (sala, cozinha, \r\n"
				+ "banheiro, quartos, �rea de servi�o, quintal, garagem, etc.). O programa deve solicitar a entrada do \r\n"
				+ "nome, a largura e o comprimento de um determinado c�modo. Em seguida, deve apresentar a �rea \r\n"
				+ "do c�modo lido e tamb�m uma mensagem solicitando do usu�rio a confirma��o de continuar \r\n"
				+ "calculando novos c�modos. Caso o usu�rio responda �NAO�, o programa deve apresentar o valor \r\n"
				+ "total acumulado da �rea residencial. ");
		
		System.out.println(""); 
		
		int area = 0, largura = 0, comprimento = 0; 
		String resposta;
		String nomeComodo; 
		
		for(int i = 0; i <= 1;) {
			System.out.println("Digite o nome do c�modo"); 
			nomeComodo = sc.next(); 
			
			System.out.println("Digite a largura do c�modo"); 
			largura = sc.nextInt(); 
			
			System.out.println("Digite o comprimento do c�modo"); 
			comprimento = sc.nextInt(); 
			
			area = largura * comprimento;
			
			System.out.println("Deseja continuar ? SIM ou N�O");
			resposta = sc.next().toUpperCase(); 		
			
			System.out.println("Essa foi sua resposta: " + resposta); 
			
			if(resposta.equals("N�O")) {
				i = 2; 
			}
			
		}
		
		System.out.println("A �rea total da resid�ncia � igual a " + area); 
	
		
		sc.close();
	}
}
