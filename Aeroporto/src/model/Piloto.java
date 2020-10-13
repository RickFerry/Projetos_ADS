package model;

public class Piloto extends Pessoa{
	private String patente;
	private int numero_de_avioes;
	private long voo;
	
	public Piloto() {
		super();
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getNumero_de_avioes() {
		return numero_de_avioes;
	}

	public void setNumero_de_avioes(int numero_de_avioes) {
		this.numero_de_avioes = numero_de_avioes;
	}

	public long getVoo() {
		return voo;
	}

	public void setVoo(long voo) {
		this.voo = voo;
	}
	
	public void pilotar() {
		System.out.println("O piloto " + getNome() + " esta voando *-*");
	}
}
