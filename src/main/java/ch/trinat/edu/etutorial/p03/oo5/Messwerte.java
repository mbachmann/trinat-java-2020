package ch.trinat.edu.etutorial.p03.oo5;

public class Messwerte {
	private String id = "", name = "", emissionsquelltyp = "", umgebungstyp = "";
	private int jahresmittelwert = 0, maxTag = 0, anzahlTageUeber50 = 0, anzahlTageUeber60 = 0;

	//	Konstruktor

	public Messwerte(String id, String name, String emissionsquelltyp, String umgebungstyp, int jahresmittelwert,
			int maxTag, int anzahlTageUeber50, int anzahlTageUeber60) {
		this.id = id;
		this.name = name;
		this.emissionsquelltyp = emissionsquelltyp;
		this.umgebungstyp = umgebungstyp;
		this.jahresmittelwert = jahresmittelwert;
		this.maxTag = maxTag;
		this.anzahlTageUeber50 = anzahlTageUeber50;
		this.anzahlTageUeber60 = anzahlTageUeber60;
	}

	//	Getters und Setters

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmissionsquelltyp() {
		return emissionsquelltyp;
	}
	public void setEmissionsquelltyp(String emissionsquelltyp) {
		this.emissionsquelltyp = emissionsquelltyp;
	}

	public String getUmgebungstyp() {
		return umgebungstyp;
	}
	public void setUmgebungstyp(String umgebungstyp) {
		this.umgebungstyp = umgebungstyp;
	}

	public int getJahresmittelwert() {
		return jahresmittelwert;
	}
	public void setJahresmittelwert(int jahresmittelwert) {
		this.jahresmittelwert = jahresmittelwert;
	}

	public int getMaxTag() {
		return maxTag;
	}
	public void setMaxTag(int maxTag) {
		this.maxTag = maxTag;
	}

	public int getAnzahlTageUeber50() {
		return anzahlTageUeber50;
	}
	public void setAnzahlTageUeber50(int anzahlTageUeber50) {
		this.anzahlTageUeber50 = anzahlTageUeber50;
	}

	public int getAnzahlTageUeber60() {
		return anzahlTageUeber60;
	}
	public void setAnzahlTageUeber60(int anzahlTageUeber60) {
		this.anzahlTageUeber60 = anzahlTageUeber60;
	}

	//	Print-Methode
	public void print() {
		System.out.println(id + " " + name);
		System.out.println("Emissionsquelltyp: " + emissionsquelltyp);
		System.out.println("Umgebungstyp: "	+ umgebungstyp);
		System.out.println("Jahresmittelwert: " + jahresmittelwert + "\u03BCg/m3");
		System.out.println("Maximaler Tageswert: " + maxTag);
		System.out.println("Tage mit Messwerten > 50\u03BCg/m3: " + anzahlTageUeber50);
		System.out.println("Tage mit Messwerten > 60\u03BCg/m3: " + anzahlTageUeber60);
		System.out.println();
	}

}
