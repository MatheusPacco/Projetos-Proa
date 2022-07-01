package exerciciosManzano_4;

import java.util.Scanner;

public class L_4 {
	public static void main(String args[]) {
		
		System.out.println("Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com \r\n"
				+ "sa�da uma das seguintes mensagens: \"Ilmo Sr.\", se o sexo informado como masculino, ou a \r\n"
				+ "mensagem \"Ilma Sra.\", para o sexo informado como feminino. Apresente tamb�m junto da \r\n"
				+ "mensagem de sauda��o o nome previamente informado.");
		
		String nomeUser, genero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nomeUser = sc.next();
		
		System.out.println("Qual seu genero? [M] - Masculino | [F] - Feminino");
		genero = sc.next().toUpperCase();
		
		
		if(genero.equals("M")) {
			System.out.println("Ilustr�ssimo senhor " + nomeUser);
		}
		
		if(genero.equals("F")) {
			System.out.println("Ilustr�ssima senhora " + nomeUser);
		}
		
		sc.close();
	}
}
