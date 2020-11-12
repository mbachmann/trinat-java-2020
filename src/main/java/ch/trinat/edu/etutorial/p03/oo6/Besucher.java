package ch.trinat.edu.etutorial.p03.oo6;

public class Besucher extends Person {
	String anlass;
	int dauer;

	public Besucher(String[] anzeige) {
		super(anzeige);
		anlass = anzeige[7];
		dauer = Integer.parseInt(anzeige[8]);
	}
	
	public static final String [] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Ort", "Geburtsdatum (dd.mm.yyyy)", "Besuchsanlass", "Besuchsdauer"};
	
	public String infoBesucher() {
		return "Besuchsanlass: " + anlass + "\nBleibt für " + dauer + " Stunden.\n";
	}

}
