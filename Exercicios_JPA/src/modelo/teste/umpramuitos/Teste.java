package modelo.teste.umpramuitos;

import Infra.DAO;
import modelo.basico.umpramuitos.Filhos;
import modelo.basico.umpramuitos.Mae;
import modelo.basico.umpramuitos.Sobrinhos;

public class Teste {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Filhos filho = new Filhos("Josualdo");
		
		Sobrinhos sobrinhos = new Sobrinhos("Jef");
		
		Mae mae = new Mae("Maria", filho, sobrinhos);
		
		dao.AbrirTrans()
		.Salvar(filho)
		.Salvar(sobrinhos)
		.Salvar(mae)
		.FecharTrans()
		.FecharManager();

	}

}
