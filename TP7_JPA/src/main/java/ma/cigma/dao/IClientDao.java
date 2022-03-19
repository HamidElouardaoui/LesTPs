package ma.cigma.dao;

import java.util.List;

import ma.cigma.models.Client;

public interface IClientDao {
    boolean save(Client c) ;
    Client update(Client c);
    boolean deleteById(long idClient);
    Client findById(long idClient);
    List<Client> findAll();
}
