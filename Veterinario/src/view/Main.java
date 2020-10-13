package view;

import model.Animal;
import model.Doenca;
import model.Dono;
import model.Veterinario;

public class Main {

	public static void main(String[] args) {
		Doenca d1 = new Doenca();
		Doenca d2 = new Doenca();
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Dono do1 = new Dono();
		Dono do2 = new Dono();
		Veterinario v1 = new Veterinario();
		Veterinario v2 = new Veterinario();
		//Doencas
		d1.setNome("Raiva");
		d1.setNomeCientifico("Lyssavirus");
		d1.setTipoAgente("virus");
		d1.setTipoContaminacao("Contato com infectado");
		d1.setTipoTratamento("Vacina");
		
		d2.setNome("Toxoplasmose");
		d2.setNomeCientifico("Toxoplasma gondii");
		d2.setTipoAgente("protozoario");
		d2.setTipoContaminacao("contato com fezes infectadas");
		d2.setTipoTratamento("Anti bioticos");
		
		//Animais
		Doenca [] ds = new Doenca[2];
		ds[0] = d1;
		ds[1] = d2;
		a1.setNome("Pinguinho");
		a1.setEspecie("Cachorro");
		a1.setPorte("Grande");
		a1.setCorPele("Preto");
		a1.setDoencas(ds);
		
		a2.setNome("Brutos");
		a2.setEspecie("Cachorro");
		a2.setPorte("Pequeno");
		a2.setCorPele("Branco");
		a2.setDoencas(ds);
		
		//Dono
		Animal[] as1 = new Animal[1];
		Animal[] as2 = new Animal[1];
		as1[0] = a1;
		as2[0] = a2;
		
		do1.setNome("Maria");
		do1.setCpf("123214124");
		do1.setIdade(12);
		do1.setSexo("Feminino");
		do1.setAnimais(as1);
		
		do1.setNome("Maicon");
		do1.setCpf("492814241");
		do1.setIdade(22);
		do1.setSexo("Masculino");
		do1.setAnimais(as2);
		
		//Veterinario
		Dono[] clientes = new Dono[2];
		clientes[0] = do1;
		clientes[1] = do2;
		v1.setNome("Paula");
		v1.setId(1l);
		v1.setEspecialidade("Infecção microbiana");
		v1.setSexo("Feminino");
		v1.setCliente(clientes);
		
		v2.setNome("Rodrigo");
		v2.setId(2l);
		v2.setEspecialidade("Feridas");
		v2.setSexo("Masculino");
		v2.setCliente(null);
	}
}
