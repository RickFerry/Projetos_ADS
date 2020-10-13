package model;

public class Veterinario {
	private long id;
	private String nome;
	private String especialidade;
	private String sexo;
	private Dono [] cliente;
	
	public Veterinario() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Dono[] getCliente() {
		return cliente;
	}

	public void setCliente(Dono[] cliente) {
		this.cliente = cliente;
	}
}
