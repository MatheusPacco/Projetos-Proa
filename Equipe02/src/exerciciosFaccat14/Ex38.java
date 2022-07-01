package exerciciosFaccat14;

import java.util.Scanner;

public class Ex38 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja \r\n"
		+ "diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a \r\n"
		+ "mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se \r\n"
		+ "esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a \r\n"
		+ "senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’");
		
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
			System.out.println("Parabéns você conseguiu logar com SUCESSO"); 
		} else {
			System.out.println("ACESSO NEGADO, deseja errada"); 
		}
		
		sc.close();
	}
}
