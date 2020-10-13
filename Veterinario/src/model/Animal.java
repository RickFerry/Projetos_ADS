package model;

public class Animal {
	private String nome;
	private String especie;
	private String porte;
	private String corPele;
	private Doenca [] doencas;
	
	public Animal() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getCorPele() {
		return corPele;
	}

	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}

	public Doenca[] getDoencas() {
		return doencas;
	}

	public void setDoencas(Doenca[] doencas) {
		this.doencas = doencas;
	}
}
