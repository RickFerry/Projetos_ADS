package model;

public class Aeroporto {
	private String nome;
	private int capacidade;
	private int numero_de_pistas;
	
	public Aeroporto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getNumero_de_pistas() {
		return numero_de_pistas;
	}

	public void setNumero_de_pistas(int numero_de_pistas) {
		this.numero_de_pistas = numero_de_pistas;
	}
	
	public void planejarVoo() {
		System.out.println("O aeroporto esta planejando o voo das aeronaves :v");
	}
}
