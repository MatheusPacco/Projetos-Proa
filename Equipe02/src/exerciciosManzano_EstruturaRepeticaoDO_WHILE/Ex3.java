package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex3 {
public static void main(String args[]) {
	
		FuncoesDO_WHILE Divisivel = new FuncoesDO_WHILE();
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Mostrar todos os valores divisíveis por 4 dentro de um limite");
		
		System.out.println("----------------------------------------------------------");
			
		System.out.println("Digite o valor máximo");
		int valueMax = sc.nextInt();
		
		int cont = 1; 
		
		do{
			
			Divisivel.DivisivelPorQuatrp(cont);
			cont++;
			
		}while(cont <= valueMax); 
			
		sc.close();
	}
}
