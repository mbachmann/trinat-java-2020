package ch.trinat.edu.etutorial.p03.oo6;

import java.util.GregorianCalendar;

public class Student extends Person {
	protected static String studiengang;

	public static final String [] anzeige = { //pour afficher les catégories
			"Name" , "Vorname","Strasse","Hausnummer","PLZ",
			"Wohnort","Geburtsdatum (dd.mm.yyyy)","Studiengang"
	};


	public Student (String []input ) {  //Konstruktor Person 

		super(input);
		studiengang = input[6];
	}

	public static String print () {
		satz = satz +  "\nStudiengang: " + studiengang;
		return satz;
	}

}
