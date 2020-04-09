package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ThreadAtletas extends Thread{
	
	private static int posicao = 0;
	private static int [][] ranking = new int [25][2];
	private Semaphore colocacao;
	private Semaphore tiro;
	private int pontosTiro;
	private int idAtleta;
	
	public ThreadAtletas() {};
	
	public ThreadAtletas(Semaphore colocacao, Semaphore tiro, int idAtleta) {
		this.colocacao = colocacao;
		this.tiro = tiro;
		this.idAtleta = idAtleta;
	}
	
	@Override
	public void run() {
		corrida();
		try {
			tiro.acquire();
			tiro();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			tiro.release();	
		}
		ciclismo();
		
		try {
			colocacao.acquire();
			placar();
		} catch (Exception e) {
			System.err.println("Erro ao registrar: " + e);
		}
		finally {
			colocacao.release();
		}
	}
	
	Random r = new Random();
	public void corrida() {
		int percurso = 0;
		System.out.println("Atleta #" + idAtleta + " correndo.");
		
		while(percurso < 3000) {
			percurso += (r.nextInt(25) + 20);
			try {
				sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Atleta #" + idAtleta + " terminou.");
	}
	
	public void tiro() {
		int tiros = 0;
		System.out.println("Atleta #" + idAtleta + " começou a atirar.");
		
		while(tiros < 3) {
			try {
				pontosTiro += (r.nextInt(10) + 1);
				sleep(r.nextInt(3000) + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tiros++;
		}
		System.out.println("Atleta #" + idAtleta + " terminou.");
	}
	
	public void ciclismo() {
		int percurso = 0;
		System.out.println("Atleta #" + idAtleta + " na pista de ciclismo.");
		
		while(percurso < 5000) {
			percurso += (r.nextInt(40) + 30);
			try {
				sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Atleta #" + idAtleta + " terminou.");
	}
	
	public void placar() {
		int pts = 250;
		
		for(int i = 0; i < 25; i++) {
			if(i == posicao) {
				ranking[i][0] = idAtleta;
				ranking[i][1] = pts + pontosTiro;
				System.out.println("Atleta #" + idAtleta + " chegou em " + (posicao + 1) + "º e obteve a pontuação " + pts + ". Agora é aguardar a classificação final.");
			}
			pts -= 10;
		}
		posicao = posicao + 1;
		
		if(posicao == 25) {
			ordenar();
		}
	}
	
	public void ordenar() {
		for(int i = 0; i < ranking.length; i++) {
			for(int j = i + 1; j < ranking.length; j++) {
				if(ranking[i][1] < ranking[j][1]) {
					int [][] aux = ranking;
					ranking[i][0] = ranking[j][0];
					ranking[i][1] = ranking[j][1];
					ranking[j][0] = aux[i][0];
					ranking[j][1] = aux[i][1];
				}
			}
		}
		mostrar();
	}
	
	public void mostrar() {
		for(int i = 0; i < ranking.length; i++) {
			System.out.println("Atleta #" + ranking[i][0] + " ficou com " + ranking[i][1]);
		}
	}
}
