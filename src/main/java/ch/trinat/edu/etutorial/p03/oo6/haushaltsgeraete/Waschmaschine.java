package et6_haushaltsgeraete;

public class Waschmaschine extends Haushaltsgeraet {
	
	String waschprogramm;
	int menge;
	
	public Waschmaschine(String n, String o) {
		name = n;
		ort = o;
		typ = "Waschmaschine";
		status = "bereit";
	}
	
	public void start(String w, int m) {
		waschprogramm = w;
		menge = m;
		on = true;
		status = "läuft mit Waschprogramm " + w + " mit Menge " + m + "kg.";
		if (menge > 6) {
			fehler = true;
			fehlermeldung = "Maschine überladen";
			status = "Fehler";
		}
	}
	
	public void stop() {
		waschprogramm = "kein";
		menge = 0;
		status = "bereit";
		on = false;
	}

	/* @Override
	public void stop() {
		// TODO Auto-generated method stub

	} */

}
