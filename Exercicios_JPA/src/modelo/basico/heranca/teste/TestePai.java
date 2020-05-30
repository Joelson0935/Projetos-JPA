package modelo.basico.heranca.teste;

import Infra.DAO;
import modelo.basico.heranca.Neto;
import modelo.basico.heranca.Pai;

public class TestePai {

	public static void main(String[] args) {
  
		DAO<Pai> dao = new DAO<>();
		
		Pai pai = new Pai("Alceu Valença");
		
		Neto neto = new Neto("Magno Alves", 16);
		
		dao.AbrirTrans()
		.Salvar(pai)
		.Salvar(neto)
		.FecharTrans()
		.FecharManager();

	}

}
