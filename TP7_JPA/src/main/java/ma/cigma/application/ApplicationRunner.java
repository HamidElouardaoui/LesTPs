package ma.cigma.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.models.Client;
import ma.cigma.presentation.ClientController;



public class ApplicationRunner {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		ClientController ctrl = (ClientController) context.getBean("idCtrl");
		
        ctrl.save(new Client("Marouane NB"));
        ctrl.save(new Client("Oussama NB"));
        ctrl.save(new Client("Amine NB"));
        ctrl.save(new Client("Mohammed NB"));
       
        
        /* Update un Client */
        ctrl.modify(new Client(2,"Akram Filali"));
        
        /* Supprimer un client */
        ctrl.deleteById(2L);
        
        /* Rechercher un client */
        Client search = ctrl.getById(2L);
        System.out.println(search);
		
		/* Afficher tous les enregistrements */
		List<Client> clients = ctrl.finAll();
		//for(Client c : clients) System.out.println(c);
		clients.forEach(c -> System.out.println("\n"+c));


	}

}
