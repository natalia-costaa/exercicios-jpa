package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
// estado gerenciavel
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		Usuario usuario = em.find(Usuario.class, 7L);
		
		usuario.setNome("Leonardo");
		usuario.setEmail("leonardo@lanche.com.br");
		
		//em.merge(usuario);
		//mesmo depois de setNome, está em estado gerenciável 
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
