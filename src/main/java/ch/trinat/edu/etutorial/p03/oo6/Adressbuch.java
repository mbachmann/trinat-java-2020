package ch.trinat.edu.etutorial.p03.oo6;


import java.util.*;
import java.io.*;

public class Adressbuch  {
	
	
	
	public Vector <Person> phonebook = new Vector<Person>();
	public Vector <String> zahl = new Vector <String>();
	
   
    public void addPerson (Person p) {
    	
      phonebook.add(p);

    }
    
    public String printAll () {
    	String a = "";
        a = phonebook.toString();
    	return a;
    }
    
   
    
    public void deleteAll () {
		phonebook.clear();
    }
    
    

	
}
