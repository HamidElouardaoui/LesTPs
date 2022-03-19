package ma.education.tp1.introduction;

public class AccesSamePackage {

	public static void main(String[] args) {
		/* 3. Créer un objet de la classe Salle ayant le nom “Salle A” dans la méthode main de la
		classe AccesSamePackage. Afficher les valeurs des attributs nom et id. */
		Salle s = new Salle("Salle A");
		//System.out.println(s.toString());
		System.out.println("id : "+s.id+" - Nom : "+s.nom);

	}

}
