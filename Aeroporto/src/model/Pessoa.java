package model;

public class Pessoa {
	private String nome;
	private int idade;
	private String genero;
	
	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void viver() {
		System.out.println("A pessoa " + this.nome + " ta vivendo ;-;");
	}
}
