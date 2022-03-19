package service;

import java.util.List;

import models.Client;

public interface IClientService {
	
	 Client save(Client c);
	 Client modify(Client c);
	 void removeById(long id);
	 Client getById(long id);
	 List<Client> getAll();
	 List <Client> FindAllByName(String name);

}
