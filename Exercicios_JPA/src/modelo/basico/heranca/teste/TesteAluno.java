package modelo.basico.heranca.teste;

import Infra.DAO;
import modelo.basico.heranca.Aluno;
import modelo.basico.heranca.AlunoBolsista;

public class TesteAluno {

	public static void main(String[] args) {
	
		DAO<Aluno> dao = new DAO<>();
		
		Aluno aluno = new Aluno(5572L, "João Marcos");

		AlunoBolsista aluno1 = new AlunoBolsista(5501L, "Mônica Mattos", 2500);
		
		dao.AbrirTrans()
		.Salvar(aluno)
		.Salvar(aluno1)
		.FecharTrans()
		.FecharManager();
	}

}
