package ch.trinat.edu.etutorial.p02.ex02.telefonbuch;

public class Person {
	private String name, adresse;
	private int datum, nummer;
	private static int counter = 0;
	
	// Print Methode um die Daten in der Konsole auszugeben.
	public void print() {
		System.out.println(name+" ist am "+ datum +" geboren und hat die Nummer "+ nummer);
	}
	
	// Drei Setter um die Attribute zu setzen.
	public void setName(String name_value) {
	    name = name_value;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
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
	
	// Drei Getter um die Attribute abzurufen.
	public String getName() {
	    return name;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public int getDatum() {
	    return datum;
	}

	public int getNummer() {
	    return nummer;
	}
/*
	//Konstruktor:
	
	// Variante 1

	public Person(String n, int d, int num){
	    name = n;
	    datum = d;
	    nummer = num;
	}

	// Variante 2
	public Person(String name, int datum, int nummer){
	    this.name = name;
	    this.datum = datum;
	    this.nummer = nummer;
	}
*/
	// Variante 3
	//Da für alle Attribute eine Setter Methode vorhanden ist, diese hier zum Setzten verwenden.
	public Person(String n, int d, int num) {
	    setName(n);
	    setDatum(d);
	    setNummer(num);
	    counter++;
	}
	
	//  Default-Konstuktor, der keine Parameter hat.
	public Person() {
	    name = "Anonym";
	    datum = 1011990;
	    nummer = 1818;
	    adresse = "";
	    counter++;
	}

	// Automatisch erzeugter Konstruktor
	public Person(String name, int nummer) {
		super();
		this.name = name;
		this.nummer = nummer;
		counter++;
	}
	
	public Person(Person p) {
	    name = p.getName();
	    datum = p.getDatum();
	    nummer = p.getNummer();
	    adresse = p.getAdresse();
	}
	
	//Schreiben Sie die Methode toString welche keine Parameter besitzt und einen String zurückgibt.
	public String toString() {
		return name + " ist am " + datum + " geboren" + " und hat die Nummer " + nummer+".";
	}
	
	public Person clone() {
	    Person p = new Person(this.name, this.datum, this.nummer);
	    return p;
	}
	
	public boolean equals(Person p) {
	    if (p != null && p.datum == this.datum && p.name.equals(this.name)) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public static String getDateString(int date) {
	    String result = "";
	    result = date / 1000000 + ".";
	    date = date % 1000000;
	    result = result + date / 10000 + "." + date % 10000;
	    return result;
	}
	
	public static void printCounter() {
	    System.out.println("Anzahl erzeugter Personen " + counter);
	}
}
