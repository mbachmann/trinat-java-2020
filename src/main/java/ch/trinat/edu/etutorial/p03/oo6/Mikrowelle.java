package ch.trinat.edu.etutorial.p03.oo6;

public class Mikrowelle extends Haushaltsgeraet {

	
	int leistung ; 
	double minuten ; 
	
	public Mikrowelle (String n , String o) {
		name = n ; 
		ort = o ; 
		typ = "Mikrowelle"; 
		status = "bereit"; 
		}
	
	public void start ( int l , double m ) {
		leistung = l ; 
		minuten = m ; 
		on = true ; 
		status = "läuft mit eine Leistung von " + l + "minuten " + m;
	}
	
	public void stop() {
		leistung = 0; 
		minuten = 0 ; 
		status = "bereit"; 
		on = false ; 
	}

}
