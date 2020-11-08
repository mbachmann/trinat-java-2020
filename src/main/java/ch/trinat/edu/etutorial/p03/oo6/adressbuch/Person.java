package ch.trinat.edu.etutorial.p03.oo6.adressbuch;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class Person {
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

	public static final String [] anzeige = {" Name", " Vorname", " Strasse", " Hausnummer", " PLZ", " Ort", " Geburtsdatum (dd.mm.yyyy)"};

	public Person (String[] input) {
		name 	=	input[0];
		vorname = 	input[1];
		strasse = 	input[2];
		hausnummer = Integer.parseInt(input[3]);
		plz = Integer.parseInt(input[4]);
		wohnort = input[5];
		String[] gd = input[6].split("\\.");
		geburtsdatum = new GregorianCalendar
				(Integer.parseInt(gd[2]),
				Integer.parseInt(gd[1])-1,
				Integer.parseInt(gd[0]));
	}
	
	public String print() {
		SimpleDateFormat df = new SimpleDateFormat ("dd. MMMMM yyyy");
		String geburtsDatum = df.format(geburtsdatum.getTime());
		return vorname + " " + name + "\n" + strasse + " " + hausnummer + "\n"
				+ plz + " " + wohnort + "\n" + "Geburtsdatum: " + geburtsDatum;
	}
	
	public void delete() {}
}
