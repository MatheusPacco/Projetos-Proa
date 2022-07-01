package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de \r\n"
		+ "trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um grão de \r\n"
		+ "trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior.");

		System.out.println("----------------------------------------------------------");
			
		System.out.println("Digite o valor máximo");
		int valueMax = sc.nextInt(); 
		
		int cont = 1, acumulador = 1, acumuladorFinal = 0; 
		
		do{
			
			acumulador =  acumulador * 2; 
			acumuladorFinal += acumulador; 
			
			if(cont == 1) {
				acumuladorFinal = 1; 
				acumulador = 1;
			}; 
			
			cont++;
			
			
			System.out.println("O acumulador atual é :" + acumuladorFinal);
		}while(cont <= valueMax); 
			
		sc.close();
	}
}
