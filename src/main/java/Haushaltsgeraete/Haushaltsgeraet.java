package Haushaltsgeraete;

public abstract class Haushaltsgeraet {
	
	protected String typ;
	protected String name;
	protected String standort;
	protected String status;
	protected String fehlermeldung;
	
	protected boolean on = false;
	protected boolean fehler = false;
	
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
	public String getStandort() {
		return standort;
	}
	public String getStatus() {
		return status;
	}
	public String getFehlermeldung() {
		return fehlermeldung;
	}
	
}
