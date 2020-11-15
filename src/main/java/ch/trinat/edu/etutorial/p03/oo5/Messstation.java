package ch.trinat.edu.etutorial.p03.oo5;

public class Messstation {

	private String id, name, quellTyp, umgebungsTyp;
	private double jahresMittelwert, maxTageswert, anzTUeber50, anzTUeber60;

	public Messstation(String id, String name, String quelltyp, String umgebungstyp, double mittelwert, double max,
			double ueber50, double ueber60) {
		this.id = id;
		this.name = name;
		this.quellTyp = quelltyp;
		this.umgebungsTyp = umgebungstyp;
		this.jahresMittelwert = mittelwert;
		this.maxTageswert = max;
		this.anzTUeber50 = ueber50;
		this.anzTUeber60 = ueber60;
	}

	// getters & setters
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

	public String getQuellTyp() {
		return quellTyp;
	}

	public void setQuellTyp(String quellTyp) {
		this.quellTyp = quellTyp;
	}

	public String getUmgebungsTyp() {
		return umgebungsTyp;
	}

	public void setUmgebungsTyp(String umgebungsTyp) {
		this.umgebungsTyp = umgebungsTyp;
	}

	public double getJahresMittelwert() {
		return jahresMittelwert;
	}

	public void setJahresMittelwert(double jahresMittelwert) {
		this.jahresMittelwert = jahresMittelwert;
	}

	public double getMaxTageswert() {
		return maxTageswert;
	}

	public void setMaxTageswert(double maxTageswert) {
		this.maxTageswert = maxTageswert;
	}

	public double getAnzTUeber50() {
		return anzTUeber50;
	}

	public void setAnzTUeber50(double anzTUeber50) {
		this.anzTUeber50 = anzTUeber50;
	}

	public double getAnzTUeber60() {
		return anzTUeber60;
	}

	public void setAnzTUeber60(double anzTUeber60) {
		this.anzTUeber60 = anzTUeber60;
	}
}
