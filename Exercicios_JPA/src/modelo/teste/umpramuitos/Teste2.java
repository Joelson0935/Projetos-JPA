package modelo.teste.umpramuitos;

import Infra.DAO;
import modelo.basico.umpramuitos.Filhos;

public class Teste2 {

	public static void main(String[] args) {
		
		DAO<Filhos> dao = new DAO<>(Filhos.class);

		Filhos filho = dao.BuscarPorId(1L);
		
		System.out.println("Nome: "+filho.getNome());
		
		dao.FecharManager();

    }
}