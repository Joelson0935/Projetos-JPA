package modelo.basico.exercicio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int quantidade;
	@ManyToOne
	private Vendedores vendedor;
	@ManyToOne
	private Clientes cliente;
	@ManyToOne
	private Roupas roupas;
	@Column(precision = 11, scale = 2)
	private Double preco;

	public Vendas() {
		super();		
	}

	public Vendas(int quantidade, Vendedores vendedores, Clientes clientes, Roupas roupas) {
		super();
		this.quantidade = quantidade;
		this.vendedor = vendedores;
		this.cliente = clientes;
		this.setRoupas(roupas);
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Vendedores getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedores vendedor) {
		this.vendedor = vendedor;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Roupas getRoupas() {
		return roupas;
	}

	public void setRoupas(Roupas roupas) {
		this.roupas = roupas;
		if(roupas != null && this.preco == null){
			this.setPreco((roupas.getPreco()* this.quantidade));
		}
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
		
	}
	
	
}
