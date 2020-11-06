package Haushaltsgeraete;

public class Mikrowelle extends Haushaltsgeraet {
	
	int leistung;
	double minuten;
	
	public Mikrowelle (String n, String o) {
		name = n;
		standort = o;
		typ = "Mikrowelle";
		status = "Bereit";		
	}
	
	public void start(int l, double t) {
		leistung = l;
		minuten = t;
		on = true;
		status = "Läuft mit " + l + "W, " + t + " minuten";
	}

	public void stop() {
		leistung = 0;
		minuten = 0;
		status = "Bereit";
		on = false;
	}
}
