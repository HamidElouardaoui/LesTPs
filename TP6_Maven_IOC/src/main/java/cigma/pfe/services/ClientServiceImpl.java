package cigma.pfe.services;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements IClientService{
	
	IClientDao dao;

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    public IClientDao getDao() {
        return dao;
    }

    @Override
    public boolean save(Client c) {
        System.out.println("Service Layer Level ...");
        return dao.save(c);
    }

    public ClientServiceImpl() {
        System.out.println("Creation d'un objet ClientServiceImpl");
    }

}
