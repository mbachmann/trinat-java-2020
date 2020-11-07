package ch.trinat.edu.etutorial.p03.oo5.person;
import java.util.*;
import java.text.*;

public class Person {
	private String name, vorname, strasse, wohnort;
	private int hausnummer, plz;
	private GregorianCalendar geburtsdatum;

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

	public void print () {
		SimpleDateFormat df = new SimpleDateFormat("dd. MMMMM yyyy");
		String gebDat = df.format(geburtsdatum.getTime());
		System.out.println(vorname + " " + name + "\n" + strasse + " " 
				+ hausnummer + "\n" + plz + " " + wohnort+ "\n"
				+ gebDat + "\n"+ alter() + " Jahre alt.\n");
	}

	public Person (String n, String v, String s,  int h, int p, String w, GregorianCalendar g) {
		name = n;
		vorname = v;
		geburtsdatum = g;
		strasse = s;
		wohnort = w;
		hausnummer = h;
		plz = p;
	}

	public int alter() {
		GregorianCalendar heute = new GregorianCalendar();
		int age = heute.get(Calendar.YEAR) - geburtsdatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR) < geburtsdatum.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		return age;
	}
}
