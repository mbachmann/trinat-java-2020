package ch.trinat.edu.etutorial.p03.oo5;

import java.util.*;
import java.io.*;

public class Hauptprogramm {

	public static void main(String[] args) {
		
		GregorianCalendar datum1 = new GregorianCalendar(1982,Calendar.FEBRUARY,23);
		Person anna = new Person("Allan", "Anna", "Universitaetstrasse", 6, 8006, "Zuerich", datum1);
		
		GregorianCalendar datum2 = new GregorianCalendar(1900,Calendar.MAY,7);
		Person berta = new Person ("Bogart", "Berta", "Universitaetsstrasse", 6, 8006, "Zuerich", datum2);
		
		GregorianCalendar datum3 = new GregorianCalendar(1980,Calendar.APRIL,3);
		Person carl = new Person ("Chaplin", "Carl", "Hochschulstrasse", 4, 8006, "Zuerich", datum3);
		
		Person [] adressbuch = new Person [30];
		int count = 0;
		adressbuch[count++] = anna;
		adressbuch[count++] = berta;
		adressbuch[count++] = carl;
		
		for (int i=0; i < count; i++) {
			adressbuch[i].print();
		}
	
	try {
		FileReader f = new FileReader("src/personen.txt");
		char[] c = new char[1300];
		
		f.read(c);
		
		String s = new String(c);
		String [] result = s.split(";|\r\n|\n|\\.");
		
		for (int i = 0; i < result.length-1; i=i+9) {
		GregorianCalendar tempDate = new GregorianCalendar(Integer.parseInt(result[i+8]),
				Integer.parseInt(result[i+7])-1, Integer.parseInt(result[i+6]));
		Person temp = new Person(result[i], result[i+1], result[i+2], Integer.parseInt(result[i+3]),
				Integer.parseInt(result[i+4]), result[i+5], tempDate);
		
		adressbuch[count++] = temp;
		
		f.close();
		}
		
	}
	catch (IOException e) {
		System.err.println("Fehler beim Einlesen der Datei.");
		System.err.println(e.getMessage());
		}
	
	for (int i = 0; i < count; i++) {
		adressbuch[i].print();
		}



	}
}
