package exerciciosFaccat;

import java.util.Scanner; 
public class areaDoRetangulo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite o valor da base do ret�ngulo"); 
		int base = sc.nextInt(); 
		
		System.out.println("Digite o valor da altura do ret�ngulo"); 
		int altura = sc.nextInt(); 
		
		System.out.println("A �rea do ret�ngulo � a multiplica��o de sua base pela sua altura");
		System.out.println("A �rea do ret�ngulo atribuido � de: " + (altura * base) + "M^2");

		sc.close();
	}
}
