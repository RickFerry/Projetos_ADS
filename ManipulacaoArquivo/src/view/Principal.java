package view;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		IArquivosController arqCont = new ArquivosController();
		String path = "C:\\Temp";
		String arquivo = "BigPet.csv";
		
		try {
			int codigo = 1;
			String nome = "Big Pet";
			String email = "grandepet@3.98ml.com";
			
			arqCont.insereCadastro(path, arquivo, codigo, nome, email);
			arqCont.imprimeCadastro(path, arquivo, codigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
