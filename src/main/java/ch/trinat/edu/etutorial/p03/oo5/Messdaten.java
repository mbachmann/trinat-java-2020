package ch.trinat.edu.etutorial.p03.oo5;

public class Messdaten {
	
	public Messdaten(String id, String name, String emmissionsquelltyp, String umgebungstyp, float jahresmittelwert,
			float maxTagewert, int tageUeber50, int tageUeber60) {
		super();
		this.id = id;
		this.name = name;
		this.emmissionsquelltyp = emmissionsquelltyp;
		this.umgebungstyp = umgebungstyp;
		this.jahresmittelwert = jahresmittelwert;
		this.maxTagewert = maxTagewert;
		this.tageUeber50 = tageUeber50;
		this.tageUeber60 = tageUeber60;
		
		gesamtMessdaten++;
		gesamtJahresmittelwert += jahresmittelwert;
	}
	
	private static int gesamtMessdaten;
	private static float gesamtJahresmittelwert;
	
	private String id;
	private String name;
	private String emmissionsquelltyp;
	private String umgebungstyp;
	private float jahresmittelwert;
	private float maxTagewert;
	private int tageUeber50;
	private int tageUeber60;
	
	
	
	
	static public float jahresmittelDurchschnitt() {
		return gesamtJahresmittelwert/gesamtMessdaten;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Messdaten [id=" + id + ", name=" + name + ", emmissionsquelltyp=" + emmissionsquelltyp
				+ ", umgebungstyp=" + umgebungstyp + ", jahresmittelwert=" + jahresmittelwert + ", maxTagewert="
				+ maxTagewert + ", tageUeber50=" + tageUeber50 + ", tageUeber60=" + tageUeber60 + "]";
	}






	public static int getMessdaten() {
		return gesamtMessdaten;
	}
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
	public String getEmmissionsquelltyp() {
		return emmissionsquelltyp;
	}
	public void setEmmissionsquelltyp(String emmissionsquelltyp) {
		this.emmissionsquelltyp = emmissionsquelltyp;
	}
	public String getUmgebungstyp() {
		return umgebungstyp;
	}
	public void setUmgebungstyp(String umgebungstyp) {
		this.umgebungstyp = umgebungstyp;
	}
	public float getJahresmittelwert() {
		return jahresmittelwert;
	}
	public void setJahresmittelwert(float jahresmittelwert) {
		this.jahresmittelwert = jahresmittelwert;
	}
	public float getMaxTagewert() {
		return maxTagewert;
	}
	public void setMaxTagewert(float maxTagewert) {
		this.maxTagewert = maxTagewert;
	}
	public int getTageUeber50() {
		return tageUeber50;
	}
	public void setTageUeber50(int tageUeber50) {
		this.tageUeber50 = tageUeber50;
	}
	public int getTageUeber60() {
		return tageUeber60;
	}
	public void setTageUeber60(int tageUeber60) {
		this.tageUeber60 = tageUeber60;
	}
	
	
	
	
}
