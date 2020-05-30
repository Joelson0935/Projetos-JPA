package modelo.basico.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NT")
public class Neto extends Pai {

	private int MenorIdade;

	public Neto() {
		super();
	}

	public Neto(String nome, int MenorIdade) {
		super(nome);
	this.MenorIdade = MenorIdade;
	}

	public int getMenorIdade() {
		return MenorIdade;
	}

	public void setMenorIdade(int menorIdade) {
		MenorIdade = menorIdade;
	}
	
}
