package exerciciosFaccat14;

import java.util.Scanner;
public class Ex26 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e \r\n"
				+ "quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade \r\n"
				+ "média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual \r\n"
				+ "a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar \r\n"
				+ "compra'. ");
		
		
		System.out.println("Digite a quantidade atual do estoque"); 
		int estoqueAtual = sc.nextInt();
		
		System.out.println("Digite a quantidade máxima em estoque"); 
		int maxEstoque = sc.nextInt();
		
		System.out.println("Digite a quantidade miníma em estoque"); 
		int minEstoque = sc.nextInt();
		
		int qtdMedia = (maxEstoque + minEstoque) / 2; 
		
		if (estoqueAtual >= qtdMedia) {
			System.out.println("A quantidade média escrever a mensagem 'Não efetuar compra"); 
		} else {
			System.out.println("Efetuar a compra de estoque"); 
		}
		
		sc.close();
	}	
}
