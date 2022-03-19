package ma.fst.dao;

import java.util.List;

import ma.fst.models.Client;
import ma.fst.models.Facture;


public interface IClientDao {
    boolean save(Client c) ;
    Client update(Client c);
    boolean deleteById(long idClient);
    Client findById(long idClient);
    List<Client> findAll();
	boolean saveFacture(Facture f);
}
