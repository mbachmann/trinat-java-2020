package ch.trinat.edu.etutorial.p03.oo6.mensa;

import java.io.FileReader;
import java.io.IOException;

public class Mensa {

	public static void main(String[] args) {

		try {
			String file = "src/main/java/ch/trinat/edu/etutorial/p03/oo6/mensa/nahrungsmittel.txt";
			FileReader f = new FileReader (file);
			char[] c = new char[8000];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n");
			
			Nahrungsmittel [] zutaten = new Nahrungsmittel[11];
			
			for (int j = 0; j < 11; j++) { //für alle 11 Nahrungsmittel
				double [][] werte = new double [28][3]; //für 28 Nährwerte je 3 Zahlen
				for (int i = 1+j*85; i < 85+j*85; i += 3) {
					werte[(i%85-1)/3][0] = Double.parseDouble(result[i]);
					werte[(i%85-1)/3][1] = Double.parseDouble(result[i+1]);
					werte[(i%85-1)/3][2] = Double.parseDouble(result[i+2]);
				}
			Nahrungsmittel ntemp = new Nahrungsmittel (result[j*85]);
			ntemp.setNaerwerte(werte);
			zutaten[j] = ntemp;
			}
			int beilage = (int)(Math.random()*3);
			int fleisch = (int)(Math.random()*4+3);
			int gemuese = (int)(Math.random()*4+7);
			
			Menu menu = new Menu("Menu 1", zutaten[fleisch], zutaten[gemuese], zutaten[beilage]);
			
			menu.print();
			menu.gefrieren();
			menu.kochen();
			menu.print();
			
			f.close();
			
		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}
	}
}
