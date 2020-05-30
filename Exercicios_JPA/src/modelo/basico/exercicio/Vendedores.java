package modelo.basico.exercicio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vendedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	@OneToOne(cascade = CascadeType.MERGE)
	private Clientes cliente;
	
	public Vendedores() {
		super();
	}

	public Vendedores(String nome, Clientes cliente) {
		super();
		this.nome = nome;
		this.cliente = cliente;
	}

	public Vendedores(Long id, String nome, Clientes cliente) {
		super();
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
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

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
		
}
