package ma.cigma.services;

import java.util.List;

import ma.cigma.dao.IClientDao;
import ma.cigma.models.Client;

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

	@Override
	public Client modify(Client c) {
		return dao.update(c);
	}

	@Override
	public boolean deleteById(long id) {
		boolean check = dao.deleteById(id);
		return check;
	}

	@Override
	public Client getById(long id) {
		return dao.findById(id);
	}

	@Override
	public List<Client> findAll() {
		return dao.findAll();
	}

}
