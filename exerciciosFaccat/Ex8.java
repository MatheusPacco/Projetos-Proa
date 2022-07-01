package exerciciosFaccat;

import java.util.Scanner; 
public class Ex8 {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos \r\n"
			+ "brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total \r\n"
			+ "de eleitores.");

	System.out.println("Digite o valor total de eleitores!");
	int totalEleitores = sc.nextInt(); 
	
	System.out.println("Digite o valor total de votos brancos!");
	int votosBrancos = sc.nextInt(); 
	
	System.out.println("Digite o valor total de votos nulos!");
	int votosNulos = sc.nextInt(); 
	
	System.out.println("Digite o valor total de votos válidos!");
	int votosValidos = sc.nextInt(); 
	
	int percentualVotosBrancos = votosBrancos*100 / totalEleitores; 
	
	System.out.println("O percentual de votos Brancos é de: " + percentualVotosBrancos + " %");
	
	int percentualVotosNulos = votosNulos*100 / totalEleitores; 
	
	System.out.println("O percentual de votos Brancos é de: " + votosNulos + " %");
	
	int percentualVotosValidos = votosValidos*100 / totalEleitores; 
	
	System.out.println("O percentual de votos Brancos é de: " + percentualVotosValidos + " %");

	
	sc.close();
	
	}
}
