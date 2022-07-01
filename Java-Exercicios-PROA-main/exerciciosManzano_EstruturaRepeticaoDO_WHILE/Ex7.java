package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex7 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println(" Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares \r\n"
		+ "situados na faixa numérica de 1 a 10. ");

		System.out.println("----------------------------------------------------------");
			
		int i = 0;
		
		do {
			int acumuladores = 1;
            int x = 1;
            
            while(x <= i){
                acumuladores = acumuladores * x;
                x++;
                //System.out.println("Valor acumulador atual" + acumuladores);

            }
            
            System.out.println("O fatorial do valor !" + i + " = " + acumuladores);

            i++; 
		}while(i <= 10); 
	   
		
		sc.close();
	}
}
