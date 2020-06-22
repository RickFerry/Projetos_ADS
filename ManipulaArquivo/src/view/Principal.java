package view;

import java.io.IOException;

import controller.Converte;

public class Principal {

	public static void main(String[] args) {

		Converte converte = new Converte();
		String path = "C:\\Users\\Administrador\\Documents\\SO1";
		String nome = "relatorio.txt";
		try {
			converte.conversor(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Arquivo convertido");
	}
}
