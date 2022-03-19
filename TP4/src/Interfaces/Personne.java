package Interfaces;

public interface Personne {
	
	default boolean deletePersonne(int IdP) {
		return true;
	}
	
	static String getInfo(int idP) {
		return "Mohammed";
	}

}
