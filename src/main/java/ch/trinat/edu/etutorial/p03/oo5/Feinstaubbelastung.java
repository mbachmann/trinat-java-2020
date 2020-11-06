package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Feinstaubbelastung {

	public static void main(String[] args) {

		Vector<Messstation> vFeinstaubDaten = new Vector<Messstation>();
		String[] result = null;
		int i = 0;
		String fileName = "src/PM10_2003.2.txt";
		try ( FileReader f = new FileReader(fileName);) {

			char[] c = new char[10000000];
			f.read(c);
			String s = new String(c);
			result = s.split(";|\n");

			for (i = 0; i < result.length-1; i=i+8) {

				Messstation tmpDaten = new Messstation(result[i], result[i + 1], result[i + 2], result[i + 3],
						Integer.parseInt(result[i + 4]), Integer.parseInt(result[i + 5]),
						Integer.parseInt(result[i + 6]), Integer.parseInt(result[i + 7]));

				vFeinstaubDaten.add(tmpDaten);

			}
			System.out.println("File\"" + fileName + "\" erfolgreich eingelesen.");

			System.out.println(" ");

			System.out.println(vFeinstaubDaten.size() + " Einträge generiert");

			System.out.println(" ");

			System.out.println("Durchschnitt aller Jahresmittelwerte: " + calcJahresMittel(vFeinstaubDaten));

			System.out.println(" ");

			Vector<Messstation> datenÜberWert = getStationenMittelWertHöher(vFeinstaubDaten, 40);

			System.out.println("Stationen mit Jahresmittel über dem Grenzwert von 40 Mikrogramm pro Kubikmeter");
			System.out.println("******************************************************************************");
			System.out.println(" ");
			System.out.println("Anzahl: " + datenÜberWert.size() + ".\n");
			print1(datenÜberWert);
			print2(datenÜberWert); 

		}

		catch (IOException e) {
			System.err.println("Fehler beim einlesen der Datei.");
			System.err.println(e.getMessage());

		}

		catch (Exception e) {
			System.err.println("Bei der Verarbeitung ist ein Fehler aufgetreten.");
			System.err.println(e.getMessage());

		}

	}

	public static double calcJahresMittel(Vector<Messstation> daten) {

		double wertTotal = 0;

		for (int i = 0; i < daten.size(); i++) {

			Messstation tmpDaten = (Messstation) daten.get(i);
			wertTotal += tmpDaten.getJahresMittelWert();

		}

		return wertTotal / daten.size();
	}

	public static Vector<Messstation> getStationenMittelWertHöher(Vector<Messstation> daten, int wert) {

		Vector<Messstation> datenÜberWert = new Vector<Messstation>();

		for (int i = 0; i < daten.size(); i++) {

			Messstation tmpDaten = (Messstation) daten.get(i);

			if (tmpDaten.getJahresMittelWert() > wert) {

				datenÜberWert.add(tmpDaten);

			}
		}

		return datenÜberWert;

	}

	public static void print1(Vector<Messstation> daten) {

		for (int i = 0; i < daten.size(); i++) {

			Messstation tmpDaten = (Messstation) daten.get(i);
			System.out.println(tmpDaten.getName() + " " + tmpDaten.getUmgebungstyp() + " " + tmpDaten.getJahresMittelWert());
		}
	}

	public static void print2(Vector<Messstation> daten) {

		for (int i = 0; i < daten.size(); i++) {

			Messstation tmpDaten = (Messstation) daten.get(i);
			System.out.println(tmpDaten.getId() + " " + tmpDaten.getName());
			System.out.println("Emissionsquelltyp: " + tmpDaten.getEmissionsquelltyp());
			System.out.println("Umgebungstyp: " + tmpDaten.getUmgebungstyp());
			System.out.println("Jahresmittelwert: " + tmpDaten.getJahresMittelWert());
			System.out.println("Maximaler Tageswert: " + tmpDaten.getMaxTagesWert());
			System.out.println("Tage mit Tageswert > 50" + "\u03BCg/m3: " + tmpDaten.gettagesWert50());
			System.out.println("Tage mit tageswert > 60" + "\u03BCg/m3: " + tmpDaten.gettagesWert60());



		}
	}

}
