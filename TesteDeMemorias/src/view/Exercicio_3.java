package view;

public class Exercicio_3 {

	public static void main(String[] args) {
		medirTempoString();
		medirTempoStringBuffer();
	}

	private static void medirTempoStringBuffer() {
		StringBuffer sb = new StringBuffer();
		long tempoInicial = System.currentTimeMillis();
		for(int i = 0; i <= 600000; i++) {
			sb = sb.append(i);
		}
		long tempoFinal = (System.currentTimeMillis() - tempoInicial);
		System.out.println("Tempo com StringBuffer \n" 
		+ tempoFinal +" milisegundos" +"\n" + (tempoFinal / 1000) + " segundos");
	}

	private static void medirTempoString() {
		String txt = "";
		long tempoInicial = System.currentTimeMillis();
		for(int i = 0; i <= 60000; i++) {
			txt = txt + i;
		}
		long tempoFinal = (System.currentTimeMillis() - tempoInicial);
		System.out.println("\nTempo com String \n" +
		tempoFinal +" milisegundos" +"\n" + (tempoFinal / 1000) + " segundos");
	}
}