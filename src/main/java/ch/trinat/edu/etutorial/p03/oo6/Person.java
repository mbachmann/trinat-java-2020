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
