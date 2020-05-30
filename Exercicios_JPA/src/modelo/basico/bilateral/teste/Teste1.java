package modelo.basico.bilateral.teste;

import Infra.DAO;
import modelo.basico.bilateral.Compras;
import modelo.basico.bilateral.Remedios;

public class Teste1 {

	public static void main(String[] args) {
		
		DAO<Remedios> dao = new DAO<>(Remedios.class);
		
		Remedios remedio = dao.BuscarPorId(3L);
		
		for(Compras com: remedio.getCompras()) {
	   System.out.println("Remedio: "+com.getRemedios().getNome()
			            +" Preço: R$ "+com.getRemedios().getPreco()
			            +" Comprador: "+com.getComprador().getNome());
		}
        dao.FecharManager();
	}

}
