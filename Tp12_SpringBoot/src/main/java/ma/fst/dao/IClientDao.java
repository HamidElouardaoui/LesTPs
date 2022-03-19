package ma.fst.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.fst.models.Client;

@Repository
public interface IClientDao extends CrudRepository<Client,Long> {
	
	// Méthode Personnalisée 
	List <Client> findByName(String name);
	
	

}
