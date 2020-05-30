package modelo.basico.umpramuitos;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Mae {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	@ManyToOne
	private Filhos filhos;
	@ManyToOne
	private Sobrinhos sobrinhos;

	public Mae() {
		super();
	}

	public Mae(String nome, Filhos filhos, Sobrinhos sobrinhos) {
		super();
		this.nome = nome;
		this.filhos = filhos;
		this.sobrinhos = sobrinhos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Filhos getFilhos() {
		return filhos;
	}

	public void setFilhos(Filhos filhos) {
		this.filhos = filhos;
	}

	public Sobrinhos getSobrinhos() {
		return sobrinhos;
	}

	public void setSobrinhos(Sobrinhos sobrinhos) {
		this.sobrinhos = sobrinhos;
	}

	
}
