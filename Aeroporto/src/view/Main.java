package view;

import model.Aeronave;
import model.Aeroporto;
import model.Passageiro;
import model.Pessoa;
import model.Piloto;

public class Main {
	
	public static void main(String[] args) {
		/*-----------Pessoa------------*/
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.setNome("Icaro");
		p1.setGenero("Homem");
		p1.setIdade(20);
		p2.setNome("Paula");
		p2.setGenero("Mulher");
		p2.setIdade(21);
		p1.viver();
		p2.viver();
		/*-----------Piloto------------*/
		Piloto pl1 = new Piloto();
		Piloto pl2 = new Piloto();
		pl1.setNome("Alberto");
		pl1.setGenero("Homem");
		pl1.setIdade(31);
		pl1.setNumero_de_avioes(1);
		pl1.setPatente("Sargento");
		pl1.setVoo(123124L);
		pl2.setNome("Valeria");
		pl2.setGenero("Mulher");
		pl2.setIdade(25);
		pl2.setNumero_de_avioes(3);
		pl2.setPatente("Tenente");
		pl2.setVoo(123314L);
		pl1.pilotar();
		pl2.pilotar();
		/*-----------Passageiro------------*/
		Passageiro pa1 = new Passageiro();
		Passageiro pa2 = new Passageiro();
		pa1.setNome("Bruno");
		pa1.setGenero("Homem");
		pa1.setIdade(18);
		pa1.setNumero_de_bagagens(4);
		pa1.setPassagem("BR19203LBAASDHA");
		pa1.setTipo_de_passagem("Comum");
		pa2.setNome("Agatha");
		pa2.setGenero("Mulher");
		pa2.setIdade(24);
		pa2.setNumero_de_bagagens(52);
		pa2.setPassagem("BR123910OOPAODF");
		pa2.setTipo_de_passagem("Primeira classe");
		pa1.viajar();
		pa2.viajar();
		/*-----------Aeronave------------*/
		Aeronave nave1 = new Aeronave();
		Aeronave nave2 = new Aeronave();
		nave1.setCompanhia("GO");
		nave1.setMarca("Boing");
		nave1.setModelo("legal");
		nave2.setCompanhia("LATAM");
		nave2.setMarca("Jato");
		nave2.setModelo("Divertido");
		nave1.voa();
		nave2.voa();
		/*-----------Aeroporto------------*/
		Aeroporto a1 = new Aeroporto();
		Aeroporto a2 = new Aeroporto();
		a1.setCapacidade(1000);
		a1.setNome("Guarulhos");
		a1.setNumero_de_pistas(30);
		a2.setCapacidade(500);
		a2.setNome("Capinas");
		a2.setNumero_de_pistas(10);
		a1.planejarVoo();
		a2.planejarVoo();
	}

}
