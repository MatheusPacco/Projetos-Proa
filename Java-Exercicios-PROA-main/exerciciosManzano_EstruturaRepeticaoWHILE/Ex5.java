package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex5 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Apresentar todos os valores num�ricos inteiros �mpares situados na faixa de 0 a 20. Para verificar \r\n"
				+ "se o n�mero � �mpar, efetuar dentro da malha a verifica��o l�gica desta condi��o com a instru��o \r\n"
				+ "se, perguntando se o n�mero � �mpar; sendo, mostre-o; n�o sendo, passe para o pr�ximo passo. ");
		
		int i = 1; 
		int totalSoma = 0; 
		
		while(i <= 20) {
			if(!(i % 2 == 0)) {
				totalSoma += i; 
			}
			i++; 
		}
		
		System.out.println("A soma total de todos os valores inteiros e �mpares at� 20, � igual a: " + totalSoma);
		sc.close();
	}
}
