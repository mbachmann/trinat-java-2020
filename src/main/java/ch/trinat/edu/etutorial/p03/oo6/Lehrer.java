package ch.trinat.edu.etutorial.p03.oo6;

import java.util.GregorianCalendar;

public class Lehrer extends Person {
	protected static String fach;

	public static final String [] anzeige = { //pour afficher les catégories
			"Name" , "Vorname","Strasse","Hausnummer","PLZ",
			"Wohnort","Geburtsdatum (dd.mm.yyyy)","Fach"
	};



	public  Lehrer (String []input) {
		super(input);
		fach = input[7]; 
	}

	public static String print () {
		satz = satz +  "\nFach: " + fach;
		return satz;
	}




}
