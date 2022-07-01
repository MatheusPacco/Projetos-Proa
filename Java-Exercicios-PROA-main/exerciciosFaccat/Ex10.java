package exerciciosFaccat;

import java.util.Scanner; 
public class Ex10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do \r\n"
				+ "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor \r\n"
				+ "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, \r\n"
				+ "calcular e escrever o custo final ao consumidor.");
		
		
		System.out.println("Digite o valor do custo de fábrica");
		float custoDeFabrica = sc.nextFloat(); 
		
		int percentualDistribuicao = 28, 
			percentualImposto = 45; 
		
		float custoTotalConsumidor = custoDeFabrica + (custoDeFabrica / 100 * percentualDistribuicao) + (custoDeFabrica / 100 * percentualImposto); 
		
		System.out.print("Digite o valor total do carro para consumidor será de: R$" + custoTotalConsumidor);	
		
		sc.close();
	}
}
