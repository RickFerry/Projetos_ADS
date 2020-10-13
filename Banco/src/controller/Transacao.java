package controller;

import java.util.Date;

public class Transacao {
	private double valor;
	private Date data;
	private Saque saque;
	private Deposito deposito;
	private Pagamento pagamento;
	
	public Transacao() {
		super();
	}
	
	public Saque getSaque() {
		return saque;
	}


	public void setSaque(Saque saque) {
		this.saque = saque;
	}


	public Deposito getDeposito() {
		return deposito;
	}


	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
