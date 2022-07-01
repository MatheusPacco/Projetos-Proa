package exerciciosFaccat14;

import java.util.Scanner;
public class Ex37 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá \r\n"
		+ "ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de \r\n"
		+ "morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.");
		
		
		System.out.println("Digite a quantidade em KGs de maçãs de deseja comprar"); 
		int kgMacas = sc.nextInt(); 
		
		System.out.println("Digite a quantidade em KGs de morangos de deseja comprar"); 
		int kgMorango = sc.nextInt(); 
		
		float[] kgTotal_valorTotal = CalculandoPreco_Peso(kgMacas, kgMorango);  
		
		System.out.println("");
		System.out.println(kgTotal_valorTotal[0] +" kg");
		System.out.println("R$ " + kgTotal_valorTotal[1]);
	
		float precoFinal; 
		
		if (kgTotal_valorTotal[0] > 8 || kgTotal_valorTotal[1] > 25.00 ) {
			precoFinal = (float) (kgTotal_valorTotal[1] * 0.90);  
			
			System.out.println("O valor total a ser pago pelo consumidor será de: R$ " + precoFinal); 
		} else {
			precoFinal = kgTotal_valorTotal[1]; 
			System.out.println("O valor total a ser pago pelo consumidor será de: R$ " + precoFinal); 
		}
		
		sc.close();
	}
	
	public static float[] CalculandoPreco_Peso(int quantidadeMacas, int quantidadeMorango) {
		float kgTotal_valorTotal[] = new float[2]; 

		float precoMaca = 2.50F, 
			  precoDescontoMaca = 2.20F; 
		
		float precoMorango = 1.80F, 
		      precoDescontoMorango = 1.50F; 
		
		kgTotal_valorTotal[0] = quantidadeMacas + quantidadeMorango; 
		
		if(quantidadeMacas > 5) {
			kgTotal_valorTotal[1] += quantidadeMacas * precoDescontoMaca; 
		} else {
			kgTotal_valorTotal[1] += quantidadeMacas * precoMaca; 
		}
		
		if(quantidadeMorango > 5) {
			kgTotal_valorTotal[1] += quantidadeMorango * precoDescontoMorango; 
		} else {
			kgTotal_valorTotal[1] += quantidadeMorango * precoMorango; 
		}
		
		return kgTotal_valorTotal; 
	}
}
