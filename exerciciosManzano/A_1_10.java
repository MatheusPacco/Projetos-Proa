package exerciciosManzano;

import java.util.Scanner;

public class A_1_10 {
	public static void main(String args[]) {
		int a, b, c, d, produto, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (vari�veis A, B, C e \r\n"
				+ "D). Ao final o programa deve apresentar o resultado do produto (vari�vel P) do primeiro com o terceiro \r\n"
				+ "valor, e o resultado do produto (vari�vel P) do primeiro com o terceiro valor, e o resultado da soma \r\n"
				+ "(vari�vel S) do segundo com o quarto valor");
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		c = sc.nextInt();
		
		System.out.println("Digite o quarto valor: ");
		d = sc.nextInt();
		
		produto = a * c;
		soma = b + d;
		
		System.out.println("O produto de " + a + " com " + c + " �: " + produto);
		System.out.println("A soma de " + b + " com " + d + " �: " + soma);
		
		
		sc.close();
		
	}
}
