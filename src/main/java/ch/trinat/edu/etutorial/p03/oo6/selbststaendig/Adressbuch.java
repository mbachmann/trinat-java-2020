// Diese Klasse modelliert ein Adressbuch. Einzelne Eintraege werden in einem Vector gespeichert.
 
package ch.trinat.edu.etutorial.p03.oo6.selbststaendig;

import java.util.*;

public class Adressbuch {

	// Ihre Variablendeklaration

	Vector<Person> eintraege = new Vector<Person>();

	public void addPerson(Person p) {
		// Ihr Code
		eintraege.add(p);
	}

	public String printAll() {
		// Ihr Code
		String s = "";
		for (int i = 0; i < eintraege.size(); i++) {
			s = s + eintraege.get(i).print();
			// entspricht s += eintraege.get(i).print();
		}
		return s;
	}

	public void deleteAll() {
		// Ihr Code
		eintraege.clear();
	}

}
