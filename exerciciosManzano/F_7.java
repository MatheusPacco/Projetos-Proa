package exerciciosManzano;

import java.util.Scanner;

public class F_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de \r\n"
		+ "forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da \r\n"
		+ "variável A. Apresentar os valores trocados");
	
		float[] valores = new float[3]; 
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor");
			valores[i] = sc.nextFloat();
		} 			
		
		System.out.println("A = " + valores[0]);
		System.out.println("B = " + valores[1]);
		
		valores[2] = valores[0]; 
		valores[0] = valores[1];
		valores[1] = valores[2];
		
		System.out.println("Os valores foram trocados, agora está a seguinte ordem:"); 
		System.out.println("A = " + valores[0]); 
		System.out.println("B = " + valores[1]); 
		
		sc.close();
	}
}
