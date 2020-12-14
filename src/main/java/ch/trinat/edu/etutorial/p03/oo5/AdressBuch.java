package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;
import java.util.GregorianCalendar;

public class AdressBuch {

	public static void main(String[] args) {

		Person adressBuch[] = new Person[30];
		int count = 0;

		try {
			/*
			 * new FileReader Objekt - char Array - Zeichen drin "lesen" - string - splitten
			 * in str array
			 */
			FileReader f = new FileReader("src/personen1.txt");
			char c[] = new char[1300];
			f.read(c);
			String s = new String(c);
			String result[] = s.split(";|\\.|\n");

			for (int i = 0; i <= result.length - 9; i = i + 9) {

				GregorianCalendar tempDatum = new GregorianCalendar(Integer.parseInt(result[i + 8]),
						Integer.parseInt(result[i + 7]) - 1, Integer.parseInt(result[i + 6]));

				Person tempP = new Person(result[i], result[i + 1], tempDatum, result[i + 2],
						Integer.parseInt(result[i + 3]), Integer.parseInt(result[i + 4]), result[i + 5]);

				adressBuch[count++] = tempP;

			}
			f.close();

		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		for (int i = 0; i < count; i++) { // < weil count nach letzte Auswertung erhöht wurde: count = # Person + 1
			adressBuch[i].print();
		}
	}
}
