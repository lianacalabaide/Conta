package br.com.empresa.banco;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(100);
		System.out.println("Tributos>>"+contaCorrente.calculaTributos());
		
		Tributavel t = contaCorrente;
		
	}
}
