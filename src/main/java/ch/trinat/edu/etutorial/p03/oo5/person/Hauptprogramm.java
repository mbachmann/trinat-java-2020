package ch.trinat.edu.etutorial.p03.oo5.person;
import java.util.*;
import java.io.*;

import java.util.Calendar;

public class Hauptprogramm {

	public static void main(String[] args) {
		int count = 0;		
		Person [] adressbuch = new Person[30];

		GregorianCalendar datum1 = new GregorianCalendar(1911,Calendar.JANUARY,1);
		Person anna = new Person("Allan", "Anna", "Ackerweg", 1, 11111, "Alberta", datum1);

		GregorianCalendar datum2 = new GregorianCalendar(1922,Calendar.FEBRUARY,2);
		Person berta = new Person("Bogart", "Berta", "Bürgerweg", 2, 22222, "Brandenburg", datum2);

		GregorianCalendar datum3 = new GregorianCalendar(1933,Calendar.MARCH,3);
		Person carl = new Person("Carlton", "Carl", "Cricketweg", 3, 33333, "Columbia", datum3);

		adressbuch[count++] = anna;
		adressbuch[count++] = berta;
		adressbuch[count++] = carl;

		try {
			FileReader f = new FileReader ("src/main/java/ch/trinat/edu/etutorial/p03/oo5/person/personen.txt");
			char[] c = new char[1300];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\\.|\n");

			for (int i=0; i<result.length-1; i=i+9) {
				GregorianCalendar tempDate = new GregorianCalendar (Integer.parseInt(result[i+8]),
						Integer.parseInt(result[i+7])-1, Integer.parseInt(result[i+6]));

				Person temp = new Person(result[i], result[i+1], result[i+2], Integer.parseInt(result[i+3]),
						Integer.parseInt(result[i+4]), result[i+5], tempDate);	

				adressbuch[count++] = temp;
			}

			f.close();
		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		for (int i=0; i < count; i++) {
			adressbuch[i].print();
		}
	}
}
