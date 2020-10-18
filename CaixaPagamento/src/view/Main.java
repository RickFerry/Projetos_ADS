package view;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import controller.FormaPagamento;

public class Main {

	public static void main(String[] args) {
		
		FormaPagamento f1 = new FormaPagamento(" em Dinheiro");
		FormaPagamento f2 = new FormaPagamento(" em Cartão de Débito");
		FormaPagamento f3 = new FormaPagamento(" do limite do Cartão de Crédito");
		FormaPagamento f4 = new FormaPagamento(" em Cheque");
		FormaPagamento f5 = new FormaPagamento(" em Depósito");
		
		Map<String, FormaPagamento> formaPagamento = new HashMap<>();
		formaPagamento.put("DIN", f1);
		formaPagamento.put("DEB", f2);
		formaPagamento.put("CRE", f3);
		formaPagamento.put("CHE", f4);
		formaPagamento.put("DEP", f5);
		
		float valorPagamento = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para pagamento"));
		FormaPagamento formaEscolhida = formaPagamento.get(JOptionPane.showInputDialog(null, "Digite a forma de pagamento \n"
				+ "DIN - Dinheiro \nDEB - Cartão de Débito \nCRE - Cartão de Crédito \nCHE - Cheque \nDEP - Depósito").toUpperCase());
		
		if(f3.equals(formaEscolhida)) {		//Condição criada apenas pra mostrar a msg
			JOptionPane.showMessageDialog(null, "Foi utilizado R$" + valorPagamento + formaEscolhida);
		}else {
			JOptionPane.showMessageDialog(null, "Pago R$" + valorPagamento + formaEscolhida);
		}
	}
}
