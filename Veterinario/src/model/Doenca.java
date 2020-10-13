package model;

public class Doenca {
	private String nome;
	private String nomeCientifico;
	private String tipoAgente;
	private String tipoContaminacao;
	private String tipoTratamento;
	
	public Doenca() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String getTipoAgente() {
		return tipoAgente;
	}

	public void setTipoAgente(String tipoAgente) {
		this.tipoAgente = tipoAgente;
	}

	public String getTipoContaminacao() {
		return tipoContaminacao;
	}

	public void setTipoContaminacao(String tipoContaminacao) {
		this.tipoContaminacao = tipoContaminacao;
	}

	public String getTipoTratamento() {
		return tipoTratamento;
	}

	public void setTipoTratamento(String tipoTratamento) {
		this.tipoTratamento = tipoTratamento;
	}
}
