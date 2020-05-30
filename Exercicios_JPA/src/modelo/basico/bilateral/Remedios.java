package modelo.basico.bilateral;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Remedios {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 40)
	private String nome;
	
	@Column(nullable = false, precision = 11, scale = 2)
	private Double preco;
	
	@OneToMany(mappedBy = "remedios")
	private List<Compras> compras;

	public Remedios() {
		super();
	}
	
	public Remedios(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public Remedios(String nome, List<Compras> compras, Double preco) {
		super();
		this.nome = nome;
		this.compras = compras;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Compras> getCompras() {
		return compras;
	}

	public void setCompras(List<Compras> compras) {
		this.compras = compras;
	}
	
}
