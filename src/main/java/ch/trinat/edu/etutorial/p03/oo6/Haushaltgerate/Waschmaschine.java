package ch.trinat.edu.etutorial.p03.oo6.Haushaltgerate;

public class Waschmaschine extends Haushaltsgeraet {

	int lademenge;
	String program;

	public Waschmaschine (String n, String o) {
		namen = n;
		standort = o;
		typ = "Waschmaschine";
		statusmeldung = "bereit";

	}

	public void start (int l, String p) {
		lademenge = l;
		program = p;
		on = true;
		if (lademenge > 6) {
			fehler = true;
		}
		else {
			statusmeldung = "program '" + p + "' gewallt, mit " + l + "kg.";
		}
	}

	public void stop() {
		lademenge = 0;
		program = "kein program";
		statusmeldung = "bereit";
		on = false;

	}

}
