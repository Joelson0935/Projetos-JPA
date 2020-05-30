package modelo.basico.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PU")
public class ProfessorUniversitario extends Professor{
 
	private String nivel;

	public ProfessorUniversitario() {
		super();
	}

	public ProfessorUniversitario(Long matricula, String nome, String nivel) {
		super(matricula, nome);
        this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
