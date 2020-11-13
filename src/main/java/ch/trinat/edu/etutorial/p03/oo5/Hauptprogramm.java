package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Hauptprogramm {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		Vector<MessstationDaten> daten = new Vector<MessstationDaten>();
		Vector<TageMehrAlsVierzig> stationen = new Vector<TageMehrAlsVierzig>();

		int count = 0, countStat = 0;
		int durschnittWerte = 0;
		int nummer = 0;


		try {
			FileReader f = new FileReader("src\\PM10_2003[2440].txt");
			char [] array = new char [100000000];
			f.read (array);
			String s = new String (array);
			String [] result = s.split(";|\n");

			for (int i = 0; i < result.length - 1; i = i + 8) {
				MessstationDaten temp = new MessstationDaten (result[i], result[i+1], result[i+2], result[i+3],
						Integer.parseInt(result[i+4]), Integer.parseInt(result[i+5]), 
						Integer.parseInt(result[i+6]), Integer.parseInt(result[i+7]));

				daten.add(temp);

				durschnittWerte = durschnittWerte + Integer.parseInt(result[i+4]);
				count++;

				if(Integer.parseInt(result[i+4]) > 40) {
					TageMehrAlsVierzig stat = new TageMehrAlsVierzig(result[i+1], result[i+2], Integer.parseInt(result[i+4]));
					stationen.add(stat);
					countStat ++;
				}
			}
			
			double durschnitt = Math.round((double)durschnittWerte / count * 100) / 100.0;
			
			System.out.println("File PM10_2003[2440].txt erfolgreich eingelesen.\n" + count + " Eintr�ge generiert.\n");
			System.out.println("Der Durschnitt aller Jahresmittelwerte ist: " + durschnitt);
			System.out.println("\n*******************************************************\n");
			System.out.println("Anzahl Stationen mit einem Jahresmittelwert �ber 40\u03BCg/m3: " + countStat + "\n");
			
			for (int i = 0; i < countStat;i++) {
				stationen.get(i).printStat();
			}
			
			do {
				System.out.print("\nM�chten sie alle Daten von einer Station sehen?\nDann geben sie bitte die nummer der zeile ein: ");
				nummer = eingabe.nextInt() - 1;
			}
			while (nummer < 0 || nummer > count);
			
			System.out.println();
			daten.get(nummer).print();

		} 

		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}
		eingabe.close();

	}

}
