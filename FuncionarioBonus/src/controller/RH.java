package controller;

import java.util.ArrayList;
import java.util.List;

public class RH {
	
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public double valorBonus(Funcionario funcionario) {
		if (funcionario.getFaltasNoAno() <= 2) {
			return (funcionario.getSalario() * 0.3);
			
		}else if(funcionario.getFaltasNoAno() >= 2 && funcionario.getFaltasNoAno() <= 4) {
			return (funcionario.getSalario() * 0.15);
			
		}else {
			return (funcionario.getSalario() * 0.05);
		}
	}

	public void mostrarBonusTodosFuncionarios() {
		for(Funcionario f : funcionarios) {
			System.out.println(f.getNome() + " - R$ " + valorBonus(f) + "\n");
		}
	}
	
	public void adicionarFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
	
	public void removerFuncionario(Funcionario f) {
		funcionarios.remove(f);
	}
}
