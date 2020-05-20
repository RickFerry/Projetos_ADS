package view;

import java.util.concurrent.Semaphore;

import controller.GerenciadorTarefas;

public class Teste {

	public static void main(String[] args) {
		Semaphore acesso = new Semaphore(1);
		
		for(int i = 1; i <= 20; i++) {
			new GerenciadorTarefas(i, acesso).start();
		}
	}
}
