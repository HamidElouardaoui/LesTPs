package service;

import java.util.Date;
import java.util.List;

import models.Commande;

public interface ICommandeService {
	
	public Commande Save(Commande cmd);
    public Commande Modify(Commande cmd);
    public List<Commande> getAllCmd();
    public Commande getOne(long id);
    public void remove(long id);
    public List<Commande> GetCmdByDate(Date date_cmd);

}
