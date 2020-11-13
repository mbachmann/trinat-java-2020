package ch.trinat.edu.etutorial.p03.oo6.Haushaltgerate;

public abstract class Haushaltsgeraet {

	protected String typ, namen, standort, statusmeldung, felhermeldung;
	protected boolean on, fehler;

	public String getTyp() {
		return typ;
	}

	public String getName() {
		return namen;
	}

	public String getOrt() {
		return standort;
	}

	public String getStatus() {
		return statusmeldung;
	}

	public String getFehlermeldung() {
		return felhermeldung;
	}

	public boolean isOn() {
		return on;
	}

	public boolean hatFehler() {
		return fehler;
	}

	public abstract void stop();
}


