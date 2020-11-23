package ch.trinat.edu.etutorial.p03.oo5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Person {

	private String name, vorname, strasse, wohnort;
	private int alter, hausnummer, plz;
	private GregorianCalendar geburtsdatum;

	public Person (String n, String v, String s, int h, int p, String w, GregorianCalendar g) {
		name = n;
		vorname = v;
		strasse = s;
		hausnummer = h;
		plz = p;
		wohnort = w;
		// alter = a;
		geburtsdatum = g;
	}
	
	// Name
	public void setName(String n) {
		name = n;
	
	} // Methode setName
	
	public String getName() {
		return (name);
	} // Methode getName
	
	// Vorname
	public void setVorname(String v) {
		vorname = v;
	} // Methode setVorname
	
	public String getVorname() {
		return (vorname);
	} // Methode getVorname
	
	// Strasse
	public void setStrasse(String s) {
		strasse = s;
	} // Methode setStrasse
	
	public String getStrasse() {
		return strasse;
	} // Methode getStrasse

	// Hausnummer
	public void setHausnummer(int h) {
		hausnummer = h;
	}
	
	public int getHausnummer() {
		return hausnummer;
	}
	
	// Postleitzahl
	public void setPlz(int p) {
		plz = p;
	}
	
	public int getPlz() {
		return plz;
	}	
	
	// Wohnort
	public void setWohnort(String w) {
		wohnort = w;
	}
	
	public String getWohnort() {
		return wohnort;
	}
	
	// Alter
	public void setAlter(int a) {
		alter = a;
	} // Methode setAlter
	
	public int getAlter() {
		return (alter);
	} // Methode getAlter
	
	public int alter() {
		GregorianCalendar heute = new GregorianCalendar();
		int age = heute.get(Calendar.YEAR) -  geburtsdatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR) < geburtsdatum.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		return (age);
	}
	
	// Ausgabe
	public void print() {
		SimpleDateFormat df = new SimpleDateFormat("dd. MMMMM yyyy");
		String gebDat = df.format(geburtsdatum.getTime());
		System.out.println(vorname + " " + name + "\n" + strasse + " "
							+ hausnummer + "\n" + plz + " " + wohnort +
							"\n" + gebDat + "\n" + alter() + " Jahre alt.\n");
	}	
	
} // class Person