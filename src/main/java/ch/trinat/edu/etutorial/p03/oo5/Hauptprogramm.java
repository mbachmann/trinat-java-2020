package ch.trinat.edu.etutorial.p03.oo5;

import java.util.*; 
import java.io.*;

public class Hauptprogramm {


	public static void main(String[] args) {

		int count = 0;
		Person [] adressbuch= new Person [30];

		try {
			FileReader f = new FileReader("C:\\Users\\lucas\\Documents\\java\\Workspace\\trinat-java-2020\\src\\main\\java\\ch\\trinat\\edu\\etutorial\\p03\\oo5\\personen.txt");
			char[] c= new char[1300];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n|\\.");

			for(int i=0; i<result.length-1;i=i+9) {
				GregorianCalendar tempDate = new GregorianCalendar(Integer.parseInt(result[i+8]),
						Integer.parseInt(result[i+7]),Integer.parseInt(result[i+6]));
				Person temp = new Person(result[i],result[i+1],result[i+2],Integer.parseInt(result[i+3]),Integer.parseInt(result[i+4]),result[i+5],tempDate);
				adressbuch[count++]=temp;
			}
			f.close();

		}catch(IOException e) {
			System.err.println("Fehler beim einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		for(int i=0; i<count ;i++) {
			adressbuch[i].print();
		}

	}

}


