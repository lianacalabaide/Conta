package br.com.empresa.banco.sistema;
import br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas{
	private static double saldoTotal=0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.println("Saldo anterior>"+c.getSaldo());
		
		System.out.println("Saldo final>"+c.getSaldo());
		
		saldoTotal+=c.getSaldo();
		
		System.out.println("Saldo total>>"+saldoTotal);
	}
	
	public static double getSaldoTotal(){
		return saldoTotal;
	}
}