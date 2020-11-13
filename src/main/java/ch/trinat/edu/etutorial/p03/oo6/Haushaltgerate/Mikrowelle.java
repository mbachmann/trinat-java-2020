package ch.trinat.edu.etutorial.p03.oo6.Haushaltgerate;

public class Mikrowelle extends Haushaltsgeraet {

	int leistung;
	double minuten;

	public Mikrowelle (String n, String o) {
		namen = n;
		standort = o;
		typ = "Mikrowelle";
		statusmeldung = "bereit";	
	}

	public void start (int l, double m) {
		leistung = l;
		minuten = m;
		on = true;
		statusmeldung = "l�uft mit " + l + "W, warend " + m + " minuten";
	}

	public void stop() {
		leistung = 0;
		minuten = 0.0;
		statusmeldung = "bereit";
		on = false;
	}
}
