package exerciciosManzano_4;

import java.util.Scanner;

public class G_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Efetuar a leitura de quatro n�meros inteiros e apresentar os n�meros que s�o divis�veis por 2 e 3. "); 
		
		
		int[] valores = new int[4]; 
		int nValores = 0; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite a " + (i + 1) + "� nota"); 
			valores[i] = sc.nextInt();	
			
			if(valores[i] % 2 == 0 && valores[i] % 3 == 0 ) {
				nValores += 1; 
				System.out.println("O valor: " + valores[i] + " � divis�vel por 2 e por 3"); 
			}
		}
		
		System.out.println("O n�mero de valores divis�veis por 2 e por 3 � de: " + nValores);
		
		
		sc.close();	
	}
}	
