package ch.trinat.edu.etutorial.p03.oo6;

public class Mikrowelle extends Haushaltsgeraet {
	protected int leistung;
	protected double minuten;
		
	@Override
	public void stop() {
		on = false;
		leistung = 0;
		minuten = 0;
		status = "Bereit";
	}
	
	public Mikrowelle(String name, String ort) {
		this.name = name;
		this.ort = ort;
		typ = "Mikrowelle";
		status = "Bereit";
	}
	
	public void start (int leistung, double minuten) {
		on = true;
		status = "läuft mit " + leistung + "Watt während " + minuten;
	}

}
