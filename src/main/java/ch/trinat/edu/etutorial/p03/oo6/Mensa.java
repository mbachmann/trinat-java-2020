package ch.trinat.edu.etutorial.p03.oo6;

import java.io.FileReader;
import java.io.IOException;

public class Mensa {

	static Nahrungsmittel [] zutaten = new Nahrungsmittel[11]; 


	public static void main (String [] args) {


		//einlesen und speichern der Textdatei
		try (FileReader f = new FileReader("C:\\Users\\micas\\Documents\\Cours\\Java\\eclipse\\Workspace\\trinat-java-2020\\src\\main\\java\\ch\\trinat\\edu\\etutorial\\p03\\oo6\\databaseNutrients.txt")){
			char c[] = new char[8000];
			f.read(c);
			String s = new String(c);
			String[] result = s.split(";|\n");

			for(int j = 0; j< 11; j++) {
				double[][] nahrungswerte = new double[28][3];

				for (int i = 1+j*85; i < 85+j*85; i=i+3){
					nahrungswerte[(i%85-1)/3][0] = Double.parseDouble(result[i]);
					nahrungswerte[(i%85-1)/3][1] = Double.parseDouble(result[i+1]);
					nahrungswerte[(i%85-1)/3][2] = Double.parseDouble(result[i+2]);

					Nahrungsmittel ntemp = new Nahrungsmittel(result[j*85]);
					ntemp.setNaehrwerte(nahrungswerte);
					zutaten[j] = ntemp;
				}

			}
			f.close();
		}

		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		//erstellen des Menüs
		int beilage = (int)(Math.random()*3);
		int fleisch = (int)(Math.random()*4+3);
		int gemuese = (int)(Math.random()*4+7);

		/*
		zutaten[fleisch].print();
		zutaten[gemuese].print();
		zutaten[beilage].print();
		 */
		menu menu1 = new menu("Menü 1", zutaten[fleisch], zutaten[gemuese], zutaten[beilage]);
		menu1.kochen();
		menu1.print();
	}
}
