package ch.trinat.edu.etutorial.p03.oo6;

public class Backofen extends Haushaltsgeraet {

	protected int temperatur;
	protected String hitze;
	
	@Override
	public void stop() {
		temperatur = 0;
		hitze = "aus";
		on = false;
		status = "bereit";
	}

	public Backofen(String name, String ort) {
		this.name = name;
		this.ort = ort;
		typ = "backofen";
		status = "bereit";
	}

	public void start(int temperatur, String hitze) {
		//temperatur = t;
		//hitze = h;
		on = true;
		status = "läuft mit " + temperatur + "°C" + hitze; 
	}

}
