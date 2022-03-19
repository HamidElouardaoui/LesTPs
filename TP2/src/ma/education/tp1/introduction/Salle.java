package ma.education.tp1.introduction;

public class Salle {

	// Attributs  
	//private long id;
	//private String nom;
	protected long id;
	protected String nom;
	
	
	// Un constructeur sans paramètres
	public Salle() {
		System.out.println("constructeur sans paramètres : Salle.java");
	}

	// Un constructeur pour le nom de la salle
	public Salle(String nom) {
		this.nom = nom;
		System.out.println("constructeur avec paramètres(nom) : Salle.java");
	}
	
	// Un constructeur pour l’id et le nom de la salle
	public Salle(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		System.out.println("constructeur avec paramètres(id,nom) : Salle.java");
	}

	// toString
	@Override
	public String toString() {
		return "Salle [id=" + id + ", nom=" + nom + "]";
	}
	
	public void methode1() {
		// test reflexion get getMethods();
	}
	
	public void methode2() {
		// test reflexion get getMethods();
	}
	
	/* 7. Recréer la méthode equals dans la classe “ma.education.tp1.introduction.Salle” pour
	 retourner true si deux objets portent le même id. */
	public boolean equals(Object obj1, Object obj2) {
		  boolean eq = false;
		  if (this == obj1 && this == obj2) {  
			  if (obj1 instanceof Salle && obj2 instanceof Salle) {
				  Salle s1 = (Salle) obj1;
				  Salle s2 = (Salle) obj2;
				  if(s1.id == s2.id) eq = true;
				  else eq = false;
			  }      
	      } else {
	    	  eq = false;
	      }
		  
		  return eq;
		
	}
	
	
	
	

}
