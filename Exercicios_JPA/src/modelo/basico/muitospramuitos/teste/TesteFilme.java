package modelo.basico.muitospramuitos.teste;

import Infra.DAO;
import modelo.basico.muitospramuitos.Ator;
import modelo.basico.muitospramuitos.Filme;

public class TesteFilme {

	public static void main(String[] args) {
	
		Filme filmes1 = new Filme("Homem de Ferro", 8.7);
		Filme filmes2 = new Filme("Capitão Ameria", 8.1);
		Filme filmes3 = new Filme("Viuva Negra", 8.5);
		Filme filmes4 = new Filme("Thor", 8.5);
		Filme filmes5 = new Filme("Vingadores", 8.9);
		
		Ator ator1 = new Ator("Robert Downey Jr");
		Ator ator2= new Ator("Chris Evans");
		Ator ator3 = new Ator("Chris Hemsworth");
		Ator atriz4 = new Ator("Scarlett Johansson");
		
		ator1.adicionar(filmes5);
		ator2.adicionar(filmes5);
		ator3.adicionar(filmes5);
		atriz4.adicionar(filmes5);
		ator1.adicionar(filmes1);
		ator2.adicionar(filmes2);
		ator3.adicionar(filmes3);
		atriz4.adicionar(filmes4);
		
				
		DAO<Ator>dao = new DAO<Ator>();
		dao.AbrirTrans()
		.Salvar(ator1)
		.FecharTrans()
		.FecharManager();

	}

}
