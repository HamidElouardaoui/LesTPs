package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ICommandeDao;
import models.Commande;

@Service
public class CommandeServiceImpl implements ICommandeService{
	
	@Autowired
	ICommandeDao dao;

	@Override
	@Transactional
	public Commande Save(Commande cmd) {
		return (Commande) dao.save(cmd);
	}

	@Override
	@Transactional
	public Commande Modify(Commande newCmd) {
		Commande oldCommande = dao.findById(newCmd.getId_cmd()).get();
		oldCommande.setDateCmd(newCmd.getDateCmd());
		oldCommande.setPrix_Total(newCmd.getPrix_Total());
		return dao.save(oldCommande);
	}

	@Override
	public List<Commande> getAllCmd() {
		return (List<Commande>) dao.findAll();
	}

	@Override
	public Commande getOne(long idCmd) {
		return dao.findById(idCmd).get();
	}

	@Override
	@Transactional
	public void remove(long idCmd) {
		dao.deleteById(idCmd);
	}

	@Override
	public List<Commande> GetCmdByDate(Date date_cmd) {
		return (List<Commande>) dao.findByDateCmd(date_cmd);
	}
	
	
}
