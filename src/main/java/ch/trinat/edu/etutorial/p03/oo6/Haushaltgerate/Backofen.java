package ch.trinat.edu.etutorial.p03.oo6.Haushaltgerate;

public class Backofen extends Haushaltsgeraet {

	int temperatur;
	String hitze;
	
	public Backofen (String n, String o) {
		namen = n;
		standort = o;
		typ = "Backofen";
		statusmeldung = "bereit";
				
	}
	
	public void start (int t, String h) {
		temperatur = t;
		hitze = h;
		on = true;
		statusmeldung = "l�uft mit " + t + "�C, " + h;
	}
	
	public void stop() {
		temperatur = 0;
		hitze = "aus";
		statusmeldung = "bereit";
		on = false;

	}

}
