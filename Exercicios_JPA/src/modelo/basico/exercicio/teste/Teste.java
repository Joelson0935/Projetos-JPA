package modelo.basico.exercicio.teste;

import Infra.DAO;
import modelo.basico.exercicio.Roupas;

public class Teste {

	public static void main(String[] args) {
		
		DAO<Roupas> dao = new DAO<>();
		Roupas roupa = new Roupas("Tênis", "Verde e Branco", "Esporte", 170.89);
		
		dao.AbrirTrans()
		.Salvar(roupa)
		.FecharTrans()
		.FecharManager();

	}

}
