package modelo.teste.umpraum;

import Infra.DAO;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;



public class Teste {

	public static void main(String[] args) {
		
		Assento a = new Assento("4d");
	
		Cliente c = new Cliente("Beatriz", a);
		
		DAO<Object> dao = new DAO<>();
		
		dao.AbrirTrans()
		.Salvar(c)
		.FecharTrans()
		.FecharManager();
	}
}
