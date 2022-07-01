package JavaBasico;

public class PrimeiroProgramaJava {
	
	// Static se trata de um método em que a função não será alterada; 
	// Void é um método que não retorna nada; 
	public static void main(String args[]) {
		System.out.print("Hellou World"); 
		
		int numero=10;
		
		System.out.print("O valor da variável NUMERO, é" + numero );
		
		int numeroUm=15, numeroDois=5;
		int soma= numeroUm + numeroDois; 
		float divisao= numeroUm / numeroDois; 
		int multiplicacao= numeroUm * numeroDois; 
		int subtracao= numeroUm - numeroDois; 
		System.out.print("A soma das duas variáveis é de: " + (numeroUm + numeroDois));
		System.out.println("A soma das duas variáveis é de: " + soma);
		System.out.println("A soma das duas variáveis é de: " + divisao);
		System.out.println("A soma das duas variáveis é de: " + multiplicacao);
		System.out.println("A soma das duas variáveis é de: " + subtracao);


	}
} 
