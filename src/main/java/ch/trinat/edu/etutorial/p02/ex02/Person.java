package ch.trinat.edu.etutorial.p02.ex02;

public class Person {

	// private um die Attribute diese Klasse nicht direkt manipuliert werden können

	private String name;
	private int datum;
	private int nummer;
	private String adresse;
	private static int counter = 0 ; 

	// Konstruktore Methode

	public Person(String name, int datum, int nummer) {

		// "this" um den gleichen namen nützen zu können

		this.name = name;
		this.datum = datum;
		this.nummer = nummer;
		counter++;

	}

	public Person() {
		name = "Anonym";
		datum = 1011990;
		nummer = 1818;
		adresse = "";
		counter++;
	}

	public void print() {

		System.out.println(name + " ist am " + datum + " geboren und hat die Nummer " + nummer);
	}

	public void setName(String name_value) {
		name = name_value;
	}

	public void setDatum(int datum_value) {
		datum = datum_value;
	}

	public void setNummer(int nummer_value) {
		if (nummer_value > 0) {

			nummer = nummer_value;
		}

	}

	public String getName() {
		return name;
	}

	public int getDatum() {
		return datum;
	}

	public int getNummer() {
		return nummer;
	}

	// Getter und Setter automatisch erstellen lassen : source -> Generate Getters
	// and Setters

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	// man kann Konstruktoren automatisch erzeugen mit : Source -> Generate
	// Constructor using Fields

	public Person(String name, int nummer) {
		super();
		this.name = name;
		this.nummer = nummer;
		counter++ ;
	}

	// Kopierkonstruktor

	public Person(Person p) {

		name = p.getName();
		datum = p.getDatum();
		nummer = p.getNummer();
		adresse = p.getAdresse();
		counter++;
	}

	// toString Methode :
	// man kann Sie auch automatisch generienren mit : Source -> Generate toString()

	public String toString() {
		return name + " ist am " + datum + " geboren und hat die Nummer " + nummer;

	}

	// Clone Methode :

	public Person clone() {
		// mit Default-Konstruktor
		Person p = new Person();
		p.name = this.name;
		p.nummer = this.nummer;
		p.datum = this.datum;

		// mit parametrisiertem Konstruktor
		// Person p = new Person ( this.name , this.datum , this.nummer );

		return p;

	}

	// equals-Methode

	public boolean equals(Person p) {

		if (p != null && p.datum == this.datum && p.name.contentEquals(this.name)) {
			
			return true;
		} else {
			return false;
		}
	}
	
	// getDate_Methode 
	
	public static String getDateString(int date) {
		String result = ""; 
		result = date / 1000000 + "."; 
		date = date % 1000000 ; 
		result = result + date / 10000 + "." + date % 10000; 
		return result; 
		
	}

	public static void printCounter() {
		System.out.println("Anzahl erzeugter Personen " + counter ); 
	}
	
}
