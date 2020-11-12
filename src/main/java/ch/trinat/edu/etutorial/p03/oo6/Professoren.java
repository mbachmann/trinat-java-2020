package ch.trinat.edu.etutorial.p03.oo6;

public class Professoren extends Person {
	String fach;

	public Professoren(String[] anzeige) {
		super(anzeige);
		fach = anzeige[7];
	}
	
	public static final String [] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Ort", "Geburtsdatum (dd.mm.yyyy)", "Fach"};
	
	public String infoProfessor() {
		return "Unterrichtet das Fach " + fach +"\n";
	}

}
