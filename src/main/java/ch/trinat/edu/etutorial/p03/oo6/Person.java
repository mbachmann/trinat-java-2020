package ch.trinat.edu.etutorial.p03.oo6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person extends Adressbuch{
	static String satz = "";
	static String name,vorname, strasse, wohnort;
	static int hausnummer, plz;
	static GregorianCalendar geburtsdatum;



	public static final String [] anzeige = { //pour afficher les catégories
			"Name" , "Vorname","Strasse","Hausnummer","PLZ",
			"Wohnort","Geburtsdatum (dd.mm.yyyy)"	
	};

	public  Person (String []input ) {  //Konstruktor Person 

		name = input[0];
		vorname = input[1];
		strasse = input[2];
		hausnummer = Integer.parseInt(input[3]);
		plz = Integer.parseInt(input[4]);
		wohnort = input[5];
		String[] gd = input[6].split("\\.");
		geburtsdatum = new GregorianCalendar(Integer.parseInt(gd[2]),Integer.parseInt(gd[1])-1,Integer.parseInt(gd[0]));

	}


	public static String print () {
		SimpleDateFormat date= new SimpleDateFormat("dd.MM.yyyy");
		String gebDat = date.format(geburtsdatum.getTime());
		satz ="Name: " + name + "\nVorname: " +vorname + "\nStrasse: " + strasse + "\nHausnummer: " + hausnummer + "\nPlz: " 
				+ plz + "\nWonort: " + wohnort + "\nGeburtsdatum: " + gebDat;

		return satz;


	}



}	




