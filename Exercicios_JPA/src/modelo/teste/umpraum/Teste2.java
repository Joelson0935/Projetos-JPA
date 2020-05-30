package modelo.teste.umpraum;

import Infra.DAO;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;
import modelo.basico.umpraum.Vendedor;

public class Teste2 {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
				
		Assento assento = new Assento("5d");
		
		Cliente cliente = new Cliente("Lourdes", assento);
		
		Vendedor vendedor = new Vendedor("Jamile", cliente);
		
		dao.AbrirTrans()
		.Salvar(vendedor)
		.FecharTrans()
	    .FecharManager();
	}

}
