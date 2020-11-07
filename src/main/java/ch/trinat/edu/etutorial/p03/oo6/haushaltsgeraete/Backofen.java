package ch.trinat.edu.etutorial.p03.oo6.haushaltsgeraete;

public class Backofen extends Haushaltsgeraete {

	int temperatur;
	String hitze;

	public Backofen(String name, String ort) {
		this.name = name;
		this.ort = ort;
		typ = "Backofen";
		status = "bereit";
	}

	public void start(int temperatur, String hitze) {
		this.temperatur = temperatur;
		this.hitze = hitze;
		on = true;
		status = "läuft mit " + temperatur + "°C, " + hitze;
	}
	
	@Override
	public void stop() {
		temperatur = 0;
		hitze = "aus";
		status = "bereit";
		on = false;
	}
}
