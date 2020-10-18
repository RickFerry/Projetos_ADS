package view;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import controller.FormaPagamento;

public class Main {

	public static void main(String[] args) {
		
		FormaPagamento f1 = new FormaPagamento(" em Dinheiro");
		FormaPagamento f2 = new FormaPagamento(" em Cart�o de D�bito");
		FormaPagamento f3 = new FormaPagamento(" do limite do Cart�o de Cr�dito");
		FormaPagamento f4 = new FormaPagamento(" em Cheque");
		FormaPagamento f5 = new FormaPagamento(" em Dep�sito");
		
		Map<String, FormaPagamento> formaPagamento = new HashMap<>();
		formaPagamento.put("DIN", f1);
		formaPagamento.put("DEB", f2);
		formaPagamento.put("CRE", f3);
		formaPagamento.put("CHE", f4);
		formaPagamento.put("DEP", f5);
		
		float valorPagamento = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para pagamento"));
		FormaPagamento formaEscolhida = formaPagamento.get(JOptionPane.showInputDialog(null, "Digite a forma de pagamento \n"
				+ "DIN - Dinheiro \nDEB - Cart�o de D�bito \nCRE - Cart�o de Cr�dito \nCHE - Cheque \nDEP - Dep�sito").toUpperCase());
		
		if(f3.equals(formaEscolhida)) {		//Condi��o criada apenas pra mostrar a msg
			JOptionPane.showMessageDialog(null, "Foi utilizado R$" + valorPagamento + formaEscolhida);
		}else {
			JOptionPane.showMessageDialog(null, "Pago R$" + valorPagamento + formaEscolhida);
		}
	}
}
