package ma.fst.services;

import java.util.List;

import ma.fst.models.Client;
import ma.fst.models.Facture;

public interface IClientService {
		
	boolean save(Client c) ;
	Client modify(Client c);
	boolean deleteById(long id);
	Client getById(long id);
	List<Client> findAll();
	boolean saveFacture(Facture f);

}


