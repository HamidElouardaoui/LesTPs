package ma.fst.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import ma.fst.models.Client;

@Component
public class MockClients implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MockClients.class);
	
	@Autowired
	private IClientDao clientRepository;

	@Override
	public void run(String... args) throws Exception {
		clientRepository.save(new Client("Marouane"));
		clientRepository.save(new Client("Amine"));
		clientRepository.save(new Client("Ahmed"));
		clientRepository.save(new Client("Saad"));
		clientRepository.findAll().forEach(c -> System.out.println(c));
	}

}
