package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Funcionario;

public class GestaoFuncionarios {
	private int index;
	private Funcionario[] funcionarios;
	private Scanner scan;

	public GestaoFuncionarios() {
		this.index = 0;
		this.funcionarios = new Funcionario[50];
		scan = new Scanner(System.in);
	}

	private void criar() throws ParseException {
		DateFormat fd = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println("Insira o Id do funcionario:");
		long id = Long.parseLong(scan.nextLine());
		System.out.println("Insira o nome do funcionario:");
		String nome = scan.nextLine();
		System.out.println("Insira a matricula do funcionario:");
		String matricula = scan.nextLine();
		System.out.println("Insira a data de admissão:");
		Date admissao = fd.parse(scan.nextLine());
		System.out.println("Insira a data de demssão:");
		Date demissao = fd.parse(scan.nextLine());
		System.out.println("Insira o salario do funcionario");
		float salario = Float.parseFloat(scan.nextLine());
		System.out.println("Insira o horario de trabalho do funcionario:");
		String horario = scan.nextLine();
		Funcionario n = new Funcionario(id, nome, matricula, admissao, demissao, salario, horario);
		this.funcionarios[this.index] = n;
		this.index ++;
	}
	
	private void atualizar(int index, String matricula) throws ParseException {
		DateFormat fd = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println("Insira o Id do funcionario:");
		long id = Long.parseLong(scan.nextLine());
		System.out.println("Insira o nome do funcionario:");
		String nome = scan.nextLine();
		System.out.println("Insira a data de admissão:");
		Date admissao = fd.parse(scan.nextLine());
		System.out.println("Insira a data de demssão:");
		Date demissao = fd.parse(scan.nextLine());
		System.out.println("Insira o salario do funcionario");
		float salario = Float.parseFloat(scan.nextLine());
		System.out.println("Insira o horario de trabalho do funcionario:");
		String horario = scan.nextLine();
		Funcionario n = new Funcionario(id, nome, matricula, admissao, demissao, salario, horario);
		this.funcionarios[index] = n;
	}

	private void atualizar() throws ParseException {
		System.out.println("Insira o numero de matricula:");
		String matricula = scan.nextLine();
		boolean find = false;
		for(int i = 0; i < index; i++) {
			if(matricula.equals(this.funcionarios[i].getMatricula())) {
				atualizar(i, matricula);
				find = true;
			}
		}
		if(!find) {
			System.out.println("Funcionario nao encontrado!");
		}
	}
	
	private void excluir(int index) {
		for(int i = index; i < this.index; i++) {
			if(!(i + 1 == this.funcionarios.length)) {
				this.funcionarios[i] = this.funcionarios[i + 1];
			}
		}
		this.index --;
	}

	private void excluir() {
		System.out.println("Insira o numero de matricula:");
		String matricula = scan.nextLine();
		for(int i = 0; i < index; i++) {
			if(matricula.equals(this.funcionarios[i].getMatricula())) {
				excluir(i);
			}
		}
	}

	private void exibir() {
		System.out.println("Insira o numero de matricula:");
		String matricula = scan.nextLine();
		for(int i = 0; i < index; i++) {
			if(matricula.equals(this.funcionarios[i].getMatricula())) {
				funcionarios[i].exibir();
			}
		}
	}

	public void menu() throws ParseException {
		char opc = ' ';
		String args;
		while(opc != 'S') {
			System.out.println("Menu: \n" + 
		"(C)riar           (E)xibir             (R)emover\r\n" + 
		"                (A)tualizar          (S)air");
			args = scan.nextLine().toUpperCase();
			opc = args.charAt(0);
			switch(opc) {
				case 'C': criar();
					break;
				case 'E': exibir();
					break;
				case 'R': excluir();
					break;
				case 'A': atualizar();
					break;
				case 'S': scan.close();
					break;
				default: System.err.println("Selecione uma opc do menu!");
			}
		}
	}
}
