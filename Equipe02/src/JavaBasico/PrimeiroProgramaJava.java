package JavaBasico;

public class PrimeiroProgramaJava {
	
	// Static se trata de um m�todo em que a fun��o n�o ser� alterada; 
	// Void � um m�todo que n�o retorna nada; 
	public static void main(String args[]) {
		System.out.print("Hellou World"); 
		
		int numero=10;
		
		System.out.print("O valor da vari�vel NUMERO, �" + numero );
		
		int numeroUm=15, numeroDois=5;
		int soma= numeroUm + numeroDois; 
		float divisao= numeroUm / numeroDois; 
		int multiplicacao= numeroUm * numeroDois; 
		int subtracao= numeroUm - numeroDois; 
		System.out.print("A soma das duas vari�veis � de: " + (numeroUm + numeroDois));
		System.out.println("A soma das duas vari�veis � de: " + soma);
		System.out.println("A soma das duas vari�veis � de: " + divisao);
		System.out.println("A soma das duas vari�veis � de: " + multiplicacao);
		System.out.println("A soma das duas vari�veis � de: " + subtracao);


	}
} 
