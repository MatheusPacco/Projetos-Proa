package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Elaborar um programa que efetue o c�lculo e no final apresente o somat�rio do n�mero de gr�os de \r\n"
		+ "trigo que se pode obter num tabuleiro de xadrez, obedecendo � seguinte regra: colocar um gr�o de \r\n"
		+ "trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior.");

		System.out.println("----------------------------------------------------------");
			
		System.out.println("Digite o valor m�ximo");
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
			
			
			System.out.println("O acumulador atual � :" + acumuladorFinal);
		}while(cont <= valueMax); 
			
		sc.close();
	}
}
