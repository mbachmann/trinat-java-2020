package ch.trinat.edu.etutorial.p03.oo5;

import java.util.*; // um den GregorianCalendar nuetzen zu koennen 
import  java.text.*; // um das Datum ausdrucken
public class Person {

	private String name ;
	private String vorname ; 
	private int alter ; 
	private String strasse , wohnort ; 
	private int hausnummer, postleitzahl ; 
	private GregorianCalendar geburstagsdatum ; 
	
	
	
	public Person ( String n, String v , String strasse  , int hausnummer , int postleitzahl,String wohnort, GregorianCalendar g) {
		name = n ; 
		vorname = v ; 
		geburstagsdatum = g ; 
		this.strasse = strasse ; 
		this.wohnort = wohnort ; 
		this.hausnummer = hausnummer; 
		this.postleitzahl = postleitzahl; 
		
		
	}
	
	public int alter () {
		GregorianCalendar heute = new GregorianCalendar();
		int  age = heute.get(Calendar.YEAR)- geburstagsdatum.get(Calendar.YEAR);
		if (heute.get(Calendar.DAY_OF_YEAR) < geburstagsdatum.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		return (age) ; 
	}
		
		public void setName (String n) {
			name = n ; 
		}
		
		public void setVorname (String v) {
			vorname = v ; 
		}
		
		public void setAlter (int a) {
			alter = a ; 
		}
		
		public String getName() {
			return(name); 
		}
		
		public String getVorname() {    // getters um die attribute in den print() lesen zu können 
			return(vorname); 
		}
		
		public int getAlter() {
			return(alter); 
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

		public int getPostleitzahl() {
			return postleitzahl;
		}

		public void setPostleitzahl(int postleitzahl) {
			this.postleitzahl = postleitzahl;
		}
		
		

		public GregorianCalendar getGeburstagsdatum() {
			return geburstagsdatum;
		}

		public void setGeburstagsdatum(GregorianCalendar g) {
			geburstagsdatum = g;
		}

		public void print() {
			SimpleDateFormat df = new SimpleDateFormat("dd. MMMMM yyyy");
			String gebDat = df.format(geburstagsdatum.getTime());
			
			System.out.println(vorname + " " + name );         
			System.out.println( strasse + " "+  hausnummer );
			System.out.println(postleitzahl + " "+ wohnort) ; 
			System.out.println(gebDat);
			System.out.println( alter() + " Jahre alt. " + "\n");  // \n für eine neue Zeile 
		}
		
	

}
