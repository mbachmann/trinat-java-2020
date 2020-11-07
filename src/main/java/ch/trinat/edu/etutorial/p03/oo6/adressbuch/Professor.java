package ch.trinat.edu.etutorial.p03.oo6.adressbuch;

public class Professor extends Person {
	
	private String fach;
	public static final String [] anzeige = {" Name", " Vorname", " Strasse", " Hausnummer", " PLZ", " Ort", " Geburtsdatum (dd.mm.yyyy)", " Fach"};

	public Professor(String[] input, String fach) {
		super(input);
		this.fach = fach;
	}

}
