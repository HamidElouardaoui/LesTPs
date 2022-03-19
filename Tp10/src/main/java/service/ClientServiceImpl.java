package service;

import dao.IClientDao;
import models.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientDao dao;
	
	/*
	public void setDao(IClientDao dao) {
		this.dao = dao;
	}
	*/
	
	public ClientServiceImpl(IClientDao dao) {
        this.dao = dao;
        System.out.println("We are in constructor of ClientServiceImpl");
    }

	public ClientServiceImpl() {
		System.out.println("creation bean service");
	}

	@Override
	public Client save(Client c) {
		return dao.save(c);
	}

	@Override
	public Client modify(Client c) {
		return dao.update(c);
	}

	@Override
	public void removeById(long id) {
		dao.deleteById(id);		
	}

	@Override
	public Client getById(long id) {
		return dao.findById(id);
	}

	@Override
	public List<Client> getAll() {
		return dao.findAll();
	}

}
