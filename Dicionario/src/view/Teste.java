package view;

import javax.swing.JOptionPane;

import controller.Dicionario;
import controller.Palavra;

public class Teste {
	
	public static void main(String[] args) {
		
		Dicionario dicionario = new Dicionario();
		int opcao = -1;
		
		while(opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "\tDICIONARIO \n"
					+ "1 - Adicionar palavra \n2 - Buscar palavra \n9 - Sair"));
			switch(opcao) {
			case 1:
				dicionario.adicionarPalavra(adicionarPalavra(false, ""));
				break;
				
			case 2:
				String palavraBuscada = JOptionPane.showInputDialog(null, "Digite a palavra a ser buscada");
				if(!(dicionario.buscarPalavra(palavraBuscada))) {
					dicionario.adicionarPalavra(adicionarPalavra(true, palavraBuscada));
				}
				break;
				
			case 9: 
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}

	private static Palavra adicionarPalavra(boolean buscaNaoEncontrada, String palavra) {
		if(!buscaNaoEncontrada) {	//Caso venha do case 1 adicionar palavra
			Palavra p1 = new Palavra();
			p1.setPalavra(JOptionPane.showInputDialog(null, "Digite a palavra a ser adicionada"));
			p1.setDefinicao(JOptionPane.showInputDialog(null, "Digite a definição da palavra"));
			JOptionPane.showMessageDialog(null, "Palavra: " + p1.getPalavra() + " adicionada ao Dicionário");
			return p1;
		}else {		//Caso venha do case 2 buscar palavra e não tenha encontrado
			Palavra p1 = new Palavra();
			p1.setPalavra(palavra);
			p1.setDefinicao(JOptionPane.showInputDialog(null, "Digite a definição da palavra"));
			JOptionPane.showMessageDialog(null, "Palavra: " + p1.getPalavra() + " adicionada ao Dicionário");
			return p1;
		}
	}	
}
