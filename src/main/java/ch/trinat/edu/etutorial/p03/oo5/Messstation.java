package ch.trinat.edu.etutorial.p03.oo5;

public class Messstation {
	
	private String id, name, emissionsquelltyp, umgebungstyp;
	private int jahresmittelwert, maxTageswert, tage50, tage60;
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
	public int getTage50() {
		return tage50;
	}
	public void setTage50(int tage50) {
		this.tage50 = tage50;
	}
	public int getTage60() {
		return tage60;
	}
	public void setTage60(int tage60) {
		this.tage60 = tage60;
	}
	
	public Messstation (String i, String n, String e, String u, int j, int mT, int t50, int t60) {
		
		setId(i);
		setName(n);
		setEmissionsquelltyp(e);
		setUmgebungstyp(u);
		setJahresmittelwert(j);
		setMaxTageswert(mT);
		setTage50(t50);
		setTage60(t60);
		
	}
	
	public void print () {
		System.out.println(id + " " + name + "\nEmissionsquelltyp: " 
					+ emissionsquelltyp + "\nUmgebungstyp: "
					+ umgebungstyp + "\nJahresmittelwert: " 
					+ jahresmittelwert + "µg/m3 \nMaximaler Tageswert: "
					+ maxTageswert + "µg/m3 \nTage mit Tageswerten > 50µg/m3: "
					+ tage50 + "\nTage mit Tageswerten > 60µg/m3: "
					+ tage60 + "\n");
	}
	
}
