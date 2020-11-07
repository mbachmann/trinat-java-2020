package ch.trinat.edu.etutorial.p03.oo5.messstation;

public class Messstation {

	private String id, name, emissionsquelltyp, umgebungstyp;
	private int  jahresmittelwert, maxTageswert, tageswertGroesserFünfzig, tageswertGroesserSechzig;

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
	public int getMaxTageswert() {
		return maxTageswert;
	}
	public void setMaxTageswert(int maxTageswert) {
		this.maxTageswert = maxTageswert;
	}
	public int getTageswertGroesserFünfzig() {
		return tageswertGroesserFünfzig;
	}
	public void setTageswertGroesserFünfzig(int tageswertGroesserFünfzig) {
		this.tageswertGroesserFünfzig = tageswertGroesserFünfzig;
	}
	public int getTageswertGroesserSechzig() {
		return tageswertGroesserSechzig;
	}
	public void setTageswertGroesserSechzig(int tageswertGroesserSechzig) {
		this.tageswertGroesserSechzig = tageswertGroesserSechzig;
	}

	public Messstation (String i, String n, String e,  String u, int j, int m, int t1, int t2) {
		id = i;
		name = n;
		emissionsquelltyp = e;
		umgebungstyp = u;
		jahresmittelwert = j;
		maxTageswert = m;
		tageswertGroesserFünfzig = t1;
		tageswertGroesserSechzig = t2;
	}

	public void print() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Emissionsquelltyp: " + emissionsquelltyp);
		System.out.println("Umgebungstyp: " + umgebungstyp);
		System.out.println("Jahresmittelwert: " + jahresmittelwert + "\u03BCg/m\u00B3");
		System.out.println("Max. Tageswert: " + maxTageswert + "\u03BCg/m\u00B3");
		System.out.println("Tage mit Tageswert > 50 \u03BCg/m\u00B3: " + tageswertGroesserFünfzig);
		System.out.println("Tage mit Tageswert > 60 \u03BCg/m\u00B3: " + tageswertGroesserSechzig);
		System.out.println();
	}

	public void printSpezial() {
		System.out.println("Name: " + name);
		System.out.println("Umgebungstyp: " + umgebungstyp);
		System.out.println("Jahresmittelwert: " + jahresmittelwert + "\u03BCg/m\u00B3");
		System.out.println();
	}
}

