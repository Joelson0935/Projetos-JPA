package Infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;
    
    static {
    	try {
    	emf = Persistence.createEntityManagerFactory("Exercicios_JPA");
    	}catch(Exception e) {
    		// Logger log-> log4j
    	}
    }

    public DAO(){
    	this(null);
    }
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
    
	public DAO <E> AbrirTrans(){
     em.getTransaction().begin();
     return this;
	}
    
	public DAO <E> FecharTrans(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> Salvar(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> Atualizar(E entidade){
		em.merge(entidade);
		return this;
	}
	
	public DAO<E> Deletar(E entidade) {
		em.remove(entidade);
		return this;
	}
	
	public E BuscarPorId(Object id) {
	   return em.find(classe,id);
	}
	
	public List<E> Buscar(int Qtd, int Des){
		String jpql = "Select e From " + classe.getName()+" e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setFirstResult(Des).setMaxResults(Qtd);
		
		return query.getResultList();
	}
	
	public DAO<E> FecharManager(){
		em.close();
		return this;
	}
}
