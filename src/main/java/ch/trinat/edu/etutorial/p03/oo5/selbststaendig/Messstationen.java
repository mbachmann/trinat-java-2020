package ch.trinat.edu.etutorial.p03.oo5.selbststaendig;

public class Messstationen {

	// Variablendeklaration
	private String id, name, emissionsquelltyp, umgebungstyp;
	private int jahresmittelwert, maxTageswert, tageswertkl, tageswertgr;

	// Get und Setters
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

	public int getTageswertkl() {
		return tageswertkl;
	}

	public void setTageswertkl(int tageswertkl) {
		this.tageswertkl = tageswertkl;
	}

	public int getTageswertgr() {
		return tageswertgr;
	}

	public void setTageswertgr(int tageswertgr) {
		this.tageswertgr = tageswertgr;
	}

	//Konstruktor
	public Messstationen(String id, String name, String emissionsquelltyp, String umgebungstyp, int jahresmittelwert,
			int maxTageswert, int tageswertkl, int tageswertgr) {
		super();
		this.id = id;
		this.name = name;
		this.emissionsquelltyp = emissionsquelltyp;
		this.umgebungstyp = umgebungstyp;
		this.jahresmittelwert = jahresmittelwert;
		this.maxTageswert = maxTageswert;
		this.tageswertkl = tageswertkl;
		this.tageswertgr = tageswertgr;
	}

	// Ausgabe
	public void print() {
		System.out.print(id + " " + name);
		System.out.println(umgebungstyp + " "); //  + grenzwert
	}

} // class Messstationen
