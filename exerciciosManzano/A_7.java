package exerciciosManzano;

import java.util.Scanner;
public class A_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Bem vindo");
		System.out.println("Digite [1] - Se voc� quer converter o Celsius para Fahrenheit");
		System.out.println("Digite [2] - Se voc� deseja converter Fahrenheit para Celsius ");
		int opcao = sc.nextInt(); 
		
		if(opcao == 1) {
			
			System.out.println("Digite o valor da temperatura em Celsius");
			float celsius = sc.nextFloat(); 
			
			float tempFahrenheit = (float) ((celsius * 1.8) + 32) ; 
			System.out.println("A temperatura " + celsius + "� em Fahrenheit corrresponde a F " + tempFahrenheit + "�");
		} else {
			
			System.out.println("Digite o valor da temperatura em Fahrenheit");
			float fah = sc.nextFloat(); 
			
			float tempCelsius = (float) ((fah - 32) / 1.8); 
			System.out.println("A temperatura F "+ fah +"� em Fahrenheit corresponde a " + tempCelsius + "� C");
		}
		
		sc.close();
	}
	
	
}
