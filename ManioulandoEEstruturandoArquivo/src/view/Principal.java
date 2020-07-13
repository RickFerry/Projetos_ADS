package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.Arquivo;
import controller.ICrud;

public class Principal {

	public static void main(String[] args) {

		ICrud doc1 = new Arquivo();
		String path = "C:\\Windows\\Temp";
		String name = "hoje.txt";
		
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha:\n 1) Criar arquivo.\n 2) Escrever no arquivo.\n"
					+ "3) Ler o arquivo.\n 4) Deletar o arquivo.\n 9) Sair do software."));
		switch (opc) {
		case 1: 
			try {
		    doc1.createFile(path, name);
	    } catch (IOException e) {
		    e.printStackTrace();
	    }	
			break;
		case 2:
			try {
				doc1.writerInFile(path, name);
			} catch (IOException e) {
				e.printStackTrace();
			}
		    break;
		case 3:
			try {
			doc1.readFile(path, name);;
		} catch (IOException e) {
			e.printStackTrace();
		}
			break;
		case 4:
			try {
			doc1.deleteFile(path, name);
		} catch (IOException e) {
			e.printStackTrace();
		}
			break;
		}
		}
	}
}