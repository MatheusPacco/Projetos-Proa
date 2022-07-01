package exerciciosManzano;

import java.util.Scanner;

public class G_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na \r\n"
		+ "utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, \r\n"
		+ "devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim \r\n"
		+ "C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de \r\n"
		+ "multiplicação e apresentar doze resultados de saída.\r\n"
		+ "");
	
		float[] valores = new float[4]; 
		float somaTotal = 0, multTotal = 0; 
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor");
			valores[i] = sc.nextFloat();
			
			if(i == 4) {
				System.out.println(""); 
				System.out.println("Os valores são os seguintes"); 
				for(int x = 0; x < 4; x++) {
					System.out.println(valores[x]);
				}
			}
		} 			
		
		somaTotal += valores[0] + valores[1];
		somaTotal += valores[0] + valores[2];
		somaTotal += valores[0] + valores[3];
		somaTotal += valores[3] + valores[1];
		somaTotal += valores[2] + valores[3];
		somaTotal += valores[2] + valores[1];
		
		System.out.println(somaTotal); 
		
		multTotal += valores[0] * valores[1];
		multTotal += valores[0] * valores[2];
		multTotal += valores[0] * valores[3];
		multTotal += valores[3] * valores[1];
		multTotal += valores[2] * valores[3];
		multTotal += valores[2] * valores[1];
		
		System.out.println(multTotal);
		
		sc.close();
	}
}
