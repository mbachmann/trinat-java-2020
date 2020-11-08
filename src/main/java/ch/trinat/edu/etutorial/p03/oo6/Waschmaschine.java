package ch.trinat.edu.etutorial.p03.oo6;

public class Waschmaschine extends Haushaltsgeraet {

	protected String programm;
	protected int lademenge;//in kg
	
	@Override
	public void stop() {
		status = "Bereit";
		on = false;
		programm = "";
		lademenge=  0;

	}
	
	public Waschmaschine (String name, String ort) {
		this.name = name;
		this.ort = ort;
		typ = "Waschmaschine";
		status = "Bereit";
		
	}
	
	public void start(String programm, int lademenge) {
		if (lademenge<6) {
			status = "läuft mit " + programm;
			on = true;
		}
		else {
			System.err.println("Sie haben zu viele Wäsche in die Maschine gemacht");
		}
	}

}
