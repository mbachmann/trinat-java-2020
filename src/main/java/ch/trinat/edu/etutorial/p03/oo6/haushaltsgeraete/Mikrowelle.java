package ch.trinat.edu.etutorial.p03.oo6.haushaltsgeraete;

public class Mikrowelle extends Haushaltsgeraete {

	int leistung;
	double minuten;
	
	public Mikrowelle(String name, String ort) {
		this.name = name;
		this.ort = ort;
		typ = "Mikrowelle";
		status = "bereit";
	}

	public void start(int leistung, double minuten) {
		this.leistung = leistung;
		this.minuten = minuten;
		on = true;
		status = "läuft mit " + leistung + "W für " + minuten + " Minuten.";
	}
	@Override
	public void stop() {
		leistung = 0;
		minuten = 0;
		status = "bereit";
		on = false;
	}
}
