package ch.trinat.edu.etutorial.p03.oo5;
//Mischa Kissling
//10/2020

import java.util.*;
import java.text.*;

public class Person {
	
	private String name;
	private String vorname;
	private GregorianCalendar geburtsdatum;;
	private String strasse;
	private int hausnummer;
	private int plz;
	private String wohnort;
	
	public Person(String vorname, String name, String strasse, int hausnummer, int plz, String wohnort, GregorianCalendar geburtsdatum) {
		this.vorname = vorname;
		this.name = name;
		this.geburtsdatum = geburtsdatum;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.wohnort = wohnort;
	}
	
	public void printInfo() {
		SimpleDateFormat df = new SimpleDateFormat ("dd. MMMMM yyyy");
		String geburtsDatum = df.format(geburtsdatum.getTime());
		System.out.println(vorname + " " + name + "\n"
							+ strasse + " " + hausnummer + "\n"
							+ plz + " " + wohnort + "\n"
							+ geburtsDatum + ", " + alter() + " Jahre alt \n");
	}
	
	public int alter() {
		GregorianCalendar heute = new GregorianCalendar();
		int alter = heute.get(GregorianCalendar.YEAR) - geburtsdatum.get(GregorianCalendar.YEAR);
		if (heute.get(GregorianCalendar.DAY_OF_YEAR) < geburtsdatum.get(GregorianCalendar.DAY_OF_YEAR)) {
			alter-- ;
		}
		return alter;
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

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public String getStrasse() {
		return strasse;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public int getPlz() {
		return plz;
	}

	public String getWohnort() {
		return wohnort;
	}
	
}