package modelo.basico.heranca.teste;

import Infra.DAO;
import modelo.basico.heranca.Professor;
import modelo.basico.heranca.ProfessorUniversitario;

public class TesteProfessor {

	public static void main(String[] args) {
		
		DAO<Professor> dao = new DAO<>();
		
		Professor professor = new Professor(1125L, "Roberto Carlos");
		
		ProfessorUniversitario pf = new ProfessorUniversitario(2256L, "Ronaldo Cazares", "Superior");

		dao.AbrirTrans()
		.Salvar(professor)
		.Salvar(pf)
		.FecharTrans()
		.FecharManager();
	}

}
