package view;

import controller.Funcionario;
import controller.RH;

public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		RH rh = new RH();
		
		f1.setId(0001L);
		f1.setNome("Ferry");
		f1.setMatricula("111048");
		f1.setSalario(1500.0);
		f1.setFaltasNoAno(2);
		f1.setUltimaNotaAvaliacao(9.0f);
		f1.setQtdPremiosRecebidosNoAno(1);
		f1.setGraduado(true);
		f1.setNomeFaculdade("Fatec ZL");
		f1.setNomeCurso("COMEX");
		
		rh.adicionarFuncionario(f1);
		rh.valorBonus(f1);
		rh.mostrarBonusTodosFuncionarios();
	}
}
