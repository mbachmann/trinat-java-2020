package ch.trinat.edu.etutorial.p03.oo5;
// In dieser Aufgabe wollen wir eine Textdatei einlesen und auswerten; E-Tutorial 5

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Hauptprogramm {

	static Messstation [] database = new Messstation[400];
	static Messstation [] grenzwert40 = new Messstation[400];
	static int count = 0, count2 = 0, yearlyAverage = 0;

	public static void main(String[] args) {



		//einlesen der Textdatei
		try (FileReader f = new FileReader("/trinat-java-2020/src/main/java/ch/trinat/edu/etutorial/p03/oo5/database.txt")){
			char c[] = new char[100000000];
			f.read(c);
			String s = new String(c);
			String[] result = s.split(";|\r|\r\n|\n");

			for (int i = 0; i < result.length-1; i=i+9){

				Messstation temporary = new Messstation(result[i],  result[i+1], result[i+2], result[i+3],
						Integer.parseInt(result[i+4]), Integer.parseInt(result[i+5]), Integer.parseInt(result[i+6]), Integer.parseInt(result[i+7]));

				database[count++] = temporary;
				//Füge alle Messstationen mit Jahresmittelwert über 40µg/cm3 in 2. Array ein
				if (Integer.parseInt(result[i+4]) > 40) {
					grenzwert40[count2++] = temporary;
				}
				f.close();
			}
		}
		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		printData();
		idSearch();
	}


	public static void idSearch() {    //beliebige Messstation suchen
		System.out.println("Falls Sie eine spezifische Messstation suchen, ID eingeben, ansonsten eine beliebige Taste drücken");
		Scanner eingabe = new Scanner(System.in);
		String stationId = eingabe.next();
		eingabe.close();
		//auffinden der Station
		for(int i = 0; i < count; i++) {
			if (database[i].getId().equals(stationId) == true){
				//Drucken der Station
				System.out.println("Station ID: " + database[i].getId() + " Ortschaft: " + database[i].getName()
						+ "\n Emissionsquellentyp: " + database[i].getSource() + " Umgebungsquellentyp: " + database[i].getSurrounding()
						+ "\n Jährliches Mittelwert: " + database[i].getYearly_mid() + " Maximales Tageswert: " + database[i].getDaily_max()
						+ "\n Anzahl Tage über 50µg/cm3: " + database[i].getThreshold50() + "Tage, und über 60µg/cm3: " + database[i].getThreshold60() + "Tage."); 
			}
		}
		System.out.println("--Ende der Recherche--");
	}

	public static void printData() {  //Ausgabe am Bildschirm
		//Alle Messstationen
		for( int i = 0; i < count; i++) {
			yearlyAverage += database[i].getYearly_mid();
			database[i].print();
		}

		//Messstationen mit überschrittenem Jahresmittelwert von 40micro
		System.out.println("_______________________________________________ \n"
				+ "Messstationen mit Jahresmittelwert über 40µg/m3 : \n") ;
		for(int i = 0; i < count2; i++) {
			System.out.println("ID: " + grenzwert40[i].getId() + " | Ortschaft: " + grenzwert40[i].getName()
					+ " | Jahresmittelwert: " + grenzwert40[i].getYearly_mid() + "µg/cm3.");
		}



		System.out.println("_______________________________________________ \n");
		System.out.println("Anzahl Einträge: " + count);

		//Jährliches Mittelwert
		yearlyAverage = yearlyAverage/count;
		System.out.println("Allgemeines Jahresmittelwert: " + yearlyAverage + "µg/cm3 \n");
	}

}




