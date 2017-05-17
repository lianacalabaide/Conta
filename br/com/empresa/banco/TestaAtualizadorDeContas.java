package br.com.empresa.banco;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas{
	public static void main(String[] args){
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas atc = new AtualizadorDeContas(0.01);
		
		atc.roda(cc);
		atc.roda(cp);
	}
}