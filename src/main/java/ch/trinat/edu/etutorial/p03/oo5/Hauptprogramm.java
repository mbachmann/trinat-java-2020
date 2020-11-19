package ch.trinat.edu.etutorial.p03.oo5;

import java.util.GregorianCalendar;
import java.io.FileReader;
import java.io.IOException;

public class Hauptprogramm {

	public static void main(String[] args) {

		try {

			Person [] adressbuch = new Person [30];
			int count = 0;
			FileReader f = new FileReader("src/main/java/ch/trinat/edu/etutorial/p03/oo5/personen.txt");
			char [] c = new char [1300];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\\.|\n");

			for( int i = 0; i < result.length - 1; i = i + 9) {
				GregorianCalendar tempDate = new GregorianCalendar(Integer.parseInt(result[i + 8]),
						Integer.parseInt(result[i + 7]) - 1,Integer.parseInt(result[i + 6]));
				Person temp = new Person(result[i], result[i + 1], result[i + 2], Integer.parseInt(result[i + 3]),
						Integer.parseInt(result[i + 4]), result[i + 5], tempDate);

				adressbuch[count++] = temp;


			}

			for (int i = 0; i < count; i++) {
				adressbuch[i].print();
			}

			f.close();

		}catch(IOException e) {
			System.err.println("Fehler beim einlesen der Datei");
			System.err.println(e.getMessage());
		}



		/*GregorianCalendar datum1= new GregorianCalendar(1976,Calendar.APRIL,26);
		GregorianCalendar datum2= new GregorianCalendar(2001,11,04);//11=Dezember

		Person anna = new Person("Allan","Anna","Universitätstrasse","Zuerich",6,8006,datum1);
		Person berta = new Person("Bogart", "Berta","Hauptstrasse","Basel",19,1001,datum2);
		Person carl = new Person("Ba","Carl", 25);

		adressbuch[count++]=anna;
		adressbuch[count++]=berta;
		adressbuch[count++]=carl;
		 */

	}

}
