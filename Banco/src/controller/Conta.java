package controller;

import java.util.Date;

public class Conta {
	private int saldo;
	private String numero;
	private String senha;
	private Transacao [] histrico;
	public Conta() {
		super();
	}
	public boolean efetuarSaque(double valor) {
		return true;
	}
	
	public boolean efetuarDeposito(double valor) {
		return true;
	}
	
	public boolean efetuarPagamento(double valor) {
		return true;
	}
	
	public Transacao [] extrato(Date inicio, Date fim) {
		return this.histrico;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
