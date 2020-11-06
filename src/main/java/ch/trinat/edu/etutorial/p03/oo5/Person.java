package ch.trinat.edu.etutorial.p03.oo5;

import java.util.*;
import java.text.*;

public class Person {
	
	private String name;
	private String vorname;
	private GregorianCalendar geburtsdatum;
	private String strasse, wohnort;
	private int hausnummer, plz;

	public String getName() {
		return(name);
	}
	
	void setName(String n) {
		name = n;
	}
	
	public String getVorname() {
		return(vorname);
	}
	
	public void setVorname(String v) {
		vorname = v;
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

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	public GregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(GregorianCalendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public Person (String n, String v, String str, int nr, int p, String w, GregorianCalendar g) {
		name = n;
		vorname = v;
		strasse = str;
		hausnummer = nr;
		plz = p;
		wohnort = w;
		geburtsdatum = g;
		
	}
	
	public int alter () {
		
		GregorianCalendar heute = new GregorianCalendar();
		int age = heute.get(Calendar.YEAR) - geburtsdatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR) < geburtsdatum.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		return age;
	}
	
	public void print () {
		SimpleDateFormat df = new SimpleDateFormat("dd. MMMMM yyyy");
		String gebDat = df.format(geburtsdatum.getTime());
        System.out.println(vorname + " " + name + "\n" + strasse + " " + hausnummer + "\n" + plz + " " + wohnort + "\n" + gebDat + "\n" + alter() + " Jahre alt.\n");
	}
	
}
