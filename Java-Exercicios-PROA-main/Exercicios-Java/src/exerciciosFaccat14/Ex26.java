package exerciciosFaccat14;

import java.util.Scanner;
public class Ex26 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e \r\n"
				+ "quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade \r\n"
				+ "m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual \r\n"
				+ "a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar \r\n"
				+ "compra'. ");
		
		
		System.out.println("Digite a quantidade atual do estoque"); 
		int estoqueAtual = sc.nextInt();
		
		System.out.println("Digite a quantidade m�xima em estoque"); 
		int maxEstoque = sc.nextInt();
		
		System.out.println("Digite a quantidade min�ma em estoque"); 
		int minEstoque = sc.nextInt();
		
		int qtdMedia = (maxEstoque + minEstoque) / 2; 
		
		if (estoqueAtual >= qtdMedia) {
			System.out.println("A quantidade m�dia escrever a mensagem 'N�o efetuar compra"); 
		} else {
			System.out.println("Efetuar a compra de estoque"); 
		}
		
		sc.close();
	}	
}
