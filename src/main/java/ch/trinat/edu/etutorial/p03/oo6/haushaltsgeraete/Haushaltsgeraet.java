package ch.trinat.edu.etutorial.p03.oo6.haushaltsgeraete;

public abstract class Haushaltsgeraet {
	
	protected String typ, name, ort, status, fehlermeldung;
	protected boolean on, fehler;
	
	// Getter
	public String getTyp() {
		return typ;
	}
	public String getName() {
		return name;
	}
	public String getOrt() {
		return ort;
	}
	public String getStatus() {
		return status;
	}
	public String getFehlermeldung() {
		return fehlermeldung;
	}
	
	// Methoden on und Fehler
	public boolean isOn() {
		return on;
	}
	public boolean hatFehler() {
		return fehler;
	}
	
	// Methode stop
	public abstract void stop();

}
