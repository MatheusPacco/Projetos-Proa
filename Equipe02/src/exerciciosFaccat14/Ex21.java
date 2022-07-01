package exerciciosFaccat14;

import java.util.Scanner;
public class Ex21 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler a hora de in�cio e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os \r\n"
				+ "minutos) e calcule a dura��o do jogo em horas, sabendo-se que o tempo m�ximo de dura��o do jogo � \r\n"
				+ "de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. \r\n"); 
		
		System.out.println("Digite o hor�rio de in�cio da partida");
		int comeco = sc.nextInt(); 

		System.out.println("Digite o hor�rio de fim da partida");
		int fim = sc.nextInt();
		
		if (comeco > fim) {
			int tempoMaximo = 24 - (comeco - fim)  ; 
			System.out.println("A partida durou cerca de " + tempoMaximo);
		} else {
			int tempoMaximo = fim - comeco; 
			System.out.println("A partida durou cerca de " + tempoMaximo);
		}
		
		
		sc.close();
	}	
}
