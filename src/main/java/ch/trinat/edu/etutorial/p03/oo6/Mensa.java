package ch.trinat.edu.etutorial.p03.oo6;

import java.io.FileReader;
import java.io.IOException;

public class Mensa {

	public static void main(String[] args) {

		Nahrungsmittel [] zutaten = new Nahrungsmittel[11];


		try{
			FileReader f = new FileReader("C:\\Users\\lucas\\Documents\\java\\Workspace\\trinat-java-2020\\src\\main\\java\\ch\\trinat\\edu\\etutorial\\p03\\oo6\\nahrungsmittel.txt");
			char [] text = new char [100000];
			f.read(text);
			String s = new String(text);
			String [] result=s.split(";|\n");


			for(int j = 0 ; j < 11 ; j++) {
				double [][] werte = new double[28][3];
				for(int i = 1 + j * 85 ; i < 85 + j * 85 ; i = i + 3) {
					werte [(i%85-1)/3][0] = Double.parseDouble(result[i]); 
					werte [(i%85-1)/3][1] = Double.parseDouble(result[i+1]); 
					werte [(i%85-1)/3][2] = Double.parseDouble(result[i+2]); 
				}

				Nahrungsmittel ntemp = new Nahrungsmittel (result[j*85], false, false);
				ntemp.setNaehrwerte(werte);
				zutaten[j] = ntemp;
			}

			f.close();

		}
		catch(IOException e){
			System.err.println("Fehler beim einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		int beilage = (int)(Math.random()+2);
		int fleisch = (int)(Math.random()*4+3);
		int gemuese = (int)(Math.random()*4+7);

		Menu menu = new Menu("Menu 1", zutaten[fleisch],zutaten[gemuese],zutaten[beilage]);
/*
		zutaten[beilage].print();
		zutaten[fleisch].print();
		zutaten[gemuese].print();
*/
		menu.print();
		menu.gefrieren();
		menu.gekocht();
		menu.print();

	}

}
