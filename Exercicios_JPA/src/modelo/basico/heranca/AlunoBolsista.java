package modelo.basico.heranca;

import javax.persistence.Entity;

@Entity
public class AlunoBolsista extends Aluno{

	private int bolsa;

	public AlunoBolsista() {
		super();
	}

	public AlunoBolsista(Long matricula, String nome, int bolsa) {
		super(matricula, nome);
		this.bolsa = bolsa;
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
