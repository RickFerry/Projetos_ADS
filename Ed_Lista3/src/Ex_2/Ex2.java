package Ex_2;

import java.util.Random;

public class Ex2 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt(9) + 2;
		int[][] m = montaMatriz(n);

		System.out.println(" *** Matriz de adjacências *** ");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(" *** Lista de adjacências *** ");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + " -> ");
			for (int j = 0; j < n; j++) {
				if (m[i][j] > 0) {
					System.out.print(j + 1);
					if (!(i == n - 1 && j == n - 2)) {
						if (!(j == n - 1)) {
							System.out.print(" -> ");
						}
					}
				}
			}
			System.out.println();
		}
	}

	public static int[][] montaMatriz(int n) {
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		return matriz;
	}
}
