package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex6 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o \r\n"
				+ "número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a \r\n"
				+ "instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o \r\n"
				+ "próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.");
		
		int i = 1; 
		
		while(i <= 200) {
			if(i % 4 == 0) {
				System.out.println("O valor a seguir é: " + i + " divisível por 4"); 
			}
			
			i++; 
		}
		
		sc.close();
	}
}
