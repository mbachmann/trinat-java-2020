package ch.trinat.edu.etutorial.p03.oo6;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Schueler extends Person{


	
	
	

	public Schueler(String[] input) {
		super(input);
		this.Semester = Integer.parseInt(input[7]);
		this.branche = input[8];
	}

	private int Semester;
	private String branche;
	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "plz", "Wohnort", "Geburtsdatum", "Semester", "Branche"};
	
	public void aufgabe() {
		System.out.println("Ich lerne!");
	}

	public String toString() {
		
		String superString = super.toString()+ ", Semester=" + Semester + ", Branche="+ branche;
		return superString;
	}

	
	
	
}
