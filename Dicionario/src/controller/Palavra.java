package controller;

public class Palavra {
	
	private String palavra;
	private String definicao;
	
	public Palavra() {}
	
	public Palavra(String palavra, String definicao) {
		this.palavra = palavra;
		this.definicao = definicao;
	}
	
	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getDefinicao() {
		return definicao;
	}
	
	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}
	
	public String toString() {
		return this.palavra + " - " + this.definicao;
	}
}
