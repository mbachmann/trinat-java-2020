package ch.trinat.edu.etutorial.p03.oo5;
//Mischa Kissling
//10/2020

import java.util.*;
import java.io.*;

public class Telefonbuch {

	public static void main(String[] args) {

		Person[] adressbuch = new Person[30];
		int count = 0;

		try (FileReader f = new FileReader ("personen2.txt");){
			char [] c = new char[1300];
			f.read(c);
			String s = new String(c);
			String[] result = s.split(";|\n|\\.|\r");
			for (int i=0 ; i<result.length-1 ; i+=9) {
				GregorianCalendar tempDatum = new GregorianCalendar(Integer.parseInt(result[i+8]),
						Integer.parseInt(result[i+7]), Integer.parseInt(result[i+6]));
				adressbuch[i/9] = new Person (result[i], result[i+1], result[i+2], Integer.parseInt(result[i+3]),
						Integer.parseInt(result[i+4]), result[i+5], tempDatum);
				count++;
			}
			//Test für result[m]
			/*for (int m=0 ; m<13 ; m++) {
					System.out.println(result[m]);
				}*/

			//f.close();				//Kann gespart werden da neu in try (...) {

		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei");
			System.err.println(e.getMessage());
		}

		//GregorianCalendar datum1 = new GregorianCalendar(1900, Calendar.MAY, 7);
		//Person anna = new Person("Anna", "Allan", "Universitätsstrasse", 6, 8006, "Zürich", datum1);
		//GregorianCalendar datum2 = new GregorianCalendar(1900, Calendar.OCTOBER, 7);
		//Person berta = new Person("Berta", "Bogart", "Universitätsstrasse", 6, 8006, "Zürich", datum2);
		//GregorianCalendar datum3 = new GregorianCalendar(1900, Calendar.DECEMBER, 7);
		//Person carl = new Person("Carl", "Lagerfeld", "Universitätsstrasse", 6, 8006, "Zürich", datum3);

		//adressbuch[count++] = anna;
		//adressbuch[count++] = berta;
		//adressbuch[count++] = carl;

		for (int i=0 ; i<count; i++) {
			adressbuch[i].printInfo();
		}
	}

}
