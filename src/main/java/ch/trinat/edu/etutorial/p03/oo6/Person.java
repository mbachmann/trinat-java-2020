package ch.trinat.edu.etutorial.p03.oo6;

//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.GregorianCalendar;

public abstract class Person {
	private String name, vorname, strasse, ort;
	private int hausnummer, plz;
	private String geburtsdatum;
	
	public static final String [] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "PLZ", "Ort", "Geburtsdatum (dd.mm.yyyy)"};

	public Person (String[] anzeige) { 
		name = anzeige[0];
		vorname = anzeige[1];
		strasse = anzeige[2];
		hausnummer = Integer.parseInt(anzeige[3]);
		plz = Integer.parseInt(anzeige[4]);
		ort = anzeige[5]; 
		String[] gd = anzeige[6].split("\\."); 
		geburtsdatum = new String(GregorianCalendar(Integer.parseInt(gd[2]), Integer.parseInt(gd[1]) - 1, Integer.parseInt(gd[0])));
	}

	private String GregorianCalendar(int parseInt, int i, int parseInt2) {

		return (parseInt2 + "." + i + "." + parseInt);
	}

	public static String[] getAnzeige() {
		return anzeige;
	}

	public String print() {

		return vorname + " " + name + "\n" + strasse + " " + hausnummer + "\n" + plz + " " + ort + "\n" + geburtsdatum + "\n";
	}
}
