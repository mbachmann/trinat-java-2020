package ch.trinat.edu.etutorial.p03.oo6;
import java.util.GregorianCalendar;

public class Arbeiter extends Person {



	public Arbeiter(String[] input) {
		super(input);
		this.einkommen = Integer.parseInt(input[7]);
		this.arbeit = input[8];
		this.monate = Integer.parseInt(input[9]);
	}

	private int einkommen;
	private String arbeit;
	private int monate;
	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "plz", "Wohnort", "Geburtsdatum", "einkommen", "Arbeit", "Monate"};
	
	public int getEinkommen() {
		return einkommen;
	}

	
	public void aufgabe() {
		System.out.println("Ich arbeite!");
	}
	
public String toString() {
		
		String superString = super.toString()+ ", Einkommen=" + einkommen + ", Arbeit="+ arbeit + ", Monate="+ monate;
		return superString;
	}
	
	
}
