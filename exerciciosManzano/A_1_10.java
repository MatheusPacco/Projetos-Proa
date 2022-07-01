package exerciciosManzano;

import java.util.Scanner;

public class A_1_10 {
	public static void main(String args[]) {
		int a, b, c, d, produto, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e \r\n"
				+ "D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro \r\n"
				+ "valor, e o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma \r\n"
				+ "(variável S) do segundo com o quarto valor");
		
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
		
		System.out.println("O produto de " + a + " com " + c + " é: " + produto);
		System.out.println("A soma de " + b + " com " + d + " é: " + soma);
		
		
		sc.close();
		
	}
}
