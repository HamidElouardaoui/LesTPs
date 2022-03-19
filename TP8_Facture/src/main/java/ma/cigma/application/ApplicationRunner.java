package ma.cigma.application;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ma.cigma.models.Facture;
import ma.cigma.presentation.FactureController;



public class ApplicationRunner {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		FactureController ctrl = (FactureController) context.getBean("idCtrl");
		
		/* Save des nouvelles factures */
	
		ctrl.save(new Facture(new Date("10/01/2022"), 7500.75));
		ctrl.save(new Facture(new Date("11/01/2022"), 9600.42));
		ctrl.save(new Facture(new Date("12/01/2022"), 4600.25));
	
        
        /* Update Facture with id==1 */
        //ctrl.modify(new Facture(1, new Date("02/01/2022"), 9000.00));
        
        /* Supprimer une facture  */
        //ctrl.deleteById(1L);
        
        /* Rechercher une facture */
        //Facture search = ctrl.getById(2L);
        //System.out.println(search);
		
		/* Afficher tous les enregistrements */
		List<Facture> factures = ctrl.finAll();
		factures.forEach(f -> System.out.println("\n"+f));


	}

}
