package view;

import java.util.concurrent.Semaphore;

import controller.ThreadAtletas;

public class Competicao {

	public static void main(String[] args) {
		
		Semaphore colocacao = new Semaphore(5);
		Semaphore tiro = new Semaphore(1);
		
		for(int i = 1; i <= 25; i++) {
			new ThreadAtletas(colocacao, tiro, i).start();
		}
	}

}
