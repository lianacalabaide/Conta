package br.com.empresa.banco.conta;

public class ValorInvalidoException extends RuntimeException{

	public ValorInvalidoException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ValorInvalidoException (double valorInvalido){
		super("Valor inválido>"+valorInvalido);
	}

}
