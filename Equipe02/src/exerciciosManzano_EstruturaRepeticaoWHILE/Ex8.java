package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex8 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Elaborar um programa que apresente como resultado o valor de uma potência de uma base \r\n"
				+ "qualquer elevada a um expoente qualquer, ou seja, de BE\r\n"
				+ ", em que B é o valor da base e E o valor \r\n"
				+ "do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do \r\n"
				+ "portuguol (^).");
		
		System.out.println("");
		
		System.out.println("digite o valor que deseja saber a potência até 15"); 
		int base = sc.nextInt(); 
		
		System.out.println("Digite até que potência o valor " + base + " será elevado"); 
		int potencial = sc.nextInt(); 
		
		int i = 0, x = 0; 
		
		while(i <= potencial) {
			int resultadoPotencial = 1; 
			
			while(x <= i) {
				resultadoPotencial *= base; 
				
				if(x == 0) {
					resultadoPotencial = 1; 
				} 
				
				if (x == 1) {
					resultadoPotencial = base; 
				}	
				
				// System.out.println("Olha o valor ai" + resultadoPotencial + "Valor do X = " + x);
				
				x++;
			}
			
			System.out.println(base + " ^ " + i + " = " + resultadoPotencial);
			x = 0; 
			
			i++; 
		}
		
		sc.close();
	}
}
