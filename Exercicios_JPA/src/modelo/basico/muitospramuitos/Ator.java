package modelo.basico.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atores")
public class Ator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	@ManyToMany (cascade = CascadeType.PERSIST)
	@JoinTable(name = "atores_e_filmes",joinColumns = @JoinColumn(
	name = "atores_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "filme_id",referencedColumnName = "id" )) 
	private List<Filme> filmes;

	public Ator() {
		super();
	}

	public Ator(String nome) {
		super();
		this.nome = nome;
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

	public List<Filme> getFilmes() {
		if(filmes == null) {
			filmes = new ArrayList<>();
		}
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public void adicionar(Filme filme) {
		if(filme !=null && !getFilmes().contains(filme)) {
			getFilmes().add(filme);
			if(!filme.getAtores().contains(this)) {
				filme.getAtores().add(this);
			}
			
		}
	}
}
