package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

/*
 * Diese Klasse modelliert ein Adressbuch. Einzelne Einträge werden in einem Vector gespeichert.
 */

import java.util.*;

public class Adressbuch {
	// Variablendeklaration
	Vector<Person> personen = new Vector<Person>();

	public void addPerson(Person p) {
		personen.add(p);
	}

	// alle Daten werden in ein String gespeichert > return
	public String printAll() {
		String s = "";
		for (int i = 0; i < personen.size(); i++) {
			s += personen.get(i).print();
		}
		return s;
	}

	public void deleteAll() {
		personen.clear();
	}

}
