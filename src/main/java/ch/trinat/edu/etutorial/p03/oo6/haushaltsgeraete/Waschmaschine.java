package ch.trinat.edu.etutorial.p03.oo6.haushaltsgeraete;

public class Waschmaschine extends Haushaltsgeraete {

	String programm;
	int menge;
	
	public Waschmaschine(String name, String ort) {
		this.name = name;
		this.ort = ort;
		typ = "Waschmaschine";
		status = "bereit";
	}
	
	public void start(String programm, int menge) {
		this.programm = programm;
		this.menge = menge;
		on = true;
		status = "läuft mit Programm " + programm;
		if (menge > 6) {
			fehler = true;
			fehlermeldung = "Maschine überladen";
			status = "Fehler";
		}
	}

	@Override
	public void stop() {
		programm = "aus";
		menge = 0;
		status = "bereit";
		on = false;
	}
}
