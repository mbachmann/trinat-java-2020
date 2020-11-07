/*
 * Diese Klasse modelliert ein Adressbuch. Einzelne Einträge werden in einem Vector gespeichert.
 */
package ch.trinat.edu.etutorial.p03.oo6.adressbuch;
import java.util.*;

public class Adressbuch {

	Vector <Person> personen = new Vector<Person>();
    
    public void addPerson(Person p) {
    	personen.add(p);
    }
    
    public String printAll() {
		String all = null;
		for (int i = 0; i < personen.size(); i++) {
			String printall;
			printall = personen.get(i).toString() + "\n";
			all = all + printall;
		}
    	return all;
    }
    
    public void deleteAll() {
		int size = personen.size();
		for (int i = 0; i < size ; i++) {
			personen.remove(i);
		}
    }
}
