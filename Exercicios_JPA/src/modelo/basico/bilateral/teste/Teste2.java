package modelo.basico.bilateral.teste;

import java.util.ArrayList;
import java.util.List;
import Infra.DAO;
import modelo.basico.bilateral.Compras;

public class Teste2 {

	public static void main(String[] args) {

		DAO<Compras> dao = new DAO<>(Compras.class);
		List<Compras> compras = new ArrayList<>();
		compras = dao.Buscar(5, 0);
		for (Compras compra : compras) {
	    System.out.println("Remedio: " + compra.getRemedios().getNome()
					    + " Preço: R$ "+ compra.getRemedios().getPreco()
					   +" Comprador: " + compra.getComprador().getNome());
		}
		dao.FecharManager();

	}

}
