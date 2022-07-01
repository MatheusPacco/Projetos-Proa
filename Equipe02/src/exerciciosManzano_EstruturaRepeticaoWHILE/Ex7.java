package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex7 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. Deve ser \r\n"
				+ "considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. Observe que \r\n"
				+ "neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).");
		
		System.out.println("");
		
		System.out.println("digite o valor que deseja saber a pot�ncia at� 15"); 
		int base = sc.nextInt(); 
		
		int i = 0, x = 0; 
		
		while(i <= 15) {
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
