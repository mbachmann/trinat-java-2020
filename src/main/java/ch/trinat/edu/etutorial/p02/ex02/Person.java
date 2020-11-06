//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p02.ex02;

public class Person {

	private String name;
	private int datum;
	private int nummer;
	private String adresse;
	private static int counter = 0;
	
	//neue Variante um bei Telefonbuch dirket mit new Person(...) Daten zu übergeben	
	public Person(String nam, int dat , int num, String adr) {
		//name = nam;
		//datum = dat;
		//nummer = num;
		//adresse = adr;
		//oder
		setName(nam);
		setDatum(dat);
		setNummer(num);
		setAdresse(adr);
		counter++;
	}
	
	//Automatisch generierter Konstruktor über Source > Generate Generate Constructor using Fields...
	//public Person(String name, int datum, int nummer, String adresse) {
		//super();
		//this.name = name;
		//this.datum = datum;
		//this.nummer = nummer;
		//this.adresse = adresse;
	//}
	
	//Freie Person hinzufügen
	public Person() {
		name = "Anonym";
		datum = 1011990;
		nummer = 1818;
		adresse = "Testdorf";
		counter++;
	}
	
	public static void printCounter() {
		System.out.println("Anzahl Kontakte in Ihrem Telefonbuch: " + counter);
	}
	
	//Kopierkonstruktor
	//public Person (Person p) {
		//name = p.getName();
		//Möglichkeiten
		//this.name = p.name;
		//setName(p.name);
		//setName(p.getName());
		//datum = p.getDatum();
		//nummer = p.getNummer();
		//adresse = p.getAdresse();
	//}

	//Ausgabe 
	public void print() {
		System.out.println(name + " ist am " + getDateString(datum) + " geboren und hat die Nummer " + nummer + ", Wohnhaft in " + adresse);
		System.out.println();
	}
	
	//toString
	public String toString() {
		return name + " ist am " + getDateString(datum) + " geboren und hat die Nummer " + nummer + ", Wohnhaft in " + adresse + "\n";
		// \n zeilenumbruch 
	}
	
	public Person clone() {
		Person p = new Person();
	    p.name = this.name;
	    p.nummer = this.nummer;
	    p.datum = this.datum;
	    p.adresse = this.adresse;
	   //Alternative
	   //Person p = new Person(this.name, this.datum, this.nummer, this.adresse);
	   return p;
	}
	
	public boolean equals(Person p) {
		if (p!=null && p.datum==this.datum && p.name.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String getDateString (int date) {
		String result = "";
		result = date/1000000 + ".";
		date = date%1000000;
		result = result + date/10000 + "." + date%10000;
		return result;
	}
	//Getter
	public String getName() {
		return name;
	}
	
	public int getDatum() {
		return datum;
	}
	
	public int getNummer() {
		return nummer;
	}
	
	public String getAdresse() {
		return adresse;
	}
	//Setter
	public void setName(String name_value) {
		name = name_value;
	}
	
	public void setDatum(int datum_value) {
		if (datum_value > 0) {
			datum = datum_value;
		}
	}
	
	public void setNummer(int nummer_value) {
		if (nummer_value > 0) {
			nummer = nummer_value;
		}
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
