package Haushaltsgeraete;

public class Backofen extends Haushaltsgeraet {
	
	int temperatur;
	String hitze;

	public Backofen (String n, String o) {
		name = n;
		standort = o;
		typ = "Backofen";
		status = "Bereit";		
	}
	
	public void start(int t, String h) {
		temperatur = t;
		hitze = h;
		on = true;
		status = "Läuft mit " + t + "°C, " + h;
	}

	public void stop() {
		temperatur = 0;
		hitze = "AUS";
		status = "Bereit";
		on = false;
	}
	
}
