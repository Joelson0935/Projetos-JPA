package modelo.basico.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "jogador")
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(length = 30)
	private String nome;
	@ManyToMany(mappedBy = "jogadores", cascade = CascadeType.PERSIST)
	private List<Clube> clubes = new ArrayList<>();
	
	public Jogador() {
		super();
	}

	public Jogador(String nome) {
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

	public List<Clube> getClubes() {
		return clubes;
	}

	public void setTimes(List<Clube> clubes) {
		this.clubes = clubes;
	}
	
}
