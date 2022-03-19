package ApplicationRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import models.Client;
import models.Commande;
import presentation.ClientController;
import presentation.CommandeController;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
				
        ClientController ctrl = (ClientController) c.getBean("ctrl_client");

        // nouveau client
      
        ctrl.save(new Client("Marouane"));
        ctrl.save(new Client("Hamza"));
        ctrl.save(new Client("Amine"));
        ctrl.save(new Client("Kamal01"));
        ctrl.save(new Client("Kamal01"));
        
        // getAll Clients before modify and remove
        ctrl.getAll().stream().forEach(i-> System.out.println(i));
        
        // getOne Client service
        System.out.println("Get By ID = "+ctrl.getById(3L));
        
        // modify Client service
        Client client_update = ctrl.getById(2);
        client_update.setName("Oussama");
        ctrl.modify(client_update); 
        
        // remove Client service
        ctrl.removeById(3);
        
        // getAll Client after modify and remove
        ctrl.getAll().stream()
        		.forEach(i-> System.out.println(i));
        
        // Get liste clients par mot clé
        System.out.println("**************");
        // Test à refaire non effectuée
        ctrl.getAllByMC("Kamal01").stream().forEach(i-> System.out.println(i));
        
        /*
         * ********* Cas pratique -> Spring Data -> Gestion Commande Crud
         */

        CommandeController ctrl_cmd = (CommandeController) c.getBean("ctrl_cmd");
        
        // enregistrer les Commandes
        System.out.println("************ Enregister des commandes :");
        Commande c1 = new Commande(new Date("01/12/2022"), 5200.75);
        Commande c2 = new Commande(new Date("24/10/2022"), 3500);
        Commande c3 = new Commande(new Date("12/04/2022"), 1400.40);
        Commande c4 = new Commande(new Date("26/01/2022"), 15000.25);
        
        ctrl_cmd.save(c1);
        ctrl_cmd.save(c2);
        ctrl_cmd.save(c3);
        ctrl_cmd.save(c4);
        
        // afficher toutes les commandes 
        System.out.println("************ Liste des commandes :");
        ctrl_cmd.getAll().stream().forEach(i-> System.out.println(i));


        // Consulter une commande by id_commande
        Commande cmd1 = ctrl_cmd.getOne(1);
        System.out.println("************ Rechercher Commande by id_cmd :");
        System.out.println(cmd1);
        
        // Supprimer une commande
        System.out.println("************ Supprimer une Commande by id_cmd :");
        ctrl_cmd.remove(3);
        ctrl_cmd.getAll().stream().forEach(i-> System.out.println(i));
        
        // Modifier une commande
        System.out.println("************ Modifier une Commande by id_cmd :");
        Commande cmd_update = ctrl_cmd.getOne(2);
        cmd_update.setDateCmd(new Date("01/02/2022"));
        cmd_update.setPrix_Total(1000.15);
        ctrl_cmd.modify(cmd_update);
        ctrl_cmd.getAll().stream().forEach(i-> System.out.println(i));
        
        // Afficher toutes les commandes aprés la supprimer et modification
        System.out.println("************ Afficher toutes les commandes aprés la supprimer et modification :");
        ctrl_cmd.getAll().stream().forEach(i-> System.out.println(i));
        
        // Rechercher liste des commandes by date
        System.out.println("************ liste des commandes by date :");
        List<Commande> cmds = ctrl_cmd.GetCmdByDate(new Date("26/01/2022"));//id_cmd=4
        for(Commande cc:cmds) System.out.println(cc);
         

	}

}
