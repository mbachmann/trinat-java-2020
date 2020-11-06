package ch.trinat.edu.etutorial.p03.oo6;

public class Waschmaschine extends Haushaltsgeraet {

	String programm;
	int lademenge;

	public Waschmaschine (String n, String o) {
		name = n;
		ort = o;
		typ = "Waschmaschine";
		status = "bereit";
	}

	public void start (String p, int l) {
		programm = p;
		lademenge = l;
		on = true;
		status = "lauft mit Programm" + p;
		if (l > 6) {
			fehler = true ;
			fehlermeldung = "Maschine überladet";
			status = "Fehler";
		}
	}

	public void stop () {
		lademenge = 0;
		programm = "aus";
		status = "bereit";
		on = false;
	}

}
