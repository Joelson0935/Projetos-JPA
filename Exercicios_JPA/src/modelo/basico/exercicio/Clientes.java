package modelo.basico.exercicio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	@OneToOne(cascade = CascadeType.MERGE)
	private Roupas roupas;
	
	public Clientes() {
		super();
	}

	public Clientes(String nome, Roupas roupas) {
		super();
		this.nome = nome;
		this.roupas = roupas;
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

	public Roupas getRoupas() {
		return roupas;
	}

	public void setRoupas(Roupas roupas) {
		this.roupas = roupas;
	}
		
}
