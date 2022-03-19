package ma.cigma.presentation;

import java.util.List;

import ma.cigma.models.Client;
import ma.cigma.services.IClientService;

public class ClientController {
	
	IClientService service ;

    public void setService(IClientService service) {
        this.service = service;
    }
    
    public ClientController() {
        System.out.println("Creation d'un objet Client controler");
    }

    public IClientService getService() {
        return service;
    }

    public void save(Client c){
        System.out.println("Presentation Layer Level...");
        service.save(c);
    }
    
    public void modify(Client c){
    	service.modify(c);
    }
    
    public boolean deleteById(long id){
    	return service.deleteById(id);
    }

    public Client getById(long id){
    	return service.getById(id);
    }
    
    public List<Client> finAll(){
    	return service.findAll();
    }

}
