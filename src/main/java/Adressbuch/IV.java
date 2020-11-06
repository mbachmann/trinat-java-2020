package Adressbuch;

import java.util.GregorianCalendar;

public class IV extends Person {
	
	private String beschaeftigung;
	private int ausgaben;
	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Wohnort", "Geburtsdatum", "Beschäftigung", "Ausgaben pro Tag"};

	public IV (String[] in) {
		super(in);
		this.beschaeftigung = in[7];
		this.ausgaben = Integer.parseInt(in[8]);
	}

	public void arbeiten() {
		System.out.println("Ich arbeite zu Zeit in der " + beschaeftigung);
	}
	public String toString() {
		String superString = super.printInfo() + "\n" + "Beschäftigung: " + beschaeftigung + "\n" + "Ausgaben pro Tag: " + ausgaben;
		return superString;
	}
}