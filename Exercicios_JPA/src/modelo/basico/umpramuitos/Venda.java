package modelo.basico.umpramuitos;

import javax.persistence.ManyToOne;

public class Venda {

	private Long id;
	
	private Integer Quantidade;
	
	private Double preco;
	@ManyToOne
	private Produto produtos;
	
	public Venda() {
		super();
	}

	public Venda(Integer quantidade, Produto produtos) {
		super();
		Quantidade = quantidade;
		this.setProdutos(produtos);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
		if(produtos != null && this.preco == null) {
			this.setPreco(produtos.getPreco());
		}
	}	
	
}
