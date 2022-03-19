package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {
		
		//Un objet (o1) en utilisant le constructeur sans paramètres
		Salle o1 = new Salle();
		
		//Un objet (o2) ayant le nom “Salle Informatique”
		Salle o2 = new Salle("Salle Informatique");
		
		// Un objet (o3) ayant l’id 2 et le nom “Salle des cours”
		Salle o3 = new Salle(2, "Salle des cours");
		
		// Afficher dans la consoles les valeurs des attributs des objets o1, o2 et o3
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		

	}

}
