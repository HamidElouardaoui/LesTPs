package ma.education.tp1.introduction;

public class TestHeritage {

	
	
	public static void main(String[] args) {
		
		Salle s1=new SalleCours(1, "Salle 1", 20);
		SalleCours s2= new SalleCours(2, "Salle 2", 20);
		//SalleCours s3=s1;//   erreur de cast
		SalleCours s3=(SalleCours) s1;
		SalleCours s4=s2;
		
		//Affichage
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
		
		Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
		SalleCours s6= new SalleCours(2, "Salle 2", 20);
		// SalleCours s7=s5; // erreur, on peut pas faire un cast explicite pour corriger cette erreur
		// ce n'est pas le méme type ?
		SalleCours s8=s6;
		
		// affichage
		System.out.println("s5 : "+s5);
		System.out.println("s6 : "+s6);
		//System.out.println("s7 : "+s7);
		System.out.println("s8 : "+s8);
		

	}

}
