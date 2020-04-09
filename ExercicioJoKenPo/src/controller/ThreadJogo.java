package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

import View.Duelo;

public class ThreadJogo extends Thread {
	private String player1;
	private String player2;
	private int pontosP1 = 0;
	private int pontosP2 = 0;
	private Semaphore placar;
	
	public ThreadJogo() {}
	
	public ThreadJogo(String palyer1, String player2, Semaphore placar) {
		this.player1 = palyer1;
		this.player2 = player2;
		this.placar = placar;
	}
	
	@Override
	public void run() {
		partida();
		try {
			placar.acquire();
			placar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			placar.release();
		}
	}
	
	Random r = new Random();
	public void partida() {
		
		String[] jogada = {"Pedra", "Papel", "Tesoura"};
		
//		0-PAPEL; 1-PEDRA; 2-TESOURA
		
		while(pontosP1 <= 3 || pontosP2 <= 3) {
			
		    int jogadaP1 = (r.nextInt(3));
		    int jogadaP2 = (r.nextInt(3));
		
		    if(jogadaP1 == 0 && jogadaP2 == 1) {
			    System.out.println("O jogador " + player1 + ", jogou: " + jogada[jogadaP1] + " e o jogador " + player2 + ", jogou: " + jogada[jogadaP2]);
			    pontosP1++;
		    }else if(jogadaP1 == 0 && jogadaP2 == 2) {
		    	System.out.println("O jogador " + player1 + ", jogou: " + jogada[jogadaP1] + " e o jogador " + player2 + ", jogou: " + jogada[jogadaP2]);
		    	pontosP2++;
		    }else if(jogadaP1 == 1 && jogadaP2 == 0) {
		    	System.out.println("O jogador " + player1 + ", jogou: " + jogada[jogadaP1] + " e o jogador " + player2 + ", jogou: " + jogada[jogadaP2]);
		    	pontosP2++;
		    }else if(jogadaP1 == 1 && jogadaP2 == 2) {
		    	System.out.println("O jogador " + player1 + ", jogou: " + jogada[jogadaP1] + " e o jogador " + player2 + ", jogou: " + jogada[jogadaP2]);
		    	pontosP1++;
		    }else if(jogadaP1 == 2 && jogadaP2 == 0) {
		    	System.out.println("O jogador " + player1 + ", jogou: " + jogada[jogadaP1] + " e o jogador " + player2 + ", jogou: " + jogada[jogadaP2]);
		    	pontosP1++;
		    }else if(jogadaP1 == 2 && jogadaP2 == 1) {
		    	System.out.println("O jogador " + player1 + ", jogou: " + jogada[jogadaP1] + " e o jogador " + player2 + ", jogou: " + jogada[jogadaP2]);
		    	pontosP2++;
		    }else {}
		}
		
		if(pontosP1 == 3) {
	    	System.out.println("No duelo entre: " + player1 + " X " + player2 + ", o ganhador foi: " + player1 + ".");
	    }else {
	    	System.out.println("No duelo entre: " + player1 + " X " + player2 + ", o ganhador foi: " + player2 + ".");
	    }
	}
	
	private void placar() {
		Duelo.contador1 += pontosP1;
		Duelo.contador2 += pontosP2;
    }
}