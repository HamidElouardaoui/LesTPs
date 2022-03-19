package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import ma.education.tp1.introduction.Salle;

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		
		/* 3. Dans la méthode main, créer un programme java qui affiche les nom des attributs de la
		classe “ma.education.tp1.introduction.Salle” */
		
		 Class s = Salle.class;
		 System.out.println("classe de Salle  = "+s.getName());
		 Field[] fields = s.getDeclaredFields();
		 
		 for(Field f:fields) {
			 System.out.printf("Field name: %s, type: %s%n",
	                    f.getName(), f.getType().getSimpleName());
		 }
		 
		 // Fin 3
		 
		 /* 4. Dans la méthode main de la classe TestReflection, créer un programme java qui affiche
		 les nom des méthodes de la classe “ma.education.tp1.introduction.Salle” */
		 
		 Method[] methodes = s.getMethods();
		 for (Method m: methodes) {
			//System.out.println(m.getName());	
	     }
		 
		 for (int i = 0; i < methodes.length; i++) { 
		 //for (Method method : methods) {
			 System.out.println(methodes[i].getName());          
		      //System.out.println(methodes[i].getReturnType().getName());
		      //System.out.println(methodes[i].getParameterTypes());
		 } 
		 
		 // Fin 4
		 
		
		 /* 5. Dans la méthode main de la classe TestReflection, En utilisant la reflection, instancier
		 trois objets de la classe “ma.education.tp1.introduction.Salle” */
		 
		 Class ss = Salle.class;
		 Constructor[] constructors = ss.getDeclaredConstructors();
		 
		 for(Constructor cst:constructors) {
			 System.out.println("constructors getModifiers : "+cst.getModifiers());
		 	 System.out.println("constructors getName : "+cst.getName());
		 	 System.out.println("constructors getParameterCount : "+cst.getParameterCount());
		 }
		 
		 // debut not working ????
		 //Object o = constructors[1].newInstance(null);
		 //Salle sc = (Salle) o;
		 // fin not working ????
		 
		 // a.  Un objet (o1) en utilisant le constructeur sans paramètres
		 Class cc = Class.forName("ma.education.tp1.introduction.Salle");
		 Object ob = cc.newInstance();
		 Salle sa = (Salle) ob;
		 System.out.println(sa);
		 
		 // b.  Un objet (o2) ayant le nom “Salle Informatique”
		 Class cc1 = Class.forName("ma.education.tp1.introduction.Salle");
		 Object ob1 = cc1.getConstructor(String.class).newInstance("Salle Informatique");
		 Salle sa1 = (Salle) ob1;
		 System.out.println(sa1);
		 
		 //c. Un objet (o3) ayant l’id 2 et le nom “Salle des cours”
		 Class cc2 = Class.forName("ma.education.tp1.introduction.Salle");
		 Object ob2 = cc2.getConstructor(long.class, String.class).newInstance(2,"Salle des cours");
		 Salle sa2 = (Salle) ob2;
		 System.out.println(sa2);
		 
		 // Fin 5
		 
		 
		 /* 6. Dans la méthode main, comparer les objets o2 et o3 en utilisant la méthode equals de la
		 classe Object. Afficher le résultat de la comparaison dans la console */
		 
		 System.out.println(sa1.equals(sa2)); // resulta = false
		 
		
	

	}

}
