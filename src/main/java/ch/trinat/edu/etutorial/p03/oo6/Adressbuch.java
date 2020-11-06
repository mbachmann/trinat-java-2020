package ch.trinat.edu.etutorial.p03.oo6;

/*
 * Diese Klasse modelliert ein Adressbuch. Einzelne Einträge werden in einem Vector gespeichert.
 */

import java.util.*;

public class Adressbuch {

	// Ihre Variablendeklaration
	Vector adressbuch = new Vector();
    
    public void addPerson (Person p) {
        adressbuch.add(p);
    }
    
    public String printAll () {
		String output = "";
		for (int i = 0; i < adressbuch.size(); i++) {
			Person tmpPerson = (Person) adressbuch.get(i);
			output += tmpPerson.print();
		}
		return output;
    }
    
    public void deleteAll () {
		adressbuch.clear();
    }
    
}

