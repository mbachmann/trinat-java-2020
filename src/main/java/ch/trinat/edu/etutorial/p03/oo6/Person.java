package ch.trinat.edu.etutorial.p03.oo6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

public Person() {
	
}
	 String name;
	 String vorname;
	 String strasse;
	 String id;
	 int hausnummer;
	 int plz;
	 String wohnort;
	 GregorianCalendar geburtsdatum;


	public Person (String[] input) {
		name = input[0];
		vorname = input[1];
		strasse = input[2];
		hausnummer = Integer.parseInt(input[3]);
		plz = Integer.parseInt(input[4]);
		wohnort = input[5];
		String[] gd = input[6].split("\\.");
		geburtsdatum = new GregorianCalendar(
				Integer.parseInt(gd[2]),Integer.parseInt(gd[1])-1,
				Integer.parseInt(gd[0]));
	}
	
	public static final String [] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer",
			"PLZ", "Ort", "Geburtsdatum (dd.mm.yyyy)"};
	
	public java.lang.String alter() {
			int year = geburtsdatum.get(Calendar.YEAR);
		    int month = geburtsdatum.get(Calendar.MONTH);
		    int day = geburtsdatum.get(Calendar.DAY_OF_MONTH);
		    return day + " " + month + " " + year;
	}
	
		
		

	
	public String print() {
		return (
				"name:" + name + 
				"\n vorname:" + vorname + 
				"\n" + "Strasse: " + strasse + 
				"\n" + "hausnummer: " + hausnummer + 
				"\n" + "plz: " + plz +
				"\n" + "wohnort: " + wohnort +
				"\n" + "geburtsdatum: " + alter());

	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	public void setGeburtsdatum(GregorianCalendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	String getName() {
		return name;
	}

	String getVorname() {
		return vorname;
	}

	String getStrasse() {
		return strasse;
	}

	int getHausnummer() {
		return hausnummer;
	}

	int getPlz() {
		return plz;
	}

	String getWohnort() {
		return wohnort;
	}

	GregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	
}
