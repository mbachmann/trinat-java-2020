package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	// String Array - für die Felder im Fenster
	public static final String[] anzeige = { "Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Ort",
			"Geburtsdatum (dd.mm.yyyy)", "Gewicht" };
	protected String name, vorname, strasse, wohnort, typ;
	protected int hausNummer, plz, gewicht;
	protected GregorianCalendar geburtsDatum;

	// Konstruktor: nimmt die Felder vom String Array
	public Person(String[] input) {
		this.name = input[0];
		this.vorname = input[1];
		this.strasse = input[2];
		this.hausNummer = Integer.parseInt(input[3]);
		this.plz = Integer.parseInt(input[4]);
		this.wohnort = input[5];
		String[] gd = input[6].split("\\.");
		this.geburtsDatum = new GregorianCalendar(Integer.parseInt(gd[2]), Integer.parseInt(gd[1]) - 1,
				Integer.parseInt(gd[0]));
		this.gewicht = Integer.parseInt(input[7]);
	}

	// methode print - String Methode fürs Programm statt in Konsole schreiben
	public String print() {
		SimpleDateFormat datumFormat = new SimpleDateFormat("dd. MMMMM yyyy");
		String gebDatum = datumFormat.format(geburtsDatum.getTime());
		return (name + " " + vorname + " - " + typ + " - " + gewicht + " kg \n" + gebDatum + " - " + alter()
				+ " Jahre alt" + "\n" + strasse + " " + hausNummer + "\n" + plz + " " + wohnort + "\n\n");
	}

	public int alter() {
		GregorianCalendar heute = new GregorianCalendar();
		int alter = heute.get(Calendar.YEAR) - geburtsDatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR) < geburtsDatum.get(Calendar.DAY_OF_YEAR)) {
			alter--;
		}
		return alter;
	}

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getWohnort() {
		return wohnort;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	public int getHausNummer() {
		return hausNummer;
	}

	public void setHausNummer(int hausNummer) {
		this.hausNummer = hausNummer;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}
}
