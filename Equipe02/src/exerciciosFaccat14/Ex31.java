package exerciciosFaccat14;

import java.util.Scanner;
public class Ex31 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam \r\n"
				+ "ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma \r\n"
				+ "dos outros 2 lados.");
	
		int[] arrayLados = RecebeValores(); 
		
		System.out.println(arrayLados[0]);
		
		if((arrayLados[0] + arrayLados[1]) > arrayLados[2] && (arrayLados[0] + arrayLados[2]) > arrayLados[1] && (arrayLados[1] + arrayLados[2]) > arrayLados[0]) {
			System.out.println("Os valores digitados formam um triângulo!!"); 
		} else {
			System.out.println("Os valores digitados não formam um triângulo!!"); 
		}
		
		sc.close();
	}

	// A função deve estar fora da CLASS main
	
	private static int[] RecebeValores() {
		//Tive que instânciar o objeto mais uma vez 
		Scanner chamada = new Scanner(System.in); 
		
		int[] arrayLados = new int[3]; 
		
 		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o: " + (i + 1) + "º lado do triângulo");
			arrayLados[i] = chamada.nextInt(); 
		}
		
		return arrayLados;
	}	
}
