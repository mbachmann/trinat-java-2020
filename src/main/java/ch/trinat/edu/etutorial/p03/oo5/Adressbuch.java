package ch.trinat.edu.etutorial.p03.oo5;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
*
* @author Cornelia Oberholzer, WI2a
* 
* Adressbuch
* 
*
*/

public class Adressbuch {

	public static void main(String[] args) {
		
		Person[] adressbuch = new Person[30];
		int count = 0;
		
		try (FileReader f = new FileReader("src/tutorial5oo/personen.txt");) {		
			
			char[] c = new char[1300];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\r\n|\n|\\.");
			
			for (int i = 0; i < result.length-1; i=i+9) {
				GregorianCalendar tmpDate = new GregorianCalendar(Integer.parseInt(result[i+8]), 
																  Integer.parseInt(result[i+7])-1,
																  Integer.parseInt(result[i+6]));
				
				String city = result[i+5];
				int zipCode = Integer.parseInt(result[i+4]);
				
				
				Person tmpPers = new Person(result[i], result[i+1], tmpDate, result[i+2], result[i+3], city, zipCode);
				adressbuch[count++] = tmpPers;
			}
		}
		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei");
			System.err.println(e.getMessage());
		}
		
		

		for (int i = 0; i < count; i++) {
			adressbuch[i].print();
		}
	}
	
	/**
	 * Test entries for adressbuch
	 * @param adressbuch
	 * @param count
	 */
	void addToAddressbuch(Person[] adressbuch, Integer count) {

		GregorianCalendar gc;
		
		gc = new GregorianCalendar(1975, Calendar.NOVEMBER, 3);
		Person anna = new Person("Allan", "Anna", gc, "Anna-Str", "1a", "Zürich", 8000);

		gc = new GregorianCalendar(1985, Calendar.JULY, 7);
		Person bettina = new Person("Spadin", "Bettina", gc, "Bettina-Str", "2b", "Zürich", 8000);

		gc = new GregorianCalendar(1976, Calendar.DECEMBER, 12);
		Person cynthia = new Person("Baur", "Cynthia", gc, "Cynthia-Str", "3c", "Zürich", 8000);

		gc = new GregorianCalendar(1984, Calendar.MARCH, 10);
		Person patrick = new Person("Som", "Patrick", gc, "Püde-Str", "4d", "Zürich", 8000);

		gc = new GregorianCalendar(1985, Calendar.AUGUST, 11);
		Person manuel = new Person("Müller", "Manuel", gc, "Manu-Str", "5e", "Zürich", 8000);

		gc = new GregorianCalendar(1981, Calendar.JULY, 8);
		Person seda = new Person("Demirtas", "Seda", gc, "Seda-Str", "6f", "Zürich", 8000);

		adressbuch[count++] = anna;
		adressbuch[count++] = bettina;
		adressbuch[count++] = cynthia;
		adressbuch[count++] = patrick;
		adressbuch[count++] = manuel;
		adressbuch[count++] = seda;

	
	}
	
	
}
