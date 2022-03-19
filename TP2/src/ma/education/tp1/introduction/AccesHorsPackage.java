package ma.education.tp1.introduction;

public class AccesHorsPackage extends Salle{
	
	

	public static void main(String[] args) {
		/* 5. Créer un objet de la classe Salle ayant le nom “Salle B” dans la méthode main de la
		classe AccesHorsPackage . Afficher les valeurs des attributs nom et id.*/
		
		Salle b = new Salle("Salle B");
		System.out.println("id : "+b.id+" - Nom : "+b.nom);
		
		
		// test methode void afficher(Salle s)
		AccesHorsPackage hors = new AccesHorsPackage();
		//System.out.println(hors.afficher(b));

	}
	
	// 13. Dans la classe AccesHorsPackage créer la méthode afficher
		public static void afficher(Salle s) {
			System.out.println(s.id );
			System.out.println(s.nom );
			try {
				//System.out.println(id );
				//System.out.println(nom );
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
