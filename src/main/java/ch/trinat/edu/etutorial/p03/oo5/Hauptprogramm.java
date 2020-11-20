package ch.trinat.edu.etutorial.p03.oo5;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.FileReader;
import java.io.IOException;

public class Hauptprogramm {

	public static void main(String[] args) {
		Person [] adressbuch = new Person[30];
		int count = 0;
		/*
		GregorianCalendar datum1 = new GregorianCalendar(1931, Calendar.AUGUST,23);
		Person anna = new Person("Allan", "Anna", "Universit�tsstrasse", 6, 8006, "Z�rich", datum1);
		GregorianCalendar datum2 = new GregorianCalendar(1900, Calendar.MAY,7);
		Person berta = new Person("Bogart", "Berta", "Limmatgasse", 19, 8021, "Z�rich", datum2);
		GregorianCalendar datum3 = new GregorianCalendar(1906, Calendar.NOVEMBER,14);
		Person carl = new Person("Kraus", "Carl", "Bahnhofstrasse", 89, 8001, "Z�rich", datum3);

		Person [] adressbuch = new Person[30];
		int count = 0;

		adressbuch[count++] = anna;
		adressbuch[count++] = berta;
		adressbuch[count++] = carl;*/

		/*for (int i = 0; i < count; i++) {
			adressbuch[i].print();
		}*/

		try {
			FileReader f = new FileReader("personen.txt");
			char [] c = new char[1300];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n|\\.|\r");
			for (int i = 0; i < result.length - 1; i = i + 9) {
				GregorianCalendar tempDate = new GregorianCalendar(Integer.parseInt(result[i + 8]),
						Integer.parseInt(result[i + 7]) - 1, Integer.parseInt(result[i + 6]));
				Person temp = new Person(result[i], result[i + 1], result[i + 2], Integer.parseInt(result[i + 3]),
						Integer.parseInt(result[i + 4]), result[i + 5], tempDate);

				adressbuch[count++] = temp;
			}

			for (int i = 0; i < count; i++) {
				adressbuch[i].print();
			}
		}

		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		/* anna.setVorname("Anna");
		anna.setName("Allan");
		anna.setAlter(22);

		berta.setVorname("Berta");
		berta.setName("Bogart");
		berta.setAlter(53); */

		/* anna.print();
		berta.print();
		carl.print(); */

	}

}
