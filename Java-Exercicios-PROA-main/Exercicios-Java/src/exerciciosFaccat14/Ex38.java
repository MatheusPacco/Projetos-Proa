package exerciciosFaccat14;

import java.util.Scanner;

public class Ex38 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja \r\n"
		+ "diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a \r\n"
		+ "mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se \r\n"
		+ "esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a \r\n"
		+ "senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�");
		
		System.out.println("");
		System.out.println("Vamos criar uma senha");
		System.out.println("Digite os 4 valores da senha");
		int senhaCriada = sc.nextInt(); 
		
		System.out.println("");
		System.out.println("Agora vamos LOGAR");
		System.out.println("Digite a senha de 4 digitos");
		int login = sc.nextInt(); 
		
		
		if(senhaCriada == login) {
			System.out.println("");
			System.out.println("Parab�ns voc� conseguiu logar com SUCESSO"); 
		} else {
			System.out.println("ACESSO NEGADO, deseja errada"); 
		}
		
		sc.close();
	}
}
