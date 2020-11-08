package ch.trinat.edu.etutorial.p03.oo6;

public class Lehrer extends Person {

	protected static String fach;
	
	public static final String[] anzeige= {
			"Name" , "Vorname", "Strasse" , "Hausnummer" , "PLZ" ,
			"Wohnort" , "Geburtsdatum(dd.mm.yyyy)" ,"Fach"
	};
	public Lehrer(String[]input) {
		super(input);
		fach=input[6];
	}
	public static String print() {
		satz= satz + "\nFach! " + fach;
		return satz;
		}
}

