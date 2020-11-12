/*
 * Diese Klasse modelliert ein Adressbuch. Einzelne Eintr�ge werden in einem Vector gespeichert.
 */

package ch.trinat.edu.etutorial.p03.oo6;

import java.util.*;

public class Adressbuch {
	String ausgabeAlles;
	Vector <Person> person = new Vector<Person>();

	public void addPerson (Person p) {

		person.addElement(p);
	}

	public String printAll () {
		StringBuffer sb = new StringBuffer(100000000);
		sb.delete(0, sb.length());
		for (int i = 0; i < person.size(); i++) {
			
			sb.append(((Person)person.elementAt(i)).print());
			
			if (person.elementAt(i) instanceof Studenten) {
				sb.append(((Studenten)person.elementAt(i)).infoStudent());
			}
			else if (person.elementAt(i) instanceof Professoren) {
				sb.append(((Professoren)person.elementAt(i)).infoProfessor());
			}
			else if (person.elementAt(i) instanceof Besucher) {
				sb.append(((Besucher)person.elementAt(i)).infoBesucher());
			}
			
			sb.append("\n");
		}
		
		return sb.toString();
	}

	public void deleteAll () {
		
			person.removeAllElements();
					
	}

}
