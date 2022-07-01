package exerciciosManzano_EstruturaRepeticaoWHILE;
import java.util.Scanner;

public class Ex9 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		    
		System.out.println(" Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo");
		
		
		System.out.println("");
	
		int cont = 1, anterior = 0,atual = 0, proximo = 1;
		
		   
	    while(cont <= 15) {
	        anterior = atual;
	        atual = proximo;
	        proximo = atual + anterior;

	        cont++;
	        System.out.println(atual);
	    }
		
		sc.close();
	}
}



