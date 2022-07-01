package exerciciosManzano;

import java.util.Scanner;

public class G_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler quatro n�meros inteiros e apresentar o resultado da adi��o e multiplica��o, baseando-se na \r\n"
		+ "utiliza��o do conceito da propriedade distributiva. Ou seja, se forem lidas as vari�veis A, B, C, e D, \r\n"
		+ "devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim \r\n"
		+ "C com D. Perceba que ser� necess�rio efetuar seis opera��es de adi��o e seis opera��es de \r\n"
		+ "multiplica��o e apresentar doze resultados de sa�da.\r\n"
		+ "");
	
		float[] valores = new float[4]; 
		float somaTotal = 0, multTotal = 0; 
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i + 1) + "� valor");
			valores[i] = sc.nextFloat();
			
			if(i == 4) {
				System.out.println(""); 
				System.out.println("Os valores s�o os seguintes"); 
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
