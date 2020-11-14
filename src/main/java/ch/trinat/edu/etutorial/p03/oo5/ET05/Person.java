package ch.trinat.edu.etutorial.p03.oo5.ET05;

import java.util.Calendar;

import java.util.GregorianCalendar; 
import java.text.SimpleDateFormat;

public class Person {

	
	
	
	private String name;
	private String vorname;
	private String strasse, wohnort;
	private int hausnummer, plz;
	private GregorianCalendar geburtsdatum;
	
	public int alter () {
	
		
	GregorianCalendar heute= new GregorianCalendar();
	int age = heute.get(Calendar.YEAR) - geburtsdatum.get(Calendar.YEAR);

	if (heute.get(Calendar.DAY_OF_YEAR) < geburtsdatum.get(Calendar.DAY_OF_YEAR)) {
		age--;
	} return (age);
	}
	
	
	
	
	
	public Person (String n, String v, String s, int h, int p, String w, GregorianCalendar g ) {
		name = n;
		vorname = v;
		strasse = s;
		hausnummer= h;
		plz= p;
		wohnort=w;
		geburtsdatum=g;
	}
	
	
	
	public String getName() {
		return(name);
	}
	public String getVorname() {
		return(vorname);
	}
	public String getStrasse() {
		return(strasse);
	}
	public String getWohnort() {
		return wohnort;
	}
	public GregorianCalendar getGeburtdatum() {
		return(geburtsdatum);
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

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public void print() {
		SimpleDateFormat df = new SimpleDateFormat("dd MMMMM yyyy");
		String getDat = df.format(geburtsdatum.getTime());
	System.out.println(name + " " + vorname + "\n" + strasse + hausnummer + "\n" + plz + wohnort + "\n" + alter() +" Jahre alt.\n" + getDat +"\n");
	}
}



	