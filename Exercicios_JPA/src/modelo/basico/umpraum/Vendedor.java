package modelo.basico.umpraum;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vendedor {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nome;
	@OneToOne(cascade = CascadeType.MERGE)
	private Cliente cliente;
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nome, Cliente cliente) {
		super();
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
