package exerciciosFaccat14;

import java.util.Scanner;
public class Ex18 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela \r\n"
				+ "poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu). "); 
		
		System.out.println("Digite o seu ano de nascimento");
		int anoIdade = sc.nextInt(); 	
		
		System.out.println("Digite o ano atual");
		int anoAtual = sc.nextInt();
		
		int idadeDaPessoa = anoAtual - anoIdade; 
		
		
		if (idadeDaPessoa >= 18) {
			System.out.println("Parab�ns voc� j� pode votar"); 
		}
		else {
			System.out.println("Voc� n�o pode votar"); 
		}
		
		sc.close();
	}	
}
