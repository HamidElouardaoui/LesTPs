package dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Commande;

@Repository
public interface ICommandeDao extends CrudRepository<Commande, Long>  {
	//Methode Personnalisé
	List<Commande> findByDateCmd(Date date_cmd);

}
