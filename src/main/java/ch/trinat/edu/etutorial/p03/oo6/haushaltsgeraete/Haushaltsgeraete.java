package ch.trinat.edu.etutorial.p03.oo6.haushaltsgeraete;

public abstract class Haushaltsgeraete {
	protected String typ, name, ort, status, fehlermeldung;
	protected boolean on, fehler;
	
	public String getTyp() {
		return typ;
	}
	public String getName() {
		return name;
	}
	public String getOrt() {
		return ort;
	}
	public String getStatusmeldung() {
		return status;
	}
	public String getFehlermeldung() {
		return fehlermeldung;
	}
	
	public String getStatus() {
		return status;
	}
	public boolean isOn() {
		return on;
	}
	public boolean hatFehler() {
		return fehler;
	}
	
	public abstract void stop ();
}
