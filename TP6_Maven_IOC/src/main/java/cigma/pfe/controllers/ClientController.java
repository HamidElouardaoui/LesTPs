package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;

public class ClientController {

    IClientService service ;

    public void setService(IClientService service) {
        this.service = service;
    }

    public IClientService getService() {
        return service;
    }

    public void save(Client c){
        System.out.println("Presentation Layer Level...");
        service.save(c);
    }

    public ClientController() {
        System.out.println("Creation d'un objet Client controler");
    }
}
