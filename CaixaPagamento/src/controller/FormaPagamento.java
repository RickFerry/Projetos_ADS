package controller;

public class FormaPagamento {

	private String formaPagamento;
	
	public FormaPagamento() {}
	
	public FormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public String toString() {
		return this.formaPagamento;
	}
}
