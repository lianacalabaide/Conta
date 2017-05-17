package br.com.empresa.banco.conta;

public abstract class Conta {
	protected double saldo;
	
	/**
	 * M�todo para buscar o valor do saldo
	 * @return valor saldo - double
	 */
	public double getSaldo(){
		return this.saldo;
	}
	
	
	/**
	 * M�todo para saque de um determinado valor
	 * @param valor valor a ser sacado
	 */
	public void saca(double valor){
		this.saldo-=valor;
	}
	
	/**
	 * M�todo para deposito de valor na Conta
	 * @param valor valor a ser depositado
	 * @throws ValorInvalidoException Exe��o para valores inv�lidos
	 */
	public void deposita(double valor) throws ValorInvalidoException{
		if (valor > 0){
			this.saldo+=valor;
		} else{
			throw new ValorInvalidoException(valor);
		}
	}
	
	//public abstract void atualiza(double taxa);
}
