package ch.trinat.edu.etutorial.p03.oo6;
import java.util.*;
import java.text.*;
public class Person extends Adressbuch{
	static String satz="";
	static String zuspeichern;
	static String vorname;
	static String name ;
	static GregorianCalendar geburtsdatum;
	static String strasse, wohnort;
	static int hausnummer,plz;

	public static String getZuspeichern() {
		return zuspeichern;
	}


	public static void setZuspeichern(String zuspeichern) {
		Person.zuspeichern = zuspeichern;
	}


	public static final String[] anzeige= {
			"Name" , "Vorname", "Strasse" , "Hausnummer" , "PLZ" ,
			"Wohnort" , "Geburtsdatum(dd.mm.yyyy)"
	};
	public Person (String[]input) {
		name=input[0];
		vorname=input[1];
		strasse= input[2];
		hausnummer=Integer.parseInt(input[3]);
		plz=Integer.parseInt(input[4]);
		wohnort=input[5];
		String[]gd = input[6].split("\\.");
		geburtsdatum = new GregorianCalendar(Integer.parseInt(gd[2]),Integer.parseInt(gd[1]),Integer.parseInt(gd[3]));
		
	}


	


	public static String getSatz() {
		return satz;
	}


	public static void setSatz(String satz) {
		Person.satz = satz;
	}


	public static String getVorname() {
		return vorname;
	}


	public static void setVorname(String vorname) {
		Person.vorname = vorname;
	}


	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		Person.name = name;
	}


	public static GregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}


	public static void setGeburtsdatum(GregorianCalendar geburtsdatum) {
		Person.geburtsdatum = geburtsdatum;
	}


	public static String getStrasse() {
		return strasse;
	}


	public static void setStrasse(String strasse) {
		Person.strasse = strasse;
	}


	public static String getWohnort() {
		return wohnort;
	}


	public static void setWohnort(String wohnort) {
		Person.wohnort = wohnort;
	}


	public static int getHausnummer() {
		return hausnummer;
	}


	public static void setHausnummer(int hausnummer) {
		Person.hausnummer = hausnummer;
	}


	public static int getPlz() {
		return plz;
	}


	public static void setPlz(int plz) {
		Person.plz = plz;
	}


	public static String[] getAnzeige() {
		return anzeige;
	}


	public static String print() {
		SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
		String gebDat =date.format(geburtsdatum.getTime());
		satz= "Name: " +name + "\n Vorname: "+ vorname+ "\n Strasse"+ strasse +"\n Hausnummer: "+hausnummer+ "\n PLZ: "+plz+
				"\n Wohnort:"+ wohnort +  "\n Geburtsdatum: "+gebDat;
		zuspeichern= satz;
	//addPerson(satz);
				return satz;	

	}
}
