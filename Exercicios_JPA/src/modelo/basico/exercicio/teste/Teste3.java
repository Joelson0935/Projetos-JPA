package modelo.basico.exercicio.teste;

import Infra.DAO;
import modelo.basico.exercicio.Clientes;
import modelo.basico.exercicio.Roupas;
import modelo.basico.exercicio.Vendedores;

public class Teste3 {

	public static void main(String[] args) {
		
		DAO<Vendedores> dao = new DAO<>(Vendedores.class);
		
		Roupas roupas = new Roupas();
		roupas.setId(3L);
		roupas.setModelo("Social");
		roupas.setTipo("Calça");
		roupas.setCor("Preto");
		roupas.setPreco(120.15);
		Clientes cliente = new Clientes();
		cliente.setId(5L);
		cliente.setNome("Renata");
		cliente.setRoupas(roupas);
      Vendedores vendedor = new Vendedores();
       vendedor.setId(5L);
       vendedor.setNome("Jamil");
       vendedor.setCliente(cliente); 
        
       dao.AbrirTrans()
       .Atualizar(vendedor)
       .FecharTrans()
       .FecharManager();
        
       
	}

}
