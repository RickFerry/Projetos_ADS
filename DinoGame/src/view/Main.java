package view;

import java.util.Scanner;

import controller.Dinossauro;

public class Main {

	public static void main(String[] args) {
		Dinossauro skeep = new Dinossauro();
		String opcao = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("\nDigite a opção de acordo com as letras maiusculas!\n"
				+ "(P)ular \t (C)orrer \t Co(M)er \n(A)tirar \t Tomar (S)ol \t Ficar na S(O)mbra");
		while(!opcao.equalsIgnoreCase("E")) {
//			System.out.println("\nDigite a opção de acordo com as letras maiusculas!\n"
//					+ "(P)ular \t (C)orrer \t Co(M)er \n(A)tirar \t Tomar (S)ol \t Ficar na S(O)mbra");
			opcao = scan.nextLine().toUpperCase();
			
			switch(opcao) {
			case "P":
				skeep.pular(); break;
			case "C":
				skeep.correr(); break;
			case "M":
				skeep.comer(); break;
			case "A":
				skeep.atirar(); break;
			case "S":
				skeep.tomarSol(); break;
			case "O":
				skeep.ficarNaSombra(); break;
			case "E":
				break;
			
			default:
				System.out.println("Opção inválida");
			}
		}
		scan.close();
	}
}
