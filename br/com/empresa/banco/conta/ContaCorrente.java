package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel{
	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.saldo * 0.01;
	}
}
