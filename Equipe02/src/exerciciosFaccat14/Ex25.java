package exerciciosFaccat14;

import java.util.Scanner;
public class Ex25 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e \r\n"
				+ "escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior \r\n"
				+ "ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo");
		
		
		System.out.println("Digite o seu número de conta"); 
		int idConta = sc.nextInt(); 
		
		System.out.println("Digite o seu Saldo"); 
		float saldoConta = sc.nextFloat(); 
		
		System.out.println("Digite o seu Débito"); 
		float debitoConta = sc.nextFloat(); 
		
		System.out.println("Digite o seu Crédito"); 
		float credito = sc.nextFloat(); 
		
		float saldoAtual = saldoConta - debitoConta + credito; 
		
		if (saldoAtual >= 0) {
			System.out.println("Sua conta de número: " + idConta + " e seu saldo atual é positivo!");
			System.out.println("Seu saldo é de: R$" + saldoAtual);
		} else {
			System.out.println("Sua conta de número: " + idConta + " e seu saldo atual é negativo!");
			System.out.println("Seu saldo é de: R$" + saldoAtual);
		}
				
		sc.close();
	}	
}
