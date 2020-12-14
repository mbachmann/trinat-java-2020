package ch.trinat.edu.etutorial.p03.oo5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

	protected String name, vorname, strasse, wohnort;
	protected int hausNummer, plz;
	protected GregorianCalendar geburtsDatum;

	// param Kontruktor
	public Person(String name, String vorname, GregorianCalendar geburtsDatum, String strasse, int hausNummer, int plz,
			String wohnort) {
		this.name = name;
		this.vorname = vorname;
		this.geburtsDatum = geburtsDatum;
		this.strasse = strasse;
		this.hausNummer = hausNummer;
		this.plz = plz;
		this.wohnort = wohnort;
	}

	// output methode print
	public void print() {
		SimpleDateFormat datumFormat = new SimpleDateFormat("dd. MMMMM yyyy");
		String gebDatum = datumFormat.format(geburtsDatum.getTime());
		System.out.println(name + " " + vorname + "\n" + gebDatum + " - " + alter() + " Jahre alt" + "\n" + strasse
				+ " " + hausNummer + "\n" + plz + " " + wohnort + "\n");
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
