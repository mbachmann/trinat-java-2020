package ch.trinat.edu.etutorial.p03.oo6;

public abstract class Haushaltsgeraet {
	protected String typ, name, ort, status, fehlermeldung;
	protected boolean on, fehler;
	
	
	public boolean isOn() {
		return on;
	}
	
	public boolean hatFehler() {
		return fehler;
	}
	
	public abstract void stop();
	
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
}
