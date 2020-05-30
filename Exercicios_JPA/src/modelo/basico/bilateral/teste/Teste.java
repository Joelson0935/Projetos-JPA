package modelo.basico.bilateral.teste;

import Infra.DAO;
import modelo.basico.bilateral.Comprador;
import modelo.basico.bilateral.Compras;
import modelo.basico.bilateral.Remedios;

public class Teste {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Remedios remedios = new Remedios("Benegripe", 5.98);
		Comprador comprador = new Comprador("Sofia");
		Compras compras = new Compras(10, remedios, comprador);
		
		dao.AbrirTrans()	
		.Salvar(compras)
		.FecharTrans()
		.FecharManager();
	}

}
