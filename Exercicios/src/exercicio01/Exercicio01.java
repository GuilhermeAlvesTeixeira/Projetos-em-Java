package exercicio01;

import java.util.Scanner;

/**
 *  1) Faça um programa para calcular o estoque médio de uma peça, sendo que: 
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 * 
 * **/
public class Exercicio01 {
	
	//Solução 01 - Scanner
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Informe a quantidade mínima: ");
		double min = sc.nextDouble();
		System.out.printf("Informe a quantidade máxima: ");
		sc.nextLine();
		double max = sc.nextDouble();
		
		double estoqueMedio = (min+max)/2;
		System.out.println("Estoque Médio: " + estoqueMedio);
		
		
		//Encerrando o sistema
		sc.close();
	}
}
