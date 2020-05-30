package modelo.basico.muitospramuitos.teste;

import Infra.DAO;
import modelo.basico.muitospramuitos.Jogador;
import modelo.basico.muitospramuitos.Clube;

public class TesteTime {

	public static void main(String[] args) {
 
		Clube time1 = new Clube("Manchester United", "1º");
		Clube time2 = new Clube("Real Madrid", "1º");
		Clube time3 = new Clube("Juventus", "1º");
		
		Jogador jogador1 = new Jogador("Cristiano Ronaldo");
		Jogador jogador2 = new Jogador("Patric Evra");
		Jogador jogador3 = new Jogador("Van Nisteroy");
		Jogador jogador4 = new Jogador("Paul Pogba");
		Jogador jogador5 = new Jogador("Pavel Nedved");
		Jogador jogador6 = new Jogador("Morata");
		
		time1.adicionar(jogador1);
		time1.adicionar(jogador2);
		time1.adicionar(jogador3);
		time1.adicionar(jogador4);
		time2.adicionar(jogador1);
		time2.adicionar(jogador3);
		time2.adicionar(jogador6);
		time3.adicionar(jogador1);
		time3.adicionar(jogador2);
		time3.adicionar(jogador4);
		time3.adicionar(jogador5);
		time3.adicionar(jogador6);		
		
		DAO<Clube> dao = new DAO<>();
        
		dao.AbrirTrans()
		.Salvar(time1)
		.FecharTrans()
		.FecharManager();
	}

}
