package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex2 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de \r\n"
		+ "1 at� 500. ");
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Digite o valor min�mo");
		int valueMin = sc.nextInt();
		
		System.out.println("Digite o valor m�ximo");
		int valueMax = sc.nextInt();
		
		int cont = valueMin, acumulador = 0;
		do{
			if(cont%2==0) {
				acumulador += cont;
			}
			
			cont++;
			
		}while(cont <= valueMax); 
		
		System.out.println("A Somat�ria de todos os valores PARES, na faixa de " + valueMin + " _ " + valueMax + " � igual a:" + acumulador); 
			
		sc.close();
	}
}
