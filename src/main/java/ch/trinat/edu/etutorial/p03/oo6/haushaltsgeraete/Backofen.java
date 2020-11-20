package et6_haushaltsgeraete;

public class Backofen extends Haushaltsgeraet {
	
	int temperatur;
	String hitze;

	public Backofen(String n, String o) {
		name = n;
		ort = o;
		typ = "Backofen";
		status = "bereit";
	}
	
	public void start(int t, String h) {
		temperatur = t;
		hitze = h;
		on = true;
		status = "läuft mit " + t + "°C, " + h;
	}
	
	// @Override
	public void stop() {
		temperatur = 0;
		hitze = "aus";
		status = "bereit";
		on = false;
	}

}
