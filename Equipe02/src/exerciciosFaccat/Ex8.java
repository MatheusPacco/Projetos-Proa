package exerciciosFaccat;

import java.util.Scanner; 
public class Ex8 {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos \r\n"
			+ "brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total \r\n"
			+ "de eleitores.");

	System.out.println("Digite o valor total de eleitores!");
	int totalEleitores = sc.nextInt(); 
	
	System.out.println("Digite o valor total de votos brancos!");
	int votosBrancos = sc.nextInt(); 
	
	System.out.println("Digite o valor total de votos nulos!");
	int votosNulos = sc.nextInt(); 
	
	System.out.println("Digite o valor total de votos v�lidos!");
	int votosValidos = sc.nextInt(); 
	
	int percentualVotosBrancos = votosBrancos*100 / totalEleitores; 
	
	System.out.println("O percentual de votos Brancos � de: " + percentualVotosBrancos + " %");
	
	int percentualVotosNulos = votosNulos*100 / totalEleitores; 
	
	System.out.println("O percentual de votos Brancos � de: " + votosNulos + " %");
	
	int percentualVotosValidos = votosValidos*100 / totalEleitores; 
	
	System.out.println("O percentual de votos Brancos � de: " + percentualVotosValidos + " %");

	
	sc.close();
	
	}
}
