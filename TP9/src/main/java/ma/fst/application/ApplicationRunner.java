package ma.fst.application;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.fst.models.CarteFidelio;
import ma.fst.models.Client;

import ma.fst.presentation.ClientController;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctr= (ClientController) ctx.getBean("idCtrl");
		Client client = new Client("OMAR");
		CarteFidelio carteFidelio = new CarteFidelio("A29930489");
		carteFidelio.setClient(client);
		client.setCarteFidelio(carteFidelio);
		ctr.save(client);

	}

}
