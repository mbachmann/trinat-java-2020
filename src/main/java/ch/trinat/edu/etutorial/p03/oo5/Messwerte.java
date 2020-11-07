package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Messwerte {

	static int zeile;

	public static void main(String[] args) {
		int count = 0;
		int grenzwertzahl=0;
		Messstation[] information = new Messstation[376];
		try { FileReader f = new FileReader("PM10_2003.txt");
		char[] c = new char[25196];
		f.read(c);
		String s = new String(c);
		String[] result = s.split(";|\r\n|\n");

		for (int i=0;i<result.length-1; i=i+8) {
			Messstation data = new Messstation(result[i],result[i+1],result[i+2],result[i+3], Integer.parseInt(result[i+4]),
					Integer.parseInt(result[i+5]),Integer.parseInt(result[i+6]),Integer.parseInt(result[i+7]));
			information[count++] = data;
			if (Integer.parseInt(result[i+4]) > 40) {grenzwertzahl++;}
		}

		f.close();
		}catch (IOException e){
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}
		System.out.println( count + " Einträge generiert");
		for(int i =0; i< count ; i++) {
			information[i].Durchschnitt();

		}
		Messstation.durchschnitt= Messstation.durchschnitt/count;
		System.out.println("Durchschnitt aller Jahresmittelwerte: "+Messstation.durchschnitt+"\n");
		System.out.println("Stationen mit jahresmittel über dem Grenzwert von 40 Mikrogramm pro Kubikmeter");
		System.out.println("******************************************************************************");
		System.out.println("Anzahl: "+ grenzwertzahl+"\n");
		for(int i =0; i< count ; i++) {
			information[i].Grenzwert();
		}

		System.out.println("Wollen sie ein beliebigen Datensatz audrucken? falls ja die zeile eingeben, falls nein ein buchstabe tippen");

		try(Scanner eingabe = new Scanner(System.in)){
			zeile= eingabe.nextInt();
			information[zeile-1].Print();
		}catch(Exception e){
			System.err.println("Sie sind aus den Programm raus");

		}



	}
}

