package exerciciosFaccat14;

import java.util.Scanner;
public class Ex33 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite dois valores e informe se eles s�o iguais, ou se um � maior que o outro");
	
		System.out.println("Digite o valor UM");
		int valorUm = sc.nextInt(); 
		
		System.out.println("Digite o valor UM");
		int valorDois = sc.nextInt(); 
		
		if(valorUm == valorDois) {
			System.out.println("OS DOIS VALORES S�O IGUAIS"); 
		} else if(valorUm > valorDois) {
			System.out.println("O PRIMERIO VALOR � MAIOR QUE O SEGUNDO"); 
		} else {
			System.out.println("O SEGUNDO VALOR � MAIOR QUE O PRIMEIRO"); 
		}
		
		sc.close();
	}
}
