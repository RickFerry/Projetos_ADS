package Controller;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class ThreadPista extends Thread {
	
	private int id;
	private static int escolhePista;
	private Semaphore pistaValida;
	private Semaphore semaforo;
	
	
	
	public ThreadPista() {}

	public ThreadPista(int id, Semaphore pistaValida, Semaphore semaforo) {
		this.id = id;
		this.pistaValida = pistaValida;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run() {
		try {
			semaforo.acquire();
			solicitarPista();
			manobra();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}
	
	public void solicitarPista() {
		try {
			pistaValida.acquire();
			if(escolhePista % 2 == 0) {
				System.out.println("O avião " + id + ", está decolando pela pista sul.");
			}else {
				System.out.println("O avião " + id + ", está decolando pela pista norte.");
			}
			escolhePista ++;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pistaValida.release();
		}
	}
	
	
	public void manobra() {
		try {
			sleep((int)(Math.random() * 5001) + 3000);
			System.out.println("O avião " + id + ", está manobrando.");
			taxiar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void taxiar() {
		try {
			sleep((int)(Math.random() * 5001) + 5000);
			System.out.println("O avião " + id + ", acaba de taxiar.");
			decolar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void decolar() {
		try {
			sleep((int)(Math.random() * 3001) + 1000);
			System.out.println("O avião " + id + ", está decolando.");
			afastar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void afastar() {
		try {
			sleep((int)(Math.random() * 5001) + 3000);
			System.out.println("O avião " + id + ", acaba de se afastar.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
