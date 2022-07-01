package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.Scanner;

public class Ex6 {
	public static void main(String args[]) {
		
		FuncoesDO_WHILE Media = new FuncoesDO_WHILE(); 
		FuncoesDO_WHILE Somatorio = new FuncoesDO_WHILE(); 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Ler N valores e s� parar a leitura caso seja inserido um valor negativo Ao final deve ser exposto o somat�rio "
				+ ", a m�dia aritm�tica e a quantidade de valores lidos.");

		System.out.println("----------------------------------------------------------");
			
		System.out.println("Digite o n�mero total de valores que deseja ler");
		int valueMax = sc.nextInt();  
		int contadorValores = 0; 
		int contWhile = 0;
		
		int[] ArrayValores = new int[valueMax]; 
		
		do{
			System.out.println("Digite o " + (contWhile + 1) + "� valor"); 
			ArrayValores[contWhile] = sc.nextInt(); 
			contadorValores++; 
			// System.out.println("O N�mero digitado foi: " + ArrayValores[contWhile]); 
			
			if(ArrayValores[contWhile] < 0) {
				contWhile = valueMax + 1; 
			}
			
			contWhile++;
		}while(contWhile < valueMax); 
		
		int SomatoriaTotal = Somatorio.Somatoria(ArrayValores); 
		
		System.out.println("A somat�ria de todos os valores digitados �! : " + SomatoriaTotal);
		System.out.println("----------------------------------------------------------------");
		System.out.println("A m�dia dos valores digitados: " + Media.Media(SomatoriaTotal, contadorValores)); 
		System.out.println("----------------------------------------------------------------");
		System.out.println("A quantidade de valores lidos � de:" + contadorValores); 
		
			
		sc.close();
	}
}
