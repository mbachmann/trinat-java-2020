package ch.trinat.edu.etutorial.p03.oo6.adressbuch;

public class Professor extends Person {
	
	@SuppressWarnings("unused")
	private String fach;
	public static final String [] anzeige = {" Name", " Vorname", " Strasse", " Hausnummer", " PLZ", " Ort", " Geburtsdatum (dd.mm.yyyy)", " Fach"};

	public Professor(String[] input, String fach) {
		super(input);
		this.fach = fach;
	}

}
