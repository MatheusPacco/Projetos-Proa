package exerciciosFaccat14;

import java.util.Scanner;
public class Ex25 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e \r\n"
				+ "escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior \r\n"
				+ "ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo");
		
		
		System.out.println("Digite o seu n�mero de conta"); 
		int idConta = sc.nextInt(); 
		
		System.out.println("Digite o seu Saldo"); 
		float saldoConta = sc.nextFloat(); 
		
		System.out.println("Digite o seu D�bito"); 
		float debitoConta = sc.nextFloat(); 
		
		System.out.println("Digite o seu Cr�dito"); 
		float credito = sc.nextFloat(); 
		
		float saldoAtual = saldoConta - debitoConta + credito; 
		
		if (saldoAtual >= 0) {
			System.out.println("Sua conta de n�mero: " + idConta + " e seu saldo atual � positivo!");
			System.out.println("Seu saldo � de: R$" + saldoAtual);
		} else {
			System.out.println("Sua conta de n�mero: " + idConta + " e seu saldo atual � negativo!");
			System.out.println("Seu saldo � de: R$" + saldoAtual);
		}
				
		sc.close();
	}	
}
