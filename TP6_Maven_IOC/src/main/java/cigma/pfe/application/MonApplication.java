package cigma.pfe.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class MonApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) context.getBean("idCtrl");

        ctrl.save(new Client(1,"Marouane"));
        ctrl.save(new Client(1,"Oussama"));
        ctrl.save(new Client(1,"Mohamed"));
        ctrl.save(new Client(1,"Amine "));

	}

}
