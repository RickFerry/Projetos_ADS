package controller;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Dicionario {
	Set<Palavra> palavras = new HashSet<>();
	
	public void adicionarPalavra(Palavra palavra) {
		palavras.add(palavra);
	}
	
	public boolean buscarPalavra(String palavra) {
		for(Palavra p : palavras) {
			if(palavra.equalsIgnoreCase(p.getPalavra())) {
				JOptionPane.showMessageDialog(null, p.toString());
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "Palavra não encontrada!");
		return false;
	}
}
