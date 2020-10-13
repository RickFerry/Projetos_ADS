package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoAlunos implements IGestaoAlunos{
	private int index;
	private Aluno[] alunos;
	private Scanner scan;
	
	public GestaoAlunos() {
		scan = new Scanner(System.in);
		this.alunos = new Aluno [50];
		this.index = 0;
	}

	@Override
	public void criar() {
		long id;
		String nome;
		String ra;
		Date nascimento = null;
		String aux;
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		if(index >= 50){
			System.out.println("Lista de alunos cheia");
		}else {
			if(index == 0) {
				id = 1L;
				System.out.println("Insira o nome:");
				nome = scan.nextLine();
				System.out.println("Insira o ra:");
				ra = scan.nextLine();
				System.out.println("Insira a data de nascimento com /:");
				aux = scan.nextLine();
				try {
					nascimento = df.parse(aux);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}else {
				id = this.alunos[this.index-1].getId() + 1;
				System.out.println("Insira o nome:");
				nome = scan.nextLine();
				System.out.println("Insira o ra:");
				ra = scan.nextLine();
				System.out.println("Insira a data de nascimento com /:");
				aux = scan.nextLine();
				try {
					nascimento = df.parse(aux);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			Aluno aluno = new Aluno(id, nome, ra, nascimento);
			this.alunos[this.index] = aluno;
			this.index++;
		}
	}

	@Override
	public void atualizar() {
		boolean achou = false;
		System.out.println("Insira o ra do aluno:");
		String ra = scan.nextLine();
		for(Aluno aluno : this.alunos) {
			if(aluno!=null) {
				if(aluno.getRa().equals(ra)) {
					achou = true;
					String nome;
					String aux;
					Date nascimento = null;
					SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
					System.out.println("Insira o nome:");
					nome = scan.nextLine();
					System.out.println("Insira a data de nascimento com /:");
					aux = scan.nextLine();
					try {
						nascimento = df.parse(aux);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					aluno.setNome(nome);
					aluno.setNascimento(nascimento);
					break;
				}
			}
		}
		if(!achou) {
			System.out.println("Aluno não encontrado!");
		}
	}

	@Override
	public void excluir() {
		boolean achou = false;
		System.out.println("Insira o ra do aluno:");
		String ra = scan.nextLine();
		for(int i=0; i<this.alunos.length; i++) {
			if(this.alunos[i] != null) {
				if(this.alunos[i].getRa().equals(ra)) {
					achou = true;
					remove(i);
				}
			}
		}
		if(!achou) {
			System.out.println("Aluno não encontrado!");
		}
	}

	@Override
	public void exibir() {
		boolean achou = false;
		System.out.println("Insira o ra do aluno:");
		String ra = scan.nextLine();
		for(Aluno aluno : alunos) {
			if(aluno != null) {
				if(aluno.getRa().equals(ra)) {
					achou = true;
					aluno.exibir();
				}
			}
		}
		if(!achou) {
			System.out.println("Aluno não encontrado!");
		}
	}

	@Override
	public void menu() {
		char opc;
		boolean init = true;
		while(init) {
			System.out.println("(C)riar\n(E)xibir\n(R)emover\n" + 
					"(A)tualizar\n(S)air\nInsira sua opção:");
			String opcU = scan.nextLine().toUpperCase();
			opc = opcU.charAt(0);
			switch(opc) {
				case 'C':
					criar();
					break;
				case 'E':
					exibir();
					break;
				case 'R':
					excluir();
					break;
				case 'A':
					atualizar();
					break;
				case 'S':
					System.out.println("Saindo...");
					scan.close();
					init = false;
					break;
				default:
					System.err.println("Erro, opção inválida!");
			}
		}
	}
	
	private void remove(int index) {
		for(int i = index; i<this.alunos.length-1; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		this.index --;
	}	
}
