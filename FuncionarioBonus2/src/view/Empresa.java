package view;

import java.util.Scanner;

import controller.Funcionario;
import controller.RH;

public class Empresa {
	
	private static RH rh = new RH();
	static Long cont = 0L;
	
	public Empresa(RH rh) {
		Empresa.rh = rh;
	}

	public static Funcionario contratarFuncionario() {
		cont++;
		Funcionario f1 = new Funcionario();
		Scanner scn = new Scanner(System.in);
		f1.setId(cont);

		System.out.println("Digite o nome do funcionário: ");
		f1.setNome(scn.next());
		
		System.out.println("Digite a matricula do funcionário: ");
		f1.setMatricula(scn.next());
		
		f1.setSalario(2000);
		
		System.out.println("Digite a quantidade de faltas no ano do funcionário: ");
		f1.setFaltasNoAno(scn.nextInt());
		
		System.out.println("Digite a última nota de avaliação do funcionário: ");
		f1.setUltimaNotaAvaliacao(scn.nextFloat());
		
		f1.setQtdPremiosRecebidosNoAno(1);
		
		f1.setGraduado(true);
		
		f1.setNomeFaculdade("Fatec Zona Leste");
		
		f1.setNomeCurso("ADS");
		
		return f1;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			rh.adicionarFuncionario(contratarFuncionario());
		}
		rh.mostrarBonusTodosFuncionarios();
	}
}
