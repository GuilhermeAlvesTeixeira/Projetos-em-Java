package javaIntermediario.aula54;

public class Formulario {
	
	//Podemos criar a mesma estrutura de um Enum dentro de uma classe 
	/*
	 * Pode ser útil caso essa enumeração seja útil apenas para uma classe em específico.
	 * */
	
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		//Atributo do enum
		private char valor;
		//Construtor do enum
		Genero(char valor){
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;
}
