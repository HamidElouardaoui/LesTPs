package cigma.pfe.dao;

import cigma.pfe.models.Client;

public class ClientDaoImpl implements  IClientDao{
	
    @Override
    public boolean save(Client c) {
        System.out.println("DAO Layer level ....");
        return false;
    }
}
