package ch.trinat.edu.etutorial.p03.oo6;
import java.util.*;
/*
 * Diese Klasse modelliert ein Adressbuch. Einzelne Einträge werden in einem Vector gespeichert.
 */
public class Adressbuch {
	String name,vorname,wohnort,strasse;
	GregorianCalendar geburtsdatum;
	int hausnummer,plz;
	static Person temp;
	static Vector <Person> personen = new Vector <Person>();
	
	 public void addPerson(Person p) {
	    	personen.add(p);
	    }
	 
    public String printAll () {
    	String info ="";
    	for(int i=0;i<personen.size();i++) {
		temp = personen.elementAt(i);
		info +="\n\t"+(i+1)+". Eintrag: \n"+ Person.print();
		if(temp instanceof Lehrer) {
		info += Lehrer.print();
		}
		else if(temp instanceof Student) {
			info += Student.print();
			}
		
    }
    return "\n" + info + "\n\n";
    
   } 
    public void deleteAll () {
		personen.removeAllElements();
    }

	

}