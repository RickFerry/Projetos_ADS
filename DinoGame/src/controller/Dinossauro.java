package controller;

public class Dinossauro {
	private int energia = 10;
	private int velocidade = 0;
	private int temperatura = 0;
	private String humor = "Triste";
	
	public Dinossauro() {}
	
	public void pular() {
		energia--;
		humor = "Feliz :)";
		System.out.println("O skeep pulou! \nAgora o dino skeep est� " + humor + " e com " + energia + " de energia.");
	}
	
	public void correr() {
		energia--;
		humor = "Feliz :)";
		System.out.println("O skeep est� correndo... \nAgora o dino skeep est� " + humor + " e com " + energia + " de energia.");
	}
	
	public void comer() {
		energia++;
		humor = "Feliz :)";
		System.out.println("O skeep comeu! \nAgora o dino skeep est� " + humor + " e com " + energia + " de energia.");
	}
	
	public void atirar() {
		energia--;
		humor = "Feliz :)";
		System.out.println("O skeep atirou! \nAgora o dino skeep est� " + humor + " e com " + energia + " de energia.");
	}
	
	public void tomarSol() {
		velocidade++;
		energia--;
		humor = "Feliz :)";
		System.out.println("O skeep est� no sol! \nAgora o dino skeep est� " + humor + " e mais veloz.");
	}
	
	public void ficarNaSombra() {
		energia++;
		humor = "Triste :(";
		System.out.println("O skeep est� na sombra! \nAgora o dino skeep est� " + humor + " e com " + energia + " de energia.");
	}
}
