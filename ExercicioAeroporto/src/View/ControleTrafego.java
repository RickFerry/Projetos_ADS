package View;

import java.util.concurrent.Semaphore;

import Controller.ThreadPista;

public class ControleTrafego {

	public static void main(String[] args) {
		
		Semaphore pista = new Semaphore(2);
		Semaphore controle = new Semaphore(1);
		
		for(int i = 1; i <= 12; i++ ) {
			ThreadPista aviao = new ThreadPista(i, pista, controle);
			aviao.start();
		}
	}

}
