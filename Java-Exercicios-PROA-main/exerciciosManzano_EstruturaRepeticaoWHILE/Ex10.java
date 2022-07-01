package exerciciosManzano_EstruturaRepeticaoWHILE;

import java.util.Scanner;

public class Ex10 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		    
		System.out.println("Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de \r\n"
				+ "10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O \r\n"
				+ "programa deve apresentar os valores das duas temperaturas. A fórmula de conversão \r\n"
				+ "é 5 + 1609 = C F , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.");
		
		
		System.out.println("");
	
		int celsius = 10, farh = 0;

        while(celsius <= 100) {
            farh = (9 * celsius + 160) / 5;
            System.out.println(celsius + "C° = " + farh + "F°");


            celsius += 10;
        }
		
		sc.close();
	}
}
