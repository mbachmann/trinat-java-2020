package et6_haushaltsgeraete;

public class Mikrowelle extends Haushaltsgeraet {
	
	int leistung;
	double zeit;
	
	public Mikrowelle(String n, String o) {
		name = n;
		ort = o;
		typ = "Mikrowelle";
		status = "bereit";
	}
	
	public void start(int l, double z) {
		leistung = l;
		zeit = z;
		on = true;
		status = "läuft " + z + " Minuten mit " + l + "W.";
	}
	
	public void stop() {
		leistung = 0;
		zeit = 0;
		status = "bereit";
		on = false;
	}

	/* @Override
	public void stop() {
		// TODO Auto-generated method stub

	} */

}
