package ch.trinat.edu.etutorial.p03.oo6.Haushaltsgeraete;

public class Waschmaschine extends Haushaltsgeraet {
	
	String programm;
	int lademenge;

	public Waschmaschine (String n, String o) {
		name = n;
		standort = o;
		typ = "Waschmaschine";
		status = "Bereit";		
	}
	
	public void start(String p, int l) {
		programm = p;
		lademenge = l;
		on = true;
		status = "Programm: " + p + " mit " + l + " kg";
	}

	public void stop() {
		programm = "Leerlauf";
		lademenge = 0;
		status = "Bereit";
		on = false;
	}

}
