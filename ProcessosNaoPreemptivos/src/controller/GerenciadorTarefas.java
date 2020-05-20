package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class GerenciadorTarefas extends Thread {
	private int id;
	private Semaphore semaforo;
	
	public GerenciadorTarefas() {}
		
	public GerenciadorTarefas(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
			semaforo.acquire();
			processos();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		semaforo.release();
	}
	
	Random r = new Random();
	public void processos() {
		int tempo = 0;
		tempo = r.nextInt(116001) + 4000;
		System.out.println("Processo: " + id + " rodando.");
		
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Processo: " + id + " finalizou.");
	}
}
