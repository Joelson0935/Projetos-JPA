package modelo.basico.exercicio.teste;

import Infra.DAO;
import modelo.basico.exercicio.Clientes;
import modelo.basico.exercicio.Roupas;
import modelo.basico.exercicio.Vendas;
import modelo.basico.exercicio.Vendedores;

public class Teste1 {

	public static void main(String[] args) {
		
		DAO<Roupas> dao1 = new DAO<>(Roupas.class);
		DAO<Vendas> dao = new DAO<>();
		DAO<Object> dao2 = new DAO<>();
		Roupas roupa = new Roupas();
		roupa = dao1.BuscarPorId(1L);
		Clientes cliente = new Clientes("Jonas", roupa);
		
		Vendedores vendedor = new Vendedores("Pedro", cliente);
		
		dao2.AbrirTrans()
		.Salvar(vendedor)
		.Salvar(cliente)
		.FecharTrans()
		.FecharManager();
		Vendas venda = new Vendas(10, vendedor, cliente, roupa);

		dao.AbrirTrans()
		.Salvar(venda)
		.FecharTrans()
		.FecharManager();
		dao1.FecharManager();
		System.out.println("Tipo: "+venda.getRoupas().getTipo()
				+" Modelo: "+venda.getRoupas().getModelo()
				+" Preço: R$ "+venda.getRoupas().getPreco()
				+" Quantidade: "+venda.getQuantidade());
	}

}
