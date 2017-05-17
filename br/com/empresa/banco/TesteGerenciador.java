package br.com.empresa.banco;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.GerenciadorDeImpostoDeRenda;
import br.com.empresa.banco.conta.SeguroVida;

public class TesteGerenciador {
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();
		SeguroVida seguroVida = new SeguroVida();
		gerenciadorDeImpostoDeRenda.adiciona(seguroVida);
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(1000);
		gerenciadorDeImpostoDeRenda.adiciona(contaCorrente);
		
	}
}
