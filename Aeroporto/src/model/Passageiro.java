package model;

public class Passageiro extends Pessoa{
	private String passagem;
	private String tipo_de_passagem;
	private int numero_de_bagagens;
	
	public Passageiro() {
		super();
	}

	public String getPassagem() {
		return passagem;
	}

	public void setPassagem(String passagem) {
		this.passagem = passagem;
	}

	public String getTipo_de_passagem() {
		return tipo_de_passagem;
	}

	public void setTipo_de_passagem(String tipo_de_passagem) {
		this.tipo_de_passagem = tipo_de_passagem;
	}

	public int getNumero_de_bagagens() {
		return numero_de_bagagens;
	}

	public void setNumero_de_bagagens(int numero_de_bagagens) {
		this.numero_de_bagagens = numero_de_bagagens;
	}
	
	public void viajar() {
		System.out.println("O passajeito " + getNome() + " esta viajando :3");
	}
}
