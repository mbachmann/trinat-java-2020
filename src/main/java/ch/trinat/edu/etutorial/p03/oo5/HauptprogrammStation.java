package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class HauptprogrammStation {

	public static void main(String[] args) {

		Vector<Messstation> daten = new Vector<Messstation>();
		String[] result = null;
		int i = 0;

		try {
			String fileName = "PM10_2003.2 (1).txt";
			FileReader f = new FileReader(fileName);
			char[] c = new char[10000000];
			f.read(c);

			String s = new String(c);
			result = s.split(";|\n|\\.");

			for (i = 0; i < result.length - 1; i = i + 8) {

				Messstation tmp = new Messstation(result[i], result[i + 1], result[i + 2], result[i + 3],
						Integer.parseInt(result[i + 4]), Integer.parseInt(result[i + 5]),
						Integer.parseInt(result[i + 6]), Integer.parseInt(result[i + 7]));

				daten.add(tmp);

			}

			System.out.println("File " + fileName + " erfolgreich eingelesen");
			System.out.println(daten.size() + " Einträge generiert.");
			System.out.println();
			System.out.println("Durchschnitt aller Jahresmittelwerte: " + mittelWert(daten));
			System.out.println();
			Vector<Messstation> infoUeberWert = stationenWertUeber(daten);

			System.out.println("Stationen mit Jahresmittel über dem Grenzwert von 40 Mikrogramm pro Kubikmeter :");
			System.out.println("********************************************************************************");
			System.out.println("Anzahl: " + infoUeberWert.size() + ".\n");
			printInfo(infoUeberWert);
			System.out.println();
			System.out.println("********************************************************************************");
			System.out.println("Vollständiger Datensatz eines Eintrags : ");
			System.out.println();
			printEinEintrag(daten, 20);

		} catch (IOException e) {
			System.err.println("Fehler beim Einlese der Datei.");
			System.err.println(e.getMessage());
		}

	}

	public static double mittelWert(Vector<Messstation> info) {

		double wertTotal = 0;

		for (int i = 0; i < info.size(); i++) {

			Messstation tmp = (Messstation) info.get(i);
			wertTotal += tmp.getJahresmittelwert();

		}

		return wertTotal / info.size();
	}

	public static Vector<Messstation> stationenWertUeber(Vector<Messstation> info) {

		Vector<Messstation> infoUeberWert = new Vector<Messstation>();

		for (int i = 0; i < info.size(); i++) {

			Messstation tmp = (Messstation) info.get(i);

			if (tmp.getJahresmittelwert() > 40) {

				infoUeberWert.add(tmp);

			}
		}

		return infoUeberWert;

	}

	public static void printInfo(Vector<Messstation> info) {

		for (int i = 0; i < info.size(); i++) {

			Messstation tmp = (Messstation) info.get(i);
			System.out.println(tmp.getName() + " " + tmp.getUmgebungsquelltyp() + " " + tmp.getJahresmittelwert());
		}
	}

	public static void printEinEintrag(Vector<Messstation> info, int placeVector) {

		Messstation tmp = (Messstation) info.get(placeVector);
		System.out.println("ID :" + tmp.getId());
		System.out.println("Name : " + tmp.getName());
		System.out.println("Emissionsquelltyp" + tmp.getEmissionsquelltyp());
		System.out.println("Umgebungsquelltyp" + tmp.getUmgebungsquelltyp());
		System.out.println("Jahresmittelwert :" + tmp.getJahresmittelwert());
		System.out.println("Max. Tageswert :" + tmp.getMaxTageswert());
		System.out.println("Tage mit Tageswert > 50 μg/m3 : " + tmp.getTageswert50());
		System.out.println("Tage mit Tageswert > 60 μg/m3 : " + tmp.getTageswert60() + "\n");
	}

}
