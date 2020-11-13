package ch.trinat.edu.etutorial.p03.oo6.MensaMenus;

import java.io.FileReader;
import java.io.IOException;

public class Mensa {

	public static void main(String[] args) {

		Nahrungsmittel [] zutaten = new Nahrungsmittel [11];

		try {
			FileReader f = new FileReader("src/nahrungsmittel.txt");
			char [] array = new char [8000];
			f.read (array);
			String s = new String (array);
			String [] result = s.split(";|\n");

			for (int j = 0; j < 11; j ++) {
				double[][] werte = new double [28][3];
				for (int i = 1 + j * 85; i < 85 + j * 85; i = i + 3) {
					werte[(i % 85 - 1) / 3][0] = Double.parseDouble(result[i]);
					werte[(i % 85 - 1) / 3][1] = Double.parseDouble(result[i + 1]);
					werte[(i % 85 - 1) / 3][2] = Double.parseDouble(result[i + 2]);
				}


				Nahrungsmittel ntemp = new Nahrungsmittel (result[j*85]);
				ntemp.setNaehrwerte(werte);
				zutaten[j] = ntemp;
				
			}

		} 

		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		int fleisch = (int)(Math.random() * 4 + 3);
		int gemuse = (int)(Math.random() * 4 + 7);
		int beilage = (int)(Math.random() * 3);

		zutaten[fleisch].print();
		zutaten[gemuse].print();
		zutaten[beilage].print();

		Menu menu = new Menu("Menu 1", zutaten[fleisch], zutaten[gemuse], zutaten[beilage]);
		
		menu.print();
		menu.gefrieren();
		menu.kochen();
		menu.print();
	}

}
