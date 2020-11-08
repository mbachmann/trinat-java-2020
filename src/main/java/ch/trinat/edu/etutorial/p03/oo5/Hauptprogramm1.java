package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public class Hauptprogramm1 {
	static int count = 0;
	static int zahl=0;
	static double durchschnitt = 0;
	static Messstation [] station = new Messstation [377];
	public static void main(String[] args) {




		try {
			FileReader f = new FileReader("C:\\Users\\lucas\\Documents\\java\\Workspace\\trinat-java-2020\\src\\main\\java\\ch\\trinat\\edu\\etutorial\\p03\\oo5\\PM10_2003.txt");
			char[] c= new char[25196];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n");
			for(int i=0; i<result.length-1;i=i+8) {
				Messstation temp = new Messstation(result[i],result[i+1],result[i+2],result[i+3],Integer.parseInt(result[i+4]),Integer.parseInt(result[i+5]),Integer.parseInt(result[i+6]),Integer.parseInt(result[i+7]));
				station[count++]=temp;
				f.close();
			}


		}catch(IOException e) {
			System.err.println("Fehler beim einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		Rechnung();


		System.out.println("Welche Station wollen sie sehen? Geben sie den ID an");
		Scanner eingabe = new Scanner(System.in);
		String a = eingabe.next();
		for (int p = 0 ; p < count; p++) {	
			String b=station[p].getId();
			if(a.equals (b)) {
				station[p].print();
			}




		}


		Ausgeben();	

	}

	public static void Ausgeben() {
		System.out.println(count + " Einträge generiert.\n\n" + "Durchschnitt aller Jahresmittelwert: " + durchschnitt/count + "\n");
		System.out.println("Stationen mit Jahresmittel über dem Grenzwerte von 40 Mikrogramm pro Kubimeter:");
		for (int j=0; j<80; j++) {
			System.out.print('*');
		}
		System.out.println("\nAnzahl: " + zahl + "\n");

		for(int i=0; i<count ;i++) {
			if (station[i].getJahresmittelwert()>40) {
				station[i].print();
			}
		}
	}

	public static void Rechnung() {	
		for(int i=0; i<count ;i++) {
			durchschnitt = durchschnitt + station[i].getJahresmittelwert();
			if (station[i].getJahresmittelwert()>40) {

				zahl++;	
			}
		}

	}
}



