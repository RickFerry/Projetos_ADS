package model;

public class Aeronave {
	private String marca;
	private String modelo;
	private String companhia;
	
	public Aeronave() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	public void voa() {
		System.out.println("O avião ta voando alto :^");
	}
}
