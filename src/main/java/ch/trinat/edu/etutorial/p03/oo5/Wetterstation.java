package ch.trinat.edu.etutorial.p03.oo5;

import java.io.*;
import java.util.*;

public class Wetterstation {

	public static void main(String[] args) {
		Vector<Messwerte> wetterstation = new Vector<Messwerte>();
		int count = 0;
		try (FileReader f = new FileReader("src/main/java/ch/trinat/edu/etutorial/p03/oo5/messwerte2.txt")){

			char[] c = new char[10000000];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n");
			
			double durchschnittJahresmittelwerte = 0;
			for(int i = 0; i < result.length - 1; i = i + 8) {
				Messwerte werte = new Messwerte(result[i], result[i + 1], result[i + 2], result[i + 3],
						Integer.parseInt(result[i + 4]), Integer.parseInt(result[i + 5]), Integer.parseInt(result[i + 6]), Integer.parseInt(result[i + 7]));

				wetterstation.add(werte);
				durchschnittJahresmittelwerte += ((Messwerte)wetterstation.elementAt(count++)).getJahresmittelwert();
			}
			
			durchschnittJahresmittelwerte /= count;
			System.out.println("File mit Messwerten erfolgreich eingelesen.");
			System.out.println(count + " Einträge generiert.");
			System.out.println("\nDurchschnitt aller Jahresmittelwerte: " + durchschnittJahresmittelwerte);
			System.out.println("\nDaten aller Wetterstationen mit einem Jahresmittelwert über dem Grenzwert von 40 \u03BCg/m3:\n");
			
			for(int i = 0; i < count; i++) {
				if(((Messwerte)wetterstation.elementAt(i)).getJahresmittelwert() >= 40) {
					((Messwerte)wetterstation.elementAt(i)).print();
				}
			}
			
			System.out.println("Möchten Sie den Datensatz einer bestimmten Wetterstation ausgeben? Dann geben Sie bitte die ID der Messstation ein.");
			Scanner sc = new Scanner(System.in);
			String idDatensatz = sc.nextLine();
			sc.close();
			
			for(int i = 0; i < count; i++) {
				if(((Messwerte)wetterstation.elementAt(i)).getId().equals(idDatensatz)) {
					System.out.println();
					((Messwerte)wetterstation.elementAt(i)).print();
				}
			}
			
		} catch(IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

	}

}

