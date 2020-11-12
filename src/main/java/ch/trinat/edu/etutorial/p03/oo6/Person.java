package ch.trinat.edu.etutorial.p03.oo6;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Person {

	
	public Person(String[] input) {
		this.name = input[0];
		this.vorname = input[1];
		this.strasse = input[2];
		this.hausnummer = Integer.parseInt(input[3]);
		this.plz = Integer.parseInt(input[4]);
		this.wohnort = input[5];
		String[] gd = input[6].split("\\.");
		this.geburtsdatum = new GregorianCalendar(Integer.parseInt(gd[2])
				, Integer.parseInt(gd[1])-1
				, Integer.parseInt(gd[0]));
	}
	private String name;
	private String vorname;
	private String strasse;
	private int hausnummer;
	private int plz;
	private String wohnort;
	private GregorianCalendar geburtsdatum;

	public static final String[] anzeige = {"Name", "Vorname", "Strasse", "Hausnummer", "plz", "Wohnort", "Geburtsdatum"};

	@Override
	public String toString() {
		SimpleDateFormat date =  new SimpleDateFormat("dd. MMMM yyyy");
		String dateString = date.format(this.geburtsdatum.getTime());
		return "name=" + name + ", vorname=" + vorname + ", strasse=" + strasse + ", hausnummer=" + hausnummer
				+ ", plz=" + plz + ", wohnort=" + wohnort + ", geburtsdatum=" + dateString;
	}
	
	public void delete() {
		
	}
	
}


