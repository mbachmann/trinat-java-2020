package ch.trinat.edu.etutorial.p02.ex02;
import java.util.GregorianCalendar;
import java.io.*;


public class Hauptprogramm {


	static Person [] adressbuch = new Person[30];
	static int count = 0;

	public static void main(String[] args) {

		/*		GregorianCalendar datum1 = new GregorianCalendar (1997, GregorianCalendar.DECEMBER, 28);
		GregorianCalendar datum2 = new GregorianCalendar(2005, GregorianCalendar.OCTOBER, 17);
		GregorianCalendar datum3 = new GregorianCalendar(1993, GregorianCalendar.AUGUST, 13);
		Person anna = new Person("Allan", "Anna", "Zuerich", "Unistrasse", datum1, 8006, 56);
		Person berta = new Person("Bogart", "Berta", "Strasbourg", "Rue des maraichers", datum2, 67000, 23);
		Person carl = new Person("Marx", "Carl", "Colmar", "Champ de mars", datum3, 68000, 12);



		adressbuch[count++]=anna;
		adressbuch[count++]=berta;
		adressbuch[count++]=carl;


		 */

		try (FileReader f = new FileReader("C:\\Users\\micas\\Documents\\Cours\\Java\\eclipse\\Workspace\\trinat-java-2020\\src\\main\\java\\ch\\trinat\\edu\\etutorial\\p02\\ex02\\personen.txt")){
			char c[] = new char[1300];
			f.read(c);
			String s = new String(c);
			String[] result = s.split(";|\r|\r\n|\n|\\.");

			for (int i = 0; i < result.length-1; i=i+10){
				GregorianCalendar tempDate = new GregorianCalendar(Integer.parseInt(result[i+8]), 
						Integer.parseInt(result[i+7])-1, Integer.parseInt(result[i+6]));
				Person temp = new Person(result[i], result[i+1], result[i+5], result[i+2], 
						tempDate, Integer.parseInt(result[i+4]), Integer.parseInt(result[i+3]));
				adressbuch[count++] = temp;
			}
		}
		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		for (int i = 0; i<count; i++) {
			adressbuch[i].print();
		}

	}


}




