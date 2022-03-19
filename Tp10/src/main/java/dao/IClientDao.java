package dao;

import java.util.List;
import models.Client;

public interface IClientDao {
	
	Client save(Client c);
    Client update(Client c);
    void deleteById(long id);
    Client findById(long idClient);
    List<Client> findAll();

}
