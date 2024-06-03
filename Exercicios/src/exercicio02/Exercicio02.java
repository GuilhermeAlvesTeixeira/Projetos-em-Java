package exercicio02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		ConversorDolarReal conversor = new ConversorDolarReal();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o valor em dólares (USD)");
			double valorInput = sc.nextDouble();
			
			if(valorInput>=0) {
				Double real = conversor.converter(valorInput);
				BigDecimal realConvertido = conversor.arredondar(real);
				System.out.println(valorInput + " dólares equivalem a "+realConvertido+" reais.");
			}else {
				System.out.println("O valor informado não pode ser convertido");
			}
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
}
