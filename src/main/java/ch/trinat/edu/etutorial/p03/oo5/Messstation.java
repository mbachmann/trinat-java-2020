package ch.trinat.edu.etutorial.p03.oo5;

public class Messstation {

	private String id, name, emissionsquelltyp, umgebungsquelltyp;
	private int jahresmittelwert, maxTageswert, tageswert50, tageswert60;

	public Messstation(String id, String name, String emissionsquelltyp, String umgebungsquelltyp, int jahresmittelwert,
			int maxTageswert, int tageswert50, int tageswert60) {
		super();
		this.id = id;
		this.name = name;
		this.emissionsquelltyp = emissionsquelltyp;
		this.umgebungsquelltyp = umgebungsquelltyp;
		this.jahresmittelwert = jahresmittelwert;
		this.maxTageswert = maxTageswert;
		this.tageswert50 = tageswert50;
		this.tageswert60 = tageswert60;
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

	public String getEmissionsquelltyp() {
		return emissionsquelltyp;
	}

	public void setEmissionsquelltyp(String emissionsquelltyp) {
		this.emissionsquelltyp = emissionsquelltyp;
	}

	public String getUmgebungsquelltyp() {
		return umgebungsquelltyp;
	}

	public void setUmgebungsquelltyp(String umgebungsquelltyp) {
		this.umgebungsquelltyp = umgebungsquelltyp;
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

	public int getTageswert50() {
		return tageswert50;
	}

	public void setTageswert50(int tageswert50) {
		this.tageswert50 = tageswert50;
	}

	public int getTageswert60() {
		return tageswert60;
	}

	public void setTageswert60(int tageswert60) {
		this.tageswert60 = tageswert60;
	}

}
