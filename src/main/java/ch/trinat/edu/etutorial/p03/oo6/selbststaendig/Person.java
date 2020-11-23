package ch.trinat.edu.etutorial.p03.oo6.selbststaendig;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Person {
	
	public static final String[] anzeige = { "Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Ort", "Geburtsdatum (dd.mm.yyyy)" };
	private String name, vorname, strasse, wohnort;
	private int alter, hausnummer, plz;
	private GregorianCalendar geburtsdatum;

	public Person (String[] input) {
		name = input[0];
		vorname = input[1];
		strasse = input[2];
		hausnummer = Integer.parseInt(input[3]);
		plz = Integer.parseInt(input[4]);
		wohnort = input[5];
		String[] gd = input[6].split("\\.");
		geburtsdatum = new GregorianCalendar(
				Integer.parseInt(gd[2]), Integer.parseInt(gd[1])-1,
				Integer.parseInt(gd[0]));
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
	public String print() {
		SimpleDateFormat df = new SimpleDateFormat("dd. MMMMM yyyy");
		String gebDat = df.format(geburtsdatum.getTime());
		return(vorname + " " + name + "\n" + strasse + " "
							+ hausnummer + "\n" + plz + " " + wohnort +
							"\n" + gebDat + "\n" + alter() + " Jahre alt.\n\n");
	}	
	
} // class Person