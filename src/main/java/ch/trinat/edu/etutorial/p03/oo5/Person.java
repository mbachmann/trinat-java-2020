package ch.trinat.edu.etutorial.p03.oo5;

import java.util.*;
import java.text.*;

public class Person {
	private String name,vorname; 
	private GregorianCalendar geburtsdatum;
	private String strasse, wohnort;
	private int hausnummer, postleitzhal;


	public Person (String n, String v, String s, int h,  int p, String w, GregorianCalendar g) { //C'est mieux des variablesavec des vrais noms
		name=n;						//copier ce que y'a dans les setters
		vorname=v;
		geburtsdatum=g;
		hausnummer=h;
		strasse =s;
		postleitzhal = p;
		wohnort = w;
	}

	public void print() {
		SimpleDateFormat date= new SimpleDateFormat("dd.MMMMM yyyy");
		String gebDat = date.format(geburtsdatum.getTime());
		System.out.println( vorname + " " + name + "\n" 
				+ hausnummer + " "+ strasse);
		System.out.println( postleitzhal + " " + wohnort
				+ "\n"+ gebDat + "\n"
				+ Alter() + " Jahre alt.\n");
	}

	public int Alter() {
		GregorianCalendar heute = new GregorianCalendar();
		int age = heute.get(Calendar.YEAR) - geburtsdatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR)<geburtsdatum.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		return age;

	}

	public void setName(String n) {
		name = n;  
	}

	public String getName(){
		return name;
	}

	public void setVorname(String v) {
		vorname = v;
	}

	public String getVorname() {
		return vorname;
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

	public int getPostleitzhal() {
		return postleitzhal;
	}

	public void setPostleitzhal(int postleitzhal) {
		this.postleitzhal = postleitzhal;
	}

}
