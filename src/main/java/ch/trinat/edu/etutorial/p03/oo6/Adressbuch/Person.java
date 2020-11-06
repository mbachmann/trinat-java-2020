package ch.trinat.edu.etutorial.p03.oo6.Adressbuch;

import java.util.*;
import java.text.*;

public class Person {

	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Ort", "Geburtsdatum (dd.mm.yyyy)"};

	private String name;
	private String vorname;
	private String strasse;
	private int hausnummer;
	private int plz;
	private String wohnort;
	private GregorianCalendar geburtsdatum;

	public Person(String [] input) {
		this.name =input[0];
		this.vorname = input[1];
		this.strasse = input[2];
		this.hausnummer = Integer.parseInt(input[3]);
		this.plz = Integer.parseInt(input[4]);
		this.wohnort = input[5];
		String[] gd = input[6].split("\\.");
		geburtsdatum = new GregorianCalendar(
				Integer.parseInt(gd[2]), Integer.parseInt(gd[1])-1, Integer.parseInt(gd[0]));
	}

	public String printInfo() {
		SimpleDateFormat df = new SimpleDateFormat ("dd. MMMMM yyyy");
		String geburtsDatum = df.format(geburtsdatum.getTime());
		return vorname + " " + name + "\n" + strasse + " " + hausnummer + "\n"
				+ plz + " " + wohnort + "\n" + "Geburtsdatum: " + geburtsDatum;
	}
	
	public void delete() {
		
	}
}