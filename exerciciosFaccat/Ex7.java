package exerciciosFaccat;

import java.util.Scanner; 
public class Ex7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
	
		System.out.print("Digite quantos anos de vida você tem");
		int anos = sc.nextInt(); 
		
		System.out.println("Digite quantos meses de vida você tem");
		int mes = sc.nextInt(); 
		
		System.out.println("Digite quantos dias de vida você tem");
		int dia = sc.nextInt(); 
		
		int diasTotaisDeVida = (anos*365) + (mes*30) + dia;
		
		System.out.print("Você já viveu: " + diasTotaisDeVida);
		
		sc.close();
	}
}
