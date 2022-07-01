package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex11 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, \r\n"
				+ "banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do \r\n"
				+ "nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área \r\n"
				+ "do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar \r\n"
				+ "calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor \r\n"
				+ "total acumulado da área residencial. ");
		
		System.out.println(""); 
		
		int area = 0, largura = 0, comprimento = 0; 
		String resposta;
		String nomeComodo; 
		
		for(int i = 0; i <= 1;) {
			System.out.println("Digite o nome do cômodo"); 
			nomeComodo = sc.next(); 
			
			System.out.println("Digite a largura do cômodo"); 
			largura = sc.nextInt(); 
			
			System.out.println("Digite o comprimento do cômodo"); 
			comprimento = sc.nextInt(); 
			
			area = largura * comprimento;
			
			System.out.println("Deseja continuar ? SIM ou NÂO");
			resposta = sc.next().toUpperCase(); 		
			
			System.out.println("Essa foi sua resposta: " + resposta); 
			
			if(resposta.equals("NÃO")) {
				i = 2; 
			}
			
		}
		
		System.out.println("A área total da residência é igual a " + area); 
	
		
		sc.close();
	}
}
