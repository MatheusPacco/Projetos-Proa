package exerciciosManzano;

import java.util.Scanner;

public class D_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Algoritmo que calculo a quantidade de litros gastos em uma viagem! tendo em vista que o carro faz 12KM por litro");
		float litroUsados; 
		int tempo, velocidadeMedia, distancia; 
		
		System.out.println("Digite quantas horas demoraram de viagem");
		tempo = sc.nextInt(); 
		
		System.out.println("Digite a velocidade média realizada durante a viagen");
		velocidadeMedia = sc.nextInt(); 
		
		distancia = velocidadeMedia * tempo; 
		litroUsados = distancia / 12; 
		
		System.out.println("O tempo  gasto durante a viagem foi de "  + tempo + " H e a velocidade média foi de " + velocidadeMedia + " KM/H");
		System.out.println("A distâcia percorrida foi o equivalente a " + distancia + " KM"); 
		System.out.println("A quantidade de litros usadas foi de " + litroUsados + " litros de gasolina");
		
		sc.close();
	}
}
