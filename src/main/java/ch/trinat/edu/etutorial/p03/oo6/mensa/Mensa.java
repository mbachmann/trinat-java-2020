package ch.trinat.edu.etutorial.p03.oo6.mensa;

import java.io.*;

public class Mensa {

	public static void main(String[] args) {

		// einlesen der Textdatei
		try {
			String file = ("src/et6_Mensa/nahrungsmittel.txt");
			FileReader f = new FileReader(file);
			char[] c = new char [8000];
			f.read(c);
			String s = new String(c);
			String [] result;
			result = s.split(";|\n");		

			Nahrungsmittel[] zutaten = new Nahrungsmittel[11];

			for (int j = 0; j < 11; j++) { //fuer alle 11 Nahrungsmittel
				double[][] werte = new double[28][3]; //fuer 28 Naehrwerte je 3 Zahlen
				for (int i = 1 + j * 85; i < 85 + j * 85; i = i + 3) {
					werte[(i % 85 - 1) / 3][0] = Double.parseDouble(result[i]);
					werte[(i % 85 - 1) / 3][1] = Double.parseDouble(result[i + 1]);
					werte[(i % 85 - 1) / 3][2] = Double.parseDouble(result[i + 2]);
				}

				// Nahrungsmittelobjekte
				Nahrungsmittel ntemp = new Nahrungsmittel (result[j * 85]);
				ntemp.setNaehrwerte(werte);
				zutaten[j] = ntemp;
			}

			// Zufallszahlen f�r Menu
			int beilage = (int) (Math.random() * 3);
			int fleisch = (int) (Math.random() * 4 + 3);
			int gemuese = (int) (Math.random() * 4 + 7);


			/* zutaten[beilage].print();
			zutaten[fleisch].print();
			zutaten[gemuese].print(); */

			// erstellen des Menus
			Menu menu = new Menu("\nMenu 1", zutaten[fleisch], zutaten[gemuese], zutaten[beilage]);

			// Ausdruck des Menus
			menu.print();
			menu.kochen();
			menu.gefrieren();
			menu.print();
		}

		// catch
		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

	}

}
