package ch.trinat.edu.etutorial.p03.oo5;
import java.util.*;
import java.io.*;
public class Hauptprogramm {

	public static void main(String[] args) {



		int count = 0;
		Person[] adressbuch= new Person[30];

		try { FileReader f = new FileReader("src/main/java/ch/trinat/edu/etutorial/p03/005/personen.txt");
		char[] c = new char[1300];
		f.read(c);
		String s = new String(c);
		String[] result = s.split(";|\r\n|\n|\\.");
		for (int i=0;i<result.length-1; i=i+9) {
			GregorianCalendar tempdate = new GregorianCalendar (Integer.parseInt(result[i+8]),
					Integer.parseInt(result[i+7])-1,Integer.parseInt(result[i+6]));
			Person temp= new Person(result[i],result[i+1],result[i+2], Integer.parseInt(result[i+3]),
					Integer.parseInt(result[i+4]),result[i+5],tempdate);
			adressbuch[count++] = temp;
			f.close();}

		}catch (IOException e){
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}

		for(int i =0; i< count ; i++)
			adressbuch[i].print();


		/*

		GregorianCalendar datum1 = new GregorianCalendar(1996,Calendar.JUNE,24);
		GregorianCalendar datum2 = new GregorianCalendar(1900,Calendar.MAY,7);
		GregorianCalendar datum3 = new GregorianCalendar(2002,Calendar.JANUARY,8);
		Person anna = new Person ("Allan" , "Anna" , "HauptStrasse", 23 , 54002, "Oetikon", datum1);
		Person berta = new Person ("Bogart" , "Berta" ,"Universitätsstrasse" , 6 , 8006, "Zuerich" , datum2);
		Person carl = new Person("Chaplin" , "Carl" , "Bahnofstrasse", 45 , 4705 , "Nyon",datum3);

		adressbuch[count++] = anna ;
		adressbuch[count++] = berta ;
		adressbuch[count++] = carl ;*/




	}

}
