package exerciciosManzano_EstruturaRepeticaoFOR;

import java.util.Scanner;

public class Ex8 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" O algoritmo irá demonstrar a sequência a transferência de Celsius para Fahrenheit");
		
		System.out.println("A sequência a seguir:");
		System.out.println("---------------------------------------");
			
		int farh = 0;

        for(int celsius = 10; celsius <= 100; celsius += 10) {
            farh = (9 * celsius + 160) / 5;
            System.out.println(celsius + "C° = " + farh + "F°");
            
        }
	
		sc.close();
	}
}
