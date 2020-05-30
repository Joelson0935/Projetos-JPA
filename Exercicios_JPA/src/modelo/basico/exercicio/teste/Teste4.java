package modelo.basico.exercicio.teste;

import Infra.DAO;
import modelo.basico.exercicio.Clientes;

public class Teste4 {

	public static void main(String[] args) {

		DAO<Clientes> dao = new DAO<>(Clientes.class);

		Clientes cliente = dao.BuscarPorId(8L);
		dao.AbrirTrans().Deletar(cliente).FecharTrans().FecharManager();

	}

}
