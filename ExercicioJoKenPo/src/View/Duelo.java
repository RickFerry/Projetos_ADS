package View;

import java.util.concurrent.Semaphore;
import controller.ThreadJogo;

public class Duelo {
	
	public static int contador1;
	public static int contador2;

	public static void main(String[] args) {
		String[] time1 = {"A", "B", "C", "D", "E"};
		String[] time2 = {"F", "G", "H", "I", "J"};
		
		Semaphore placar = new Semaphore(1);
		Thread jog1 = new ThreadJogo(time1[0], time2[0], placar);
		Thread jog2 = new ThreadJogo(time1[1], time2[1], placar);
		Thread jog3 = new ThreadJogo(time1[2], time2[2], placar);
		Thread jog4 = new ThreadJogo(time1[3], time2[3], placar);
		Thread jog5 = new ThreadJogo(time1[4], time2[4], placar);
		jog1.start();
		jog2.start();
		jog3.start();
		jog4.start();
		jog5.start();
		
        while((jog1.isAlive() || jog2.isAlive() || jog3.isAlive() || jog4.isAlive() || jog5.isAlive())) {
			
		}
		
		if(contador1 > contador2) {
			System.out.println("O time 1 ganhou com " + contador1);
			System.err.println("O time 2 perdeu com " + contador2);
		}else{
			System.out.println("O time 2 ganhou com " + contador2);
			System.err.println("O time 1 perdeu com " + contador1);
		}
	}

}
