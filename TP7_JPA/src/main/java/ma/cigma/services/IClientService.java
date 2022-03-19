package ma.cigma.services;

import java.util.List;

import ma.cigma.models.Client;

public interface IClientService {
		
	boolean save(Client c) ;
	Client modify(Client c);
	boolean deleteById(long id);
	Client getById(long id);
	List<Client> findAll();

}


