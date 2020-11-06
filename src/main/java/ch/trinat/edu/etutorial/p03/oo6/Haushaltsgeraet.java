package ch.trinat.edu.etutorial.p03.oo6;


public abstract class Haushaltsgeraet {
	
	protected String typ;
	protected String name;
	protected String ort;
	protected String status;
	protected String fehlermeldung;
	
	protected boolean on;
	protected boolean fehler;
	
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
	
	public boolean isOn() {
		return on;
	}
	
	public boolean hatFehler() {
		return fehler;
	}
	
	public abstract void stop();

}
