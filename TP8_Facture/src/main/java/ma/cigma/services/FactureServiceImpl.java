package ma.cigma.services;

import java.util.List;

import ma.cigma.dao.IFactureDao;
import ma.cigma.models.Facture;

public class FactureServiceImpl implements IFactureService{
	
	IFactureDao dao;

    public void setDao(IFactureDao dao) {
        this.dao = dao;
    }

    public IFactureDao getDao() {
        return dao;
    }

    @Override
    public boolean save(Facture c) {
        System.out.println("Service Layer Level ...");
        return dao.save(c);
    }

    public FactureServiceImpl() {
        System.out.println("Creation d'un objet FactureServiceImpl");
    }

	@Override
	public Facture modify(Facture c) {
		return dao.update(c);
	}

	@Override
	public boolean deleteById(long id) {
		return dao.deleteById(id);
	}

	@Override
	public Facture getById(long id) {
		return dao.findById(id);
	}

	@Override
	public List<Facture> findAll() {
		return dao.findAll();
	}

}
