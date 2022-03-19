package ma.fst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.fst.dao.IClientDao;
import ma.fst.models.Client;


@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientDao dao;

	@Override
	@Transactional
	public Client save(Client clt) {
		return dao.save(clt);
	}

	@Override
	@Transactional
	public Client modify(Client newClt) {
		Client oldClt = dao.findById(newClt.getId()).get();
		oldClt.setName(newClt.getName());
		return dao.save(oldClt);
	}

	@Override
	@Transactional
	public void removeById(long idClt) {
		dao.deleteById(idClt);
	}

	@Override
	public Client getById(long idClt) {
		return dao.findById(idClt).get();
	}

	@Override
	public List<Client> getAll() {
		return (List<Client>) dao.findAll();
	}

	@Override
	public List<Client> FindAllByName(String name) {
		return dao.findByName(name);
	}
		
	

}
