package modelo.basico.bilateral;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Comprador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30, nullable = false)
	private String nome;
	
	@OneToMany
	private List<Compras> compras;
	
	
	public Comprador() {
		super();
	}

	public Comprador(String nome) {
		super();
		this.nome = nome;
	}


	public Comprador(String nome, List<Compras> compras) {
		super();
		this.nome = nome;
		this.compras = compras;
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



	public List<Compras> getCompras() {
		return compras;
	}



	public void setCompras(List<Compras> compras) {
		this.compras = compras;
	}
	
	
}
