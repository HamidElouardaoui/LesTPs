package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.Client;

//Amélioration 1 : Cette classe doit être annotée par @Repository
@Repository
public class ClientDaoImpl implements IClientDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	

	public ClientDaoImpl() {
		System.out.println("creation bean dao");
	}

	@Transactional
	@Override
	public Client save(Client c) {
		em.persist(c);
		return c;
	}

	@Transactional
	@Override
	public Client update(Client c) {
		Client currentClient = em.find(Client.class, c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        return c;
	}

	@Transactional
	@Override
	public void deleteById(long id) {
		Client clientInDataBase = em.find(Client.class,id);
        em.remove(clientInDataBase);		
	}

	@Override
	public Client findById(long idClient) {
		return em.find(Client.class,idClient);
	}

	@Override
	public List<Client> findAll() {
		List<Client> ListClient = em.createQuery("select c from client c").getResultList();
        return ListClient;
	}
	
}
