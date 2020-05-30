package modelo.basico.bilateral;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 40, nullable = false)
	private int Quantidade;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Remedios remedios;
	@Column(nullable = false, precision = 11, scale = 2)
	private Double preco;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Comprador comprador;

	public Compras() {
		super();
	}

	public Compras(int quantidade) {
		super();
		this.Quantidade = quantidade;
	}

	public Compras(int quantidade, Remedios remedios, Comprador comprador) {
		this.Quantidade = quantidade;
		this.setRemedios(remedios);
		this.comprador = comprador;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		
		this.preco = preco;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public Remedios getRemedios() {
		return remedios;
	}

	public void setRemedios(Remedios remedios) {
		this.remedios = remedios;
		if(remedios != null && this.preco == null) {
			this.setPreco(remedios.getPreco());
		}
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	
	
	
}
