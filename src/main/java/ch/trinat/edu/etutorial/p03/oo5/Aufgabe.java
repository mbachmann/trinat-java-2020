package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;

public class Aufgabe {

	public static void main(String[] args) {

		try {
			Messstation [] donnees = new Messstation [400];
			int count = 0, anzahl = 0;
			double somme = 0;
			FileReader f = new FileReader("src/main/java/ch/trinat/edu/etutorial/p03/oo5/PM10.txt");
			char [] c = new char [8000];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n");
			for( int i = 0; i < result.length - 1; i = i + 8) {

				Messstation messstation = new Messstation(result[i], result[i + 1], result[i + 2], result[i + 3],
						Integer.parseInt(result[i + 4]), Integer.parseInt(result[i + 5]), 
						Integer.parseInt(result[i + 6]), Integer.parseInt(result[i + 7]));

				donnees[count++] = messstation;

				somme = somme + Integer.parseInt(result[i + 4]);

				if (40<Integer.parseInt(result[i + 4])) {

					anzahl++;

				}
			}	

			somme = somme / count;

			System.out.println("Durschnitt aller Jahresmittelwerte: " + somme 
					+ "\n\nStationen mit Jahresmittel über dem Grenzwert von 40 Mikrogramm pro Kubikmeter:"
					+ "\n*******************************************************************************\n"
					+ "Anzahl : " + anzahl + "\n");
			
			for (int i = 0; i < count; i++) {
				if ( 40 < donnees[i].getJahresmittelwert() ) 
					System.out.println( donnees[i].getName() + " " +
							donnees[i].getUmgebungstyp() + " " +
							donnees[i].getJahresmittelwert()
							);
			}

			System.out.println();

			for (int i = 0; i < count; i++) {
				donnees[i].print();
			}

			f.close();

		}catch(IOException e) {
			System.err.println("Fehler beim einlesen der Datei");
			System.err.println(e.getMessage());
		}

	}

}
