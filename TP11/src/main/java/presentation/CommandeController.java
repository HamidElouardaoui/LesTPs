package presentation;

import java.util.Date;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import models.Commande;
import service.ICommandeService;

@Controller("ctrl_cmd")
public class CommandeController {

	@Autowired
	ICommandeService service;

	public Commande save(Commande cmd) {
		return service.Save(cmd);
	}

	public Commande modify(Commande cmd) {
		return service.Modify(cmd);
	}

	public List<Commande> getAll() {
		return service.getAllCmd();
	}

	public Commande getOne(long idCmd) {
		return service.getOne(idCmd);
	}

	public void remove(long idCmd) {
		service.remove(idCmd);
	}

	public List<Commande> GetCmdByDate(Date date_cmd) {
		return service.GetCmdByDate(date_cmd);
	}

}
