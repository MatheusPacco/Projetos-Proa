package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
public static void main(String args[]) {
		
		System.out.println("Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente o \r\n"
		+ "total do somatório da fatorial de cada valor lido. ");

		System.out.println("----------------------------------------------------------");
		Scanner sc = new Scanner(System.in); 
		
		ArrayList <Integer> valor = new ArrayList<Integer>();
        int acumulador = 1;
        int acumulador2 = 0;

        int i = 1;
        do {
            System.out.println("Digite o " + i + "°" + "valor: ");
            int valorAtual = sc.nextInt();
            valor.add(valorAtual);

            int n = valorAtual;

            do {
                acumulador = acumulador * n;

                if(n == 1) {
                    acumulador2 += acumulador;
                    acumulador = 1;
                }

                n--;
            }while(n >= 1);


            i++;
        }while(i <= 15);

        System.out.print("A soma total dos fatoriais foi de : "  + acumulador2);

		sc.close();
	}
}
