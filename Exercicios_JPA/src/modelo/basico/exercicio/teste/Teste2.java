package modelo.basico.exercicio.teste;

import java.util.ArrayList;
import java.util.List;

import Infra.DAO;
import modelo.basico.exercicio.Vendas;

public class Teste2 {

	public static void main(String[] args) {
		
		DAO<Vendas> dao = new DAO<>(Vendas.class);
		
		List<Vendas> vendas = new ArrayList<>();
		vendas = dao.Buscar(1, 0);
		
		for(Vendas venda: vendas) {
			System.out.println("Quantidade: "+venda.getQuantidade()
			                   +" Tipo: "+venda.getRoupas().getTipo()
			                   +" Modelo: "+venda.getRoupas().getModelo()
			                   +" Cliente: "+venda.getCliente().getNome()
			                   +" Vendedor: "+venda.getVendedor().getNome());
		}
		dao.FecharManager();
	}

}
