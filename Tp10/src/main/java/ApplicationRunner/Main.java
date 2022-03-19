package ApplicationRunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import models.Client;
import models.ClientNormal;
import models.ClientVip;
import presentation.ClientController;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) c.getBean("ctrl1");

        // nouveau client
        ctrl.save(new Client("Marouane"));
        ctrl.save(new Client("Hamza"));
        //Nouveau client VIP
        ctrl.save(new ClientVip("Marouane VIP","Preferences_01"));
        ctrl.save(new ClientVip("Amine VIP","Preferences_01"));
        //Nouveau Client Normal
        ctrl.save(new ClientNormal("Marouane Normal",1));
        ctrl.save(new ClientNormal("Karim Normal",1));

	}

}
