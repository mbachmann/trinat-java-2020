package ch.trinat.edu.etutorial.p03.oo6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Person {

	private String name, vorname, strasse, wohnort;
	private int hausnummer, postleitzahl;
	private GregorianCalendar geburtsdatum;

	Person (String test){
	 name = test; 	
	}
	
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

	public GregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(GregorianCalendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
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

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public Person (String n, String v, String s, int h, int p, String w, GregorianCalendar g
			) {
		setName(n);
		setVorname(v);
		setGeburtsdatum(g);
		setStrasse(s);
		setWohnort(w);
		setHausnummer(h);
		setPostleitzahl(p);

	}
	

	public int alter() {

		GregorianCalendar heute = new GregorianCalendar();
		int age = heute.get(Calendar.YEAR) - geburtsdatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR) < geburtsdatum.get(Calendar.DAY_OF_YEAR)) age--;
		return age;

	}

	public String print () {
		String test;
		SimpleDateFormat df = new SimpleDateFormat("dd. MMMM yyyy");
		String gebDat = df.format(geburtsdatum.getTime());
		/*System.out.println(	vorname + "  " + name + "\n" 
				+ alter() + " Jahre alt \n"
				+ "am " + gebDat + " geboren\n"
				+ "Adresse: " + strasse + " " + hausnummer + " \n"
				+ postleitzahl + " " + wohnort + "\n");
				*/
		test = vorname + "  " + name + "\n" 
				+ alter() + " Jahre alt \n"
				+ "am " + gebDat + " geboren\n"
				+ "Adresse: " + strasse + " " + hausnummer + " \n"
				+ postleitzahl + " " + wohnort + "\n";
		return test;
	}
}
