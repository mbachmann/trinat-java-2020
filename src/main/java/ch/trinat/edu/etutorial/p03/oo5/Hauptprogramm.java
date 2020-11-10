package ch.trinat.edu.etutorial.p03.oo5;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Hauptprogramm {



	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		Vector <Messstation> info = new Vector <Messstation>();
		Vector <Messstation> groesser = new Vector <Messstation>();
		Vector <String> nummer = new Vector <String>();
		int summe = 0;
		int count = 0;
		int count2 = 0;
		double average = 0;
		String file = "src/main/java/ch/trinat/edu/etutorial/p03/oo5/PM10_2003.txt";
		String micro = " \u00B5m";

		System.out.print("Welche Station m�chten sie anzeigen ? (1 bis 376): ");
		int zahl= eingabe.nextInt();

		if (zahl <= 376 && zahl >= 1) {

			try {
				FileReader f = new FileReader(file);
				char [] array  = new char [10000000];
				f.read(array);
				String s = new String (array);
				String [] result = s.split(";|\n");


				for (int x = 0; x < result.length - 1; x = x + 8) {

					Messstation temp = new Messstation (result[x], result[x+1], result[x+2], result[x+3], 
							Integer.parseInt(result[x+4]),
							Integer.parseInt(result[x+5]), 
							Integer.parseInt(result[x+6]),
							Integer.parseInt(result[x+7]));

					summe = summe + Integer.parseInt(result[x+4]);
					count ++;
					average = Math.round(( (double) summe / count) * 10) / 10.0;
					info.add(temp);

					if (Integer.parseInt(result[x+4]) > 40) {
						groesser.add(temp);
						nummer.add(result[x+4]);
						count2++;
					}

				}



				System.out.println("File: " + file + " erfolgreich eingelsen");
				System.out.println(count + " Eintr�ge generiert\n\n");
				System.out.println("Durchnitt aller Jahresmittelwerte: " + average + micro);

				System.out.println("Stationen mit Jahresmittel �ber dem Grenzwert von 40 Mikrogramm pro Kubikmeter:");
				System.out.println("*******************************************************************************");
				System.out.println("Anzahl: " + count2 + "\n");
				for (int x = 0; x < groesser.size(); x++) {
					System.out.print(groesser.get(x).print2().toString().replaceAll("ä","�").replaceAll("ü", "�").replaceAll("ß", "�").replaceAll("ö", "�") + " " + nummer.get(x));
					System.out.println();

				}
				System.out.println("\n\n*******************************************************************************");
				System.out.println("Ihre ausgew�hlte Station: \n");
				String replace1 = info.get(zahl-1).print().toString().replaceAll("ä","�").replaceAll("ü", "�").replaceAll("ß", "�").replaceAll("ö", "�");    
				System.out.println(replace1);

			} catch ( IOException e ) {
				System.err.println ("Fehler beim Einlesen der Datei");
				System.err.println (e.getMessage());

			}

		}  else {
			System.out.print("Es wurde eine Zahl zwischen 1 und 376 erwartet");

			eingabe.close();

		}

	}

}
