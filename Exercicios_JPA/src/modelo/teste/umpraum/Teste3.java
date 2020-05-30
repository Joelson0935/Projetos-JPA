package modelo.teste.umpraum;

import Infra.DAO;
import modelo.basico.umpraum.Vendedor;

public class Teste3 {

	public static void main(String[] args) {
		DAO<Vendedor> dao = new DAO<>(Vendedor.class);
   
		Vendedor vendedor = new Vendedor();
	     vendedor= dao.BuscarPorId(4L);
	     
	     System.out.println(
	      "Vendedor: "+vendedor.getNome()
	     +" Cliente: "+vendedor.getCliente().getNome()
	     +" Assento: "+vendedor.getCliente().getAssento().getCadeira());
		
	     dao.FecharManager();
	}

}
