package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

/*
 * Diese Klasse modelliert ein Adressbuch. Einzelne Einträge werden in einem Vector gespeichert.
 */

import java.util.Vector;

public class Adressbuch {
    // Variablendeklaration
    Vector<Person> personen = new Vector<>();

    public void addPerson(Person p) {
        personen.add(p);
    }

    // alle Daten werden in ein String gespeichert > return
    public String printAll() {
        StringBuilder s = new StringBuilder();
        for (Person person : personen) s.append(person.print());
        return s.toString();
    }

    public void deleteAll() {
        personen.clear();
    }

}
