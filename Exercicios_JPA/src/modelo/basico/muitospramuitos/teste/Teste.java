package modelo.basico.muitospramuitos.teste;

import Infra.DAO;
import modelo.basico.muitospramuitos.Sobrinho;
import modelo.basico.muitospramuitos.Tio;

public class Teste {

	public static void main(String[] args) {

		Tio tio1 = new Tio("Júlio");
		Tio tia2 = new Tio("Jaci");
		
		Sobrinho sobrinho1 = new Sobrinho("Joelson");
		Sobrinho sobrinha2 = new Sobrinho("Jamile");
		
		tio1.getSobrinhos().add(sobrinho1);
		tio1.getSobrinhos().add(sobrinha2);
		
		tia2.getSobrinhos().add(sobrinho1);
		tia2.getSobrinhos().add(sobrinha2);
		
		sobrinho1.getTios().add(tio1);
		sobrinho1.getTios().add(tia2);
		
		sobrinha2.getTios().add(tio1);
		sobrinha2.getTios().add(tia2);
		
		DAO<Object> dao = new DAO<>();
	
		dao.AbrirTrans()
		.Salvar(tio1)
		.Salvar(tia2)
		.Salvar(sobrinho1)
		.Salvar(sobrinha2)
		.FecharTrans()
		.FecharManager();
		
	}

}
