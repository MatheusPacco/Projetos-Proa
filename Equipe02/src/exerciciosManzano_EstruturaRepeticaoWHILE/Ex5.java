package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex5 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar \r\n"
				+ "se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução \r\n"
				+ "se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo. ");
		
		int i = 1; 
		int totalSoma = 0; 
		
		while(i <= 20) {
			if(!(i % 2 == 0)) {
				totalSoma += i; 
			}
			i++; 
		}
		
		System.out.println("A soma total de todos os valores inteiros e ímpares até 20, é igual a: " + totalSoma);
		sc.close();
	}
}
