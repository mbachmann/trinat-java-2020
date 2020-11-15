package ch.trinat.edu.etutorial.p03.oo6.haushaltsGeraete;

public class Waschmaschine extends Haushaltsgeraet {

	String waschProgramm;
	int gewicht;

	public Waschmaschine(String name, String ort) {
		this.name = name;
		this.ort = ort;
		this.typ = "Waschmaschine";
		this.status = "Bereit";
	}

	public void start(String programm, int gewicht) {
		this.waschProgramm = programm;
		this.gewicht = gewicht;
		this.on = true;
		this.status = ("Programm: " + programm);
		if (gewicht > 6) {
			fehler = true;
			this.status = "Waschen nicht möglich";
			this.fehlermeldung = "Maschine überladen";
		}
	}

//	@Override
	public void stop() {
		this.waschProgramm = "";
		this.gewicht = 0;
		this.on = false;
		this.status = "Bereit";
		fehler = false;
		this.fehlermeldung = "";
	}

}
