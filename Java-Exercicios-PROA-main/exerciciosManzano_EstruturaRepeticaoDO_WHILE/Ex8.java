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
    	
    	 System.out.println("Digite o nome do cômodo"); 
         nomeComodo = sc.next(); 

         System.out.println("Digite a largura do cômodo"); 
         largura = sc.nextInt(); 

         System.out.println("Digite o comprimento do cômodo"); 
         comprimento = sc.nextInt(); 
         
         area = largura * comprimento;

         System.out.println("Deseja continuar ? SIM ou NÂO");
         resposta = sc.next().toUpperCase();

         System.out.println("Essa foi sua resposta: " + resposta); 

         if(resposta.equals("NÃO")) {
             i = 2; 
         }
         
    }while(i <= 1);
    
    System.out.println("A área total da residência é igual a " + area + "M²"); 
    
    sc.close();
    
	}

}
