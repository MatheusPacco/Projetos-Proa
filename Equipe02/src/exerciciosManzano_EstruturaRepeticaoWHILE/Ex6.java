package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex6 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apresentar todos os n�meros divis�veis por 4 que sejam menores que 200. Para verificar se o \r\n"
				+ "n�mero � divis�vel por 4, efetuar dentro da malha a verifica��o l�gica desta condi��o com a \r\n"
				+ "instru��o se, perguntando se o n�mero � divis�vel; sendo, mostre-o; n�o sendo, passe para o \r\n"
				+ "pr�ximo passo. A vari�vel que controlar� o contador deve ser iniciada com o valor 1.");
		
		int i = 1; 
		
		while(i <= 200) {
			if(i % 4 == 0) {
				System.out.println("O valor a seguir �: " + i + " divis�vel por 4"); 
			}
			
			i++; 
		}
		
		sc.close();
	}
}
