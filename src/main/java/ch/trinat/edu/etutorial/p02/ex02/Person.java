package ch.trinat.edu.etutorial.p02.ex02;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Person {
	private String name, vorname, wohnort, strasse;
	private int hausnummer, postLeitZahl;
	private GregorianCalendar geburtsdatum;
	
	
	public Person(String n, String v, String w, String s, GregorianCalendar g, int plz, int h) {
		this.name = n;
		this.vorname = v;
		this.geburtsdatum = g;
		this.wohnort = w;
		this.strasse = s;
		this.hausnummer = h;
		this.postLeitZahl = plz;
	}
	
	public int alter() {
		GregorianCalendar heute = new GregorianCalendar();
		int alter = heute.get(GregorianCalendar.YEAR) - geburtsdatum.get(GregorianCalendar.YEAR);
		if (heute.get(GregorianCalendar.DAY_OF_YEAR) < geburtsdatum.get(GregorianCalendar.DAY_OF_YEAR)) {
			alter--;
		}
		return alter;
	}
	
	public String Geburtsdatum() {
		SimpleDateFormat datum = new SimpleDateFormat("dd. MMMMM yyyy");
		String gebDatum = datum.format(geburtsdatum.getTime());
		return gebDatum;
	}
	
	
	public void print() {
		
			System.out.println(vorname +" " + name + "\n"
			+ hausnummer +" " +strasse +" " +wohnort +" "+ postLeitZahl + "\n"
			+ "geb. " + Geburtsdatum() + " :" + alter() +" Jahre alt" +"\n");
		}
	
	public int getPostLeitZahl() {
		return postLeitZahl;
	}

	public void setPostLeitZahl(int postLeitZahl) {
		this.postLeitZahl = postLeitZahl;
	}

	public GregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(GregorianCalendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getWohnort() {
		return wohnort;
	}
	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	public int getPlz() {
		return postLeitZahl;
	}
	public void setPlz(int plz) {
		this.postLeitZahl = plz;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public GregorianCalendar getAlter() {
		return geburtsdatum;
	}
	public void setAlter(GregorianCalendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
