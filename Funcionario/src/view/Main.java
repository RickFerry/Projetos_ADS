package view;

import java.text.ParseException;

import controller.GestaoFuncionarios;

public class Main {

	public static void main(String[] args) {
		GestaoFuncionarios gf = new GestaoFuncionarios();
		try {
			gf.menu();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
