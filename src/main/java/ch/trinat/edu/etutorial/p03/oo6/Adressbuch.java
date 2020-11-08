package ch.trinat.edu.etutorial.p03.oo6;
/*
 
* Diese Klasse modelliert ein Adressbuch. Einzelne Eintr�ge werden in einem Vector gespeichert.
 */

import java.util.*;

public class Adressbuch {

	Vector adressbuch= new  Vector ();
	
	
    public void addPerson (Person person) {
       adressbuch.add(person);
       
    }
    
    public String printAll () {//muss verbessert werden
    	String output = "";
		
		for(int i=0; i<adressbuch.size() ; i++) {
			Person tmpPerson = (Person) adressbuch.get(i);
			output+=tmpPerson.print();
		}
    	
    	return output;
    }
    
    public void deleteAll () {
		adressbuch.clear();
    }
    
}
