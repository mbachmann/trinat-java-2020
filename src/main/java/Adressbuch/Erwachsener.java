package Adressbuch;

import java.util.GregorianCalendar;

public class Erwachsener extends Person {

	private String arbeit;
	private int lohn;
	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Wohnort", "Geburtsdatum", "Arbeit", "Lohn"};

	public Erwachsener(String[] in) {
		super(in);
		this.arbeit = in[7];
		this.lohn = Integer.parseInt(in[8]);
	}

	public void arbeiten() {
		System.out.println("Ich arbeite zu Zeit in der " + arbeit);
	}
	public String toString() {
		String superString = super.printInfo() + "\n" + "Arbeit: " + arbeit + "\n" + "Lohn: " + lohn;
		return superString;
	}
}
