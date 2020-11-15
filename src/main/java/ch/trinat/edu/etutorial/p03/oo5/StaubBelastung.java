package ch.trinat.edu.etutorial.p03.oo5;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class StaubBelastung {

	public static void main(String[] args) {

		// Filereader im try Kopf drin => braucht kein close();
		try (FileReader f = new FileReader("src/PM10_2003_UTF8.txt");) {
			char c[] = new char[100000000];
			f.read(c);
			String s = new String(c);
			String result[] = s.split(";|\n");
			Vector<Messstation> staubDaten = new Vector<Messstation>();
			for (int i = 0; i < result.length; i = i + 8) {
				Messstation tempStation = new Messstation(result[i], result[i + 1], result[i + 2], result[i + 3],
						Double.parseDouble(result[i + 4]), Double.parseDouble(result[i + 5]),
						Double.parseDouble(result[i + 6]), Double.parseDouble(result[i + 7]));
				staubDaten.add(tempStation);
			}

			// Aufruf Methode Jahresmittelwerte mit Argumente
			System.out.println("Durchschnitt der Jahresmittelwerte: " + durchschnittJahresMittelwerte(staubDaten)
					+ " \u03BCg/Jahr\n");

			// Aufruf print Methode mit index als Argument
			print(staubDaten, 1);

			// Aufruf print über wert(40) Methode
			printJahresWerteUeberX(staubDaten, 40);

		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}
	}

	// print Methode - Vektor und index als Argumente
	static void print(Vector<Messstation> staubDaten, int index) {
		Messstation tempStation = staubDaten.get(index);
		System.out.println("ID: " + tempStation.getId() + " / Name: " + tempStation.getName() + "\nQuelltyp: "
				+ tempStation.getQuellTyp() + "\nUmgebungstyp: " + tempStation.getUmgebungsTyp()
				+ "\nJahresmittelwert: " + tempStation.getJahresMittelwert() + "\nMaximales Tageswert: "
				+ tempStation.getMaxTageswert() + "\n# Tage mit Werte über 50\u03BCg: " + tempStation.getAnzTUeber50()
				+ "\n# Tage mit Werte über 60\u03BCg: " + tempStation.getAnzTUeber60());
	}

	// Durchschnittmethode - temp Objekt - Daten raus - Durchschnitt
	static double durchschnittJahresMittelwerte(Vector<Messstation> staubDaten) {
		double durchschnitt = 0;
		for (int i = 0; i < staubDaten.size(); i++) {
			Messstation tempStation = staubDaten.get(i);
			durchschnitt += tempStation.getJahresMittelwert();
		}
		durchschnitt /= staubDaten.size();
		return Math.round(durchschnitt * 100.0) / 100.0;
	}

	// print (Jahresmittelwerte > Argumentenwert) - trim() wegen Whitespaces
	static void printJahresWerteUeberX(Vector<Messstation> staubDaten, int wert) {
		System.out.println("\n --- Stationen mit durchschnittlich über " + wert + " Mikrogramm pro Jahr: ---\n");
		for (int i = 0; i < staubDaten.size(); i++) {
			Messstation tempStation = staubDaten.get(i);
			if (tempStation.getJahresMittelwert() > wert) {
				System.out.println("Station " + tempStation.getName().trim() + ": " + tempStation.getJahresMittelwert()
						+ " \u03BCg/Jahr");
			}
		}
	}

}
