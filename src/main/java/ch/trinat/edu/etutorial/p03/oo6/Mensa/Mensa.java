package ch.trinat.edu.etutorial.p03.oo6.Mensa;

import java.io.FileReader;
import java.io.IOException;

public class Mensa {

	public static void main (String[] args) {
		
		try {
			String file = "Nahrungsmittel.txt";
			FileReader f = new FileReader (file);
			char[] c = new char[8000];
			f.read(c);
			String s = new String (c);
			String[] result;
			result = s.split(";|\n");
			
			Nahrungsmittel[] zutaten = new Nahrungsmittel [11];
			
			for (int j=0 ; j<11 ; j++) {
				double [][] werte = new double [28][3];
				for (int i=1+j*85 ; i<85+j*85 ; i=i+3) {
					werte [(i%85-1)/3][0] = Double.parseDouble(result[i]);
					werte [(i%85-1)/3][1] = Double.parseDouble(result[i+1]);
					werte [(i%85-1)/3][2] = Double.parseDouble(result[i+2]);
				}
				Nahrungsmittel nTemp = new Nahrungsmittel (result[j*85]);
				nTemp.setNaehrwerte(werte);
				zutaten[j] = nTemp;
			}
			
			int beilage = (int) (Math.random()*3);
			int fleisch = (int) (Math.random()*4+3);
			int gemuese = (int) (Math.random()*4+7);
			
			//zutaten[beilage].printInfo();		//Zeigt einzelne Zutaten an (Beilage, Fleisch und Gemuese)
			//zutaten[fleisch].printInfo();
			//zutaten[gemuese].printInfo();
			
			Menu menu = new Menu("Menu 1", zutaten[fleisch], zutaten[gemuese], zutaten[beilage]);
			
			menu.printInfo();
			menu.gefrieren();
			menu.kochen();
			System.out.println("********************************************");
			System.out.println("********************************************");
			System.out.println();
			menu.printInfo();
			
			f.close();
		}
		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei");
			System.err.println(e.getMessage());
		}
	}
}
