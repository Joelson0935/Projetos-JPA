package modelo.basico.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clube")
public class Clube {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30)
	private String nome;
	@Column(length = 3)
	private String colocacao;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "clube_jogador",joinColumns = @JoinColumn(name = "clube", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "jogador", referencedColumnName = "id"))
	private List<Jogador> jogadores;
	
	public Clube() {
		super();
	}

	public Clube(String nome, String colocacao) {
		super();
		this.nome = nome;
		this.colocacao = colocacao;
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

	public String getColocacao() {
		return colocacao;
	}

	public void setColocacao(String colocacao) {
		this.colocacao = colocacao;
	}

	public List<Jogador> getJogadores() {
		if(jogadores == null) {
		jogadores = new ArrayList<>();
		}
		return jogadores;	
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public void adicionar(Jogador jogador) {
		if(jogador != null && !getJogadores().contains(jogador)) {
			getJogadores().add(jogador);
			
		if(!jogador.getClubes().contains(this)) {
			jogador.getClubes().add(this);	
			}
		}
	}
} 
