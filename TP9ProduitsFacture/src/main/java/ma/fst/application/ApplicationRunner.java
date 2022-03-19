package ma.fst.application;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.fst.models.Adresse;

import ma.fst.models.Client;
import ma.fst.models.Facture;
import ma.fst.models.Produit;
import ma.fst.presentation.ClientController;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctr= (ClientController) ctx.getBean("idCtrl");
		Client c = new Client();
		c.setNom("Marouane");
		c.setPrenom("NB");
		c.setTelephone("+212661003322");
		Adresse a = new Adresse();
		a.setVille("Casablance");
		a.setAvenue("2 mars");
		a.setPays("Maroc");
		c.setAdresse(a);
		ctr.save(c);
		
		Facture facture = new Facture();
		facture.setDate_facture(new Date("10/01/2022"));
		List<Produit> produits = new ArrayList<Produit>();
	    Produit p1 = new Produit("PC LENOVO", "i7 7th gén 256 ssd", 7500.00, 50);
		Produit p2 = new Produit("SOURIS SANS FIL", "DELL", 150.00, 15);
		Produit p3 = new Produit("SAC A DOS PC PORTABLE", "MARQUE HP", 250.00, 24);
		Produit p4 = new Produit("PC HP G7", "i5 10th 1To", 15000.00, 35);
		produits.add(p1);produits.add(p2);produits.add(p3);produits.add(p4);
		
		facture.setProduits(produits);
		
		List<Facture> factures1 = new ArrayList<Facture>() {
			Facture f1 = new Facture(new Date("01/01/2022"));
			Facture f2 = new Facture(new Date("15/10/2022"));
		};
		System.out.println("affichage : "+produits.size());
		produits.get(0).setFactures(factures1);
		produits.get(1).setFactures(factures1);
		
		List<Facture> factures2 = new ArrayList<Facture>() {
			Facture f3 = new Facture(new Date("15/05/2022"));
			Facture f4 = new Facture(new Date("22/06/2022"));
		};
		produits.get(2).setFactures(factures2);
		produits.get(3).setFactures(factures2);
		ctr.saveFacture(facture);

	}

}
