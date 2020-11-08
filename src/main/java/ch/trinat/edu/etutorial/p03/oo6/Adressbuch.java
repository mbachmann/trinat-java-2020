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
	static Vector <Person> speicher = new Vector <Person>();
	
    public static void addPerson (Person p) {
      speicher.add(p);
    }
    public void addStudent(Student s) {
    	speicher.add(s);
    }
    public void addLehrer(Lehrer l) {
    	speicher.add(l);
    }
    
    public String printAll () {
    	String info ="";
    	for(int i=0;i<speicher.size();i++) {
		temp = speicher.elementAt(i);
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
		speicher.removeAllElements();
    }

	

}