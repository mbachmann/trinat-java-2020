package ETutorial5;

import java.util.*;
import java.io.*;

public class Hauptprogramm {

	public static void main(String[] args) {

//		
		Person[] adressbuch = new Person[30];
		int count = 0; // Um die besetzten Plätzen zu zählen

		/*
		 * Person anna = new Person(); Person berta = new Person();
		 * 
		 * anna.setName("Allan"); anna.setVorname("Anna"); anna.setAlter(22) ;
		 * 
		 * berta.setName("Bogart"); // Herstellung von Personnen mit die normale Methode
		 * und Setters berta.setVorname("Berta"); berta.setAlter(23);
		 */

		GregorianCalendar datum1 = new GregorianCalendar(1900, Calendar.MAY, 7);
		GregorianCalendar datum2 = new GregorianCalendar(1999, Calendar.MARCH, 19);
		GregorianCalendar datum3 = new GregorianCalendar(2001, Calendar.APRIL, 28);

		Person anna = new Person("Allan", "Anna ", "Universitätsstrasse", 6, 8006, "Zuerich", datum1); // Herstellung
																										// von Personnen
																										// dank
																										// Konstruktor
		Person berta = new Person("Bogart", "Berta ", "Ballerstrasse", 7, 8902, "Basel", datum2);
		Person carl = new Person("Wolf", "Carl", "Orangenstrasse", 19, 1293, "Bern", datum3);

		adressbuch[count++] = anna; // Speichern die Personen an den ersten drei Positionen des Arrays
		adressbuch[count++] = berta; // 'count++' erhöht die Variable 'count' um 1, nachdem Sie ausgewertet wurde
		adressbuch[count++] = carl;

		for (int i = 0; i < count; i++) { // alle Einträge des Adressbuches werden in einer Schleife ausgedruckt
			adressbuch[i].print();
		}

		/*
		 * anna.print(); berta.print(); carl.print();
		 */

		// Try-catch-Block

		try {

			// File reader
			FileReader f = new FileReader("personen.txt");

			char[] c = new char[1300];
			f.read(c);

			String s = new String(c);
			String[] result = s.split(";|\n|\\."); // " ;|\r|\\. " Si l'autre ne marche pas 

			for (int i = 0; i < result.length - 1; i = i + 9) {
				GregorianCalendar tempDate = new GregorianCalendar(Integer.parseInt(result[i + 8]),
						Integer.parseInt(result[i + 7]) - 1, Integer.parseInt(result[i + 6]));

				Person temp = new Person(result[i], result[i + 1], result[i + 2], Integer.parseInt(result[i + 3]),
						Integer.parseInt(result[i + 4]), result[i + 5], tempDate);

				adressbuch[count++] = temp;
			}

			for (int i = 0; i < count; i++) { // alle Einträge des Adressbuches werden in einer Schleife ausgedruckt
				adressbuch[i].print();
			}
			f.close();

		} catch (IOException e) {
			System.err.println("Fehler beim Einlese der Datei.");
			System.err.println(e.getMessage());
		}

	}

}
