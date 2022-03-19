package presentation;

import models.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.IClientService;

@Controller("ctrl1")
public class ClientController {
	
	@Autowired
	private IClientService service;
	
	public ClientController(IClientService service) {
	    System.out.println("Call ClientController with clientService param....");
	    this.service = service;
	}
	
	public ClientController() {
		System.out.println("creation bean controller");
	}
		
	public Client save(Client c ){
        return service.save(c);
    }
    public Client modify(Client c){
        return service.modify(c);
    }
    public void removeById(long id){
    	service.removeById(id);
    }

    public Client getById(long id){
        return service.getById(id);
    }
    public List<Client> getAll(){
        return service.getAll();
    }
	
	

}
