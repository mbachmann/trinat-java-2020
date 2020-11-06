package Adressbuch;

import java.util.GregorianCalendar;

public class Kind extends Person {
	
	private String schule;
	private int klasse;
	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Wohnort", "Geburtsdatum", "Schule", "Klasse"};

	public Kind (String[] in) {
		super(in);
		this.schule = in[7];
		this.klasse = Integer.parseInt(in[8]);
	}

	public void arbeiten() {
		System.out.println("Ich arbeite zu Zeit in der " + schule);
	}
	public String toString() {
		String superString = super.printInfo() + "\n" + "Schule: " + schule + "\n" + "Klasse: " + klasse;
		return superString;
	}
}