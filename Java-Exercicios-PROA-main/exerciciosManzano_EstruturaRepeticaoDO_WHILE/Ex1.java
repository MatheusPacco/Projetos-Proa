package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner; 

public class Ex1 {
	public static void main(String args[]) {
		
		FuncoesDO_WHILE Chamada = new FuncoesDO_WHILE();
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Apresentar os quadrados dos n�meros inteiros de 15 a 200");
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Digite o valor min�mo");
		int valueMin = sc.nextInt();
		
		System.out.println("Digite o valor m�ximo");
		int valueMax = sc.nextInt();
		
		int cont = valueMin; 
		
		do{
			System.out.println(cont + " ^ 2 = " + Chamada.Chamada(cont)); 
			cont++;
		}while(cont <= valueMax); 
			
		sc.close();
	}
	

}
