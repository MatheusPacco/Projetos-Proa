package exerciciosManzano;

import java.util.Scanner;

public class F_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler dois valores (inteiros, reais ou caracteres) para as vari�veis A e B, e efetuar a troca dos valores de \r\n"
		+ "forma que a vari�vel A passe a possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da \r\n"
		+ "vari�vel A. Apresentar os valores trocados");
	
		float[] valores = new float[3]; 
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o " + (i + 1) + "� valor");
			valores[i] = sc.nextFloat();
		} 			
		
		System.out.println("A = " + valores[0]);
		System.out.println("B = " + valores[1]);
		
		valores[2] = valores[0]; 
		valores[0] = valores[1];
		valores[1] = valores[2];
		
		System.out.println("Os valores foram trocados, agora est� a seguinte ordem:"); 
		System.out.println("A = " + valores[0]); 
		System.out.println("B = " + valores[1]); 
		
		sc.close();
	}
}
