//Diese Klasse modelliert ein Adressbuch. Einzelne Eintr�ge werden in einem Vector gespeichert.

package ch.trinat.edu.etutorial.p03.oo6;

import java.util.*;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Adressbuch {

	// Ihre Variablendeklaration
    Eingabe eingabe = new Eingabe();
    Kontrolle kontrolle;
    
    JTextArea   text;
    
    String print;   
    
    List<Person> personen = new ArrayList<>() ;
    //List<Person> test = new Vector<>();
    //List<Person> persone = new ArrayList<Person>(); 
    
    public void addPerson (Person p) {
        // Ihr Code
    	
        personen.add(p);
    	   	
    	
        /*;
    	GregorianCalendar datum2= new GregorianCalendar(2001,11,04);//11=Dezember
    	
    	p = new Person("Bogart", "Berta","Hauptstrasse",19,1001,"Basel",datum2);
       	
    	p = new Person ();
    	
    	*/
    	   	
    	//p = new Person (String n, String v, String s, int h, int p, String w, GregorianCalendar g);
    }
    
    public String printAll() {
		// Ihr Code
    	
    	print = personen.size() + " ca marche ";
    	
    	return print;
    
    	}
    
    public void deleteAll () {
		// Ihr Code
    	
    	for (int i = 0; i < personen.size(); i++) {
    		personen.remove(i);
    	}
    	
    }
    
}

