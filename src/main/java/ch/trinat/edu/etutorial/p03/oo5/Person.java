package ch.trinat.edu.etutorial.p03.oo5;
import java.util.*;
import java.text.*;
public class Person {
	private String vorname;
	private String name ;
	private GregorianCalendar geburtsdatum;
	private String strasse, wohnort;
	private int hausnummer,plz;



	public Person (String n , String v , String s , int h , int p , String w , GregorianCalendar g) {
		name=n;
		vorname=v;
		geburtsdatum=g;
		strasse = s;
		wohnort = w;
		hausnummer = h;
		plz = p;
	}

	public int alter () {
		GregorianCalendar heute = new GregorianCalendar();
		int age = heute.get(Calendar.YEAR) - geburtsdatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR) < geburtsdatum.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		return (age);
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

	public void setName(String n) {
		name=n;
	}
	public void setVorname(String v) {
		vorname=v;
	}

	public String getName() {
		return (name);
	}
	public String getVorname() {
		return (vorname);
	}

	public void print() {
		String gebDat = geburtsdatum.get(Calendar.DAY_OF_MONTH)+"."+(geburtsdatum.get(Calendar.MONTH)+1)+"."+ geburtsdatum.get(Calendar.YEAR);
		SimpleDateFormat df= new SimpleDateFormat("dd.MMMM.yyyy");
		gebDat =df.format(geburtsdatum.getTime());
		System.out.println(vorname +" "+ name + "\n" + strasse + " " + hausnummer);
		System.out.println(plz + " " + wohnort+ "\n" + gebDat + "\n" + alter() + " Jahre alt. \n");	

	}
}
