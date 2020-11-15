package ch.trinat.edu.etutorial.p03.oo6.haushaltsGeraete;

public class Backofen extends Haushaltsgeraet {

	int temperatur;
	String hitze;

	public Backofen(String name, String ort) {
		this.name = name;
		this.ort = ort;
		this.typ = "Backofen";
		this.status = "Bereit";
	}

	public void start(int temperatur, String hitze) {
		this.temperatur = temperatur;
		this.hitze = hitze;
		this.on = true;
		this.status = ("Temperatur auf " + temperatur + "°C, " + hitze);
	}

//	@Override
	public void stop() {
		this.temperatur = 0;
		this.hitze = "Aus";
		this.on = false;
		this.status = "Bereit";
	}

}
