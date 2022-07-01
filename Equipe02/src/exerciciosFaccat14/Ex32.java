package exerciciosFaccat14;

import java.util.Scanner;
public class Ex32 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome \r\n"
				+ "do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. ");
	
		
		System.out.println("Digite o nome do primeiro time"); 
		String nomeTime1 = sc.next(); 
		System.out.println("Digite o nome número de gols que o time " + nomeTime1 + " marcou em jogo"); 
		int nGolsTime1 = sc.nextInt(); 
		
		System.out.println("Digite o nome do segundo time"); 
		String nomeTime2 = sc.next(); 
		System.out.println("Digite o nome número de gols que o time " + nomeTime2 + " marcou em jogo"); 
		int nGolsTime2 = sc.nextInt(); 
		
		if(nGolsTime1 == nGolsTime2) {
			System.out.println("Os dois times empataram"); 
		} else if(nGolsTime1 > nGolsTime2) {
			System.out.println("O time " + nomeTime1 + " GANHOU do time " + nomeTime2); 
		} else {
			System.out.println("O time " + nomeTime2 + " GANHOU do time " + nomeTime1); 
		}
		
		sc.close();
	}
}
