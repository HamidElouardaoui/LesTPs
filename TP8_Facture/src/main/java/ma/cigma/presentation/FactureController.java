package ma.cigma.presentation;

import java.util.List;

import ma.cigma.models.Facture;
import ma.cigma.services.IFactureService;

public class FactureController {
	
	IFactureService service ;

    public void setService(IFactureService service) {
        this.service = service;
    }
    
    public FactureController() {
        System.out.println("Creation d'un objet Facture controller");
    }

    public IFactureService getService() {
        return service;
    }

    public void save(Facture c){
        System.out.println("Presentation Layer Level...");
        service.save(c);
    }
    
    public void modify(Facture c){
    	service.modify(c);
    }
    
    public boolean deleteById(long id){
    	return service.deleteById(id);
    }

    public Facture getById(long id){
    	return service.getById(id);
    }
    
    public List<Facture> finAll(){
    	return service.findAll();
    }

}
