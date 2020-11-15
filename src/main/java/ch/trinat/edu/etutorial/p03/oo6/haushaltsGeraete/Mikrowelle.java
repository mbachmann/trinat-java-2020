package ch.trinat.edu.etutorial.p03.oo6.haushaltsGeraete;

public class Mikrowelle extends Haushaltsgeraet {

	int leistung;
	double minuten;

	public Mikrowelle(String name, String ort) {
		this.name = name;
		this.ort = ort;
		this.typ = "Mikrowelle";
		this.status = "Bereit";
	}

	public void start(int leistung, Double minuten) {
		this.leistung = leistung;
		this.minuten = minuten;
		this.on = true;
		this.status = ("Power: " + leistung + "W, " + minuten + " min");
	}

//	@Override
	public void stop() {
		this.leistung = 0;
		this.minuten = 0.0;
		this.on = false;
		this.status = "Bereit";
	}

}
