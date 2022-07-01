package exerciciosFaccat14;

import java.util.Scanner;
public class Ex35 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da \r\n"
				+ "seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se \r\n"
				+ "que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90. ");

		float precoGasolina = 3.30f;
		float precoAlcool = 2.90f;
		float precoFinal; 
		
		System.out.println("Digite a quantidade de litros que deseja abastecer");
		int qtdLitros = sc.nextInt(); 

		System.out.println("Escolha com que deseja abastecer");
		System.out.println("[1] Abastecer com Álcool");
		System.out.println("[2] Abastecer com Gasolina");
		int opcao = sc.nextInt();
	
		if(opcao == 1) {
			if(qtdLitros > 20){
				precoFinal = (float) ((qtdLitros * precoAlcool) * 0.95);
				System.out.println("R$ " + precoFinal);
			} else {
				precoFinal = (float) ((qtdLitros * precoAlcool) * 0.97);
				System.out.println("R$ " + precoFinal);
			}
		} else {
			if(qtdLitros > 20){
				precoFinal = (float) ((qtdLitros * precoGasolina) * 0.94);
				System.out.println("R$ " + precoFinal);
			} else {
				precoFinal = (float) ((qtdLitros * precoGasolina) * 0.96);
				System.out.println("R$ " + precoFinal);
			}
		}
		
		sc.close();
	}
}
