package ch.trinat.edu.etutorial.p03.oo6.haushaltsGeraete;

public abstract class Haushaltsgeraet {

	protected String typ, name, ort, status, fehlermeldung;
	protected boolean on, fehler;

	// stop() kann abstrakt deklariert sein, da keine Param nötig sind
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

	public boolean isOn() {
		return on;
	}

	public boolean hatFehler() {
		return fehler;
	}

}
