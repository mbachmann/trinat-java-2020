package ch.trinat.edu.etutorial.p03.oo6;

public class Studenten extends Person {

	String studiengang;
	int semester;
	
	public Studenten(String[] anzeige) {
		super(anzeige);
		studiengang = anzeige[7];
		semester = Integer.parseInt(anzeige[8]);
	}
	
	public static final String [] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Ort", "Geburtsdatum (dd.mm.yyyy)", "Studiengang", "Semester"};

	public String infoStudent() {
		return "Studiert im Studiengang " + studiengang + " im " + semester + ". Semester.\n";
	}

}
