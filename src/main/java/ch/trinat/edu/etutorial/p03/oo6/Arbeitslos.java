package ch.trinat.edu.etutorial.p03.oo6;
import java.util.GregorianCalendar;

public class Arbeitslos extends Person {



	public Arbeitslos(String[] input) {
		super(input);
		this.suchtJob = Boolean.parseBoolean(input[7]);
		this.beziehtHilfe = Boolean.parseBoolean(input[8]);
	}

	private boolean suchtJob;
	private boolean beziehtHilfe;
	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "plz", "Wohnort", "Geburtsdatum","bezieht hilfe", "sucht Job"};
	
	public void aufgabe() {
		System.out.println("Ich mache nichts!");
	}

public String toString() {
		
		String superString = super.toString()+ ", Auf Jobsuche=" + suchtJob + ", Bezieht Hilfe="+ beziehtHilfe ;
		return superString;
	}
	
	
}
