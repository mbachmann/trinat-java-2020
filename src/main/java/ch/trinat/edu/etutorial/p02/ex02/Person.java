package ch.trinat.edu.etutorial.p02.ex02;

public class Person {

	// Attributen
	private String name, address;
	private int date, number;
	private static int counter = 0;

	// Output
	void print() {
		System.out.println("Name: " + name + " Date of birth: " + date + " Number: " + number);
	}

	// Kontruktoren
	// - Parametrisiert
	public Person(String n, int d, int nb) {
		setName(n);
		setDate(d);
		setNumber(nb);
		counter++;
	}

	// - Default Konstruktor
	public Person() {
		this.name = "Anonymous";
		this.date = 19900101;
		this.number = 1818;
		this.address = "";
		counter++;
	}

	// - auto Kontruktor
	public Person(String name, int number) {
		// super(); Inheritance: parent/child classes
		this.name = name;
		this.number = number;
		counter++;
	}

	// - Kopie Konstruktor
	public Person(Person p) {
		setName(p.getName());
		// oder: this.name=p.name;
		setDate(p.getDate());
		setNumber(p.getNumber());
		setAddress(p.getAddress());
		counter++;
	}

	// toString Methode - output Info als Text
	public String toString() {
		return "Name: " + name + " Date of birth: " + date + " Number: " + number;
	}

	// Clone Methode
	public Person clone() {
		Person p = new Person(this.name, this.date, this.number);
		return p;
	}

	// equals Methode - Vergleich 2 Objekte
	public boolean equals(Person p) {
		if ((p != null) && (this.date == p.date) && (this.name.equals(p.name))) {
			return true;
		} else
			return false;
	}

	// static Methode getDateString
	public static String getDateString(int date) {
		String result = "";
		// Datum String formattieren
		result = date / 10000 + ".";
		date = date % 10000;
		result = result + date / 100 + "." + date % 100;
		return result;
	}

	static void printCounter() {
		System.out.println("Number of people: " + counter);
	}

	// Setter Methoden
	public void setName(String n) {
		this.name = n;
	}

	public void setDate(int d) {
		if (d > 0) {
			this.date = d;
		}
	}

	public void setNumber(int nb) {
		if (nb > 0) {
			this.number = nb;
		}
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Getter Methoden
	public String getName() {
		return name;
	}

	public int getDate() {
		return date;
	}

	public int getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}

}
