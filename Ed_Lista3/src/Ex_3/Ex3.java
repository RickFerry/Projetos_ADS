package Ex_3;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int length = r.nextInt(9) + 2;
		int[][] m = new int[length][length];

		for (int i = 0; i < length; i++) {
			for (int j = 0; j <= i; j++) {
				m[i][j] = r.nextInt(9) + 2;
			}
		}

		m = espelhandoMatriz(m, length);

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(" " + m[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if(m[i][j] > 0)
				System.out.println("(" + (i + 1) + ", " + (j + 1) + ")" + "peso " + m[i][j]);
			}
		}
	}

	public static int[][] espelhandoMatriz(int[][] matriz, int tamanho) {

		for (int i = 1; i < tamanho; i++) {
			for (int j = 0; j < i; j++) {
				matriz[j][i] = matriz[i][j];
			}
		}
		return matriz;
	}
}
