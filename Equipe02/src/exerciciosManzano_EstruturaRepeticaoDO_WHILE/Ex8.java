package exerciciosManzano_EstruturaRepeticaoDO_WHILE;
import java.util.Scanner;

public class Ex8 {
	public static void main(String arg[]) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println(""); 
    
    int area = 0, largura = 0, comprimento = 0;
    int i = 0; 
    
    String resposta, nomeComodo; 

    do {
    	
    	 System.out.println("Digite o nome do c�modo"); 
         nomeComodo = sc.next(); 

         System.out.println("Digite a largura do c�modo"); 
         largura = sc.nextInt(); 

         System.out.println("Digite o comprimento do c�modo"); 
         comprimento = sc.nextInt(); 
         
         area = largura * comprimento;

         System.out.println("Deseja continuar ? SIM ou N�O");
         resposta = sc.next().toUpperCase();

         System.out.println("Essa foi sua resposta: " + resposta); 

         if(resposta.equals("N�O")) {
             i = 2; 
         }
         
    }while(i <= 1);
    
    System.out.println("A �rea total da resid�ncia � igual a " + area + "M�"); 
    
    sc.close();
    
	}

}
