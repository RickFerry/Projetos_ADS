package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arquivo implements ICrud{

	@Override
	public void createFile(String path, String name) throws IOException {
		File caminho = new File(path, name);
        caminho.createNewFile();
	}

	@Override
	public void readFile(String path, String name) throws IOException {
		File arq = new File(path, name);
		Scanner ler = new Scanner(arq);
		while(ler.hasNextLine()) {
			String linha = ler.nextLine();
			System.out.println(linha);
		}
		ler.close();
	}

	@Override
	public void writerInFile(String path, String name) throws IOException {
		File arq = new File(path, name);
		PrintWriter escrita = new PrintWriter(arq);
		String opc = "";
		while(!opc.equalsIgnoreCase("s")) {
			escrita.println(JOptionPane.showInputDialog(null, "Diga algo: "));
		    opc = JOptionPane.showInputDialog(null, "Terminou?\n" + "'s' para sair\n" + "'n' para continuar");
		}
		escrita.close();
	}

	@Override
	public void deleteFile(String path, String name) throws IOException {
		File delete = new File(path, name);
		delete.delete();
	}
	
}
