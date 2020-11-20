package ch.trinat.edu.etutorial.p03.oo5.selbststaendig;

import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class Hauptprogramm {

	public static void main(String[] args) {

		Vector<Messstationen> hauptprogramm = new Vector<Messstationen>();
		int count = 0;
		try (FileReader f = new FileReader("src/main/java/ch/trinat/edu/etutorial/p03/oo5/selbststaendig/PM10_2003.txt");){

			char[] c = new char[1000000];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\\n|\\r");

			double durchschnittJahresmittelwerte = 0;
			for(int i = 0; i < result.length - 1; i = i + 8) {
				Messstationen werte = new Messstationen(result[i], result[i + 1], result[i + 2], result[i + 3],
						Integer.parseInt(result[i + 4]), Integer.parseInt(result[i + 5]), Integer.parseInt(result[i + 6]), Integer.parseInt(result[i + 7]));

				hauptprogramm.add(werte);
				durchschnittJahresmittelwerte += ((Messstationen)hauptprogramm.elementAt(count++)).getJahresmittelwert();
			}

			durchschnittJahresmittelwerte /= count;
			System.out.println("File \"PM10_2003.txt\" erfolgreich eingelesen.");
			System.out.println(count + " Einträge generiert.\n");
			System.out.println("Durchschnitt aller Jahresmittelwerte: " + durchschnittJahresmittelwerte + "\n");
			System.out.println("Stationen mit Jahresmittel über dem Grenzwert von 40 Migrogramm pro Kubikmeter:");
			System.out.println("*******************************************************************************");
			
			int anzahl = 0;
			
			for(int i = 0; i < count; i++) {
				if(((Messstationen)hauptprogramm.elementAt(i)).getJahresmittelwert() >= 40) {
					anzahl = i + 1;
				}
			}
			
			System.out.println("Anzahl: " + anzahl + "\n");

			for(int i = 0; i < count; i++) {
				if(((Messstationen)hauptprogramm.elementAt(i)).getJahresmittelwert() >= 40) {
					((Messstationen)hauptprogramm.elementAt(i)).print();
				}
			}
			
			System.out.println("Datensatz einer bestimmten Wetterstation ausgeben? Bitte ID der Messstation angeben.");
			Scanner sc = new Scanner(System.in);
			String idDatensatz = sc.nextLine();
			sc.close();

			for(int i = 0; i < count; i++) {
				if(((Messstationen)hauptprogramm.elementAt(i)).getId().equals(idDatensatz)) {
					System.out.println();
					((Messstationen)hauptprogramm.elementAt(i)).print();
				}
			}

		}

		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

	}

}
