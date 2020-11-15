package ch.trinat.edu.etutorial.p03.oo6.mensa;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mensa {

	// Variablen für das Schicksal des Menüs
	static int beilage, fleisch, gemuese;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new FileReader("src/eTutorial6/nahrungsmittel.txt"));) {
			scanner.useDelimiter(";|\n");
			ArrayList<String> tempList = new ArrayList<String>();
			while (scanner.hasNext()) {
				tempList.add(scanner.next());
			}
			String result[] = tempList.toArray(new String[0]); // oder new String[tempList.size()]

			Nahrungsmittel[] zutaten = new Nahrungsmittel[11];

			for (int j = 0; j < 11; j++) {
				// erzeugen einen 28x3 Array mit Nährwerte und Koeffizienten:
				double[][] werte = new double[28][3];
				// init des Arrays mit Werte aus dem Array result[]:
				for (int i = 1 + j * 85; i < 85 + j * 85; i = i + 3) {
					werte[(i % 85 - 1) / 3][0] = Double.parseDouble(result[i]);
					werte[(i % 85 - 1) / 3][1] = Double.parseDouble(result[i + 1]);
					werte[(i % 85 - 1) / 3][2] = Double.parseDouble(result[i + 2]);
				}
				zutaten[j] = new Nahrungsmittel(result[j * 85]); // erzeugen & init mit Name
				zutaten[j].setNaehrwerte(werte); // übergeben der sortierten Werte

//	sonst		Nahrungsmittel ntemp = new Nahrungsmittel (result[j*85]);
//				ntemp.setNaehrwerte(werte);
//				zutaten[j]=ntemp;
			}

			futterPermutation();
			Menu menu = new Menu("Menu 1", zutaten[beilage], zutaten[fleisch], zutaten[gemuese]);
			menu.print();
			menu.kochen();
			menu.print();
			menu.gefrieren();
			menu.print();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void futterPermutation() {
		beilage = (int) (Math.random() * 3);
		fleisch = (int) (Math.random() * 4 + 3);
		gemuese = (int) (Math.random() * 4 + 7);
	}

}
