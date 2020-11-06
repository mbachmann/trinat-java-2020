package ch.trinat.edu.etutorial.p03.oo6;

public class Waschmaschine extends Haushaltsgeraet {

	String programm ; 
	int lademenge ; 
	
	public Waschmaschine ( String n, String o) {
		name = n ; 
		ort = o ; 
		typ = "Waschmaschine"; 
		status = "bereit" ; 
	}
	
	public void start (String p , int l ) {
		programm =  p ;
		lademenge = l ; 
		on = true ; 
		status = "läuft mit Programm " + p; 
		if (lademenge > 6) {
			fehler = true ; 
			fehlermeldung = "Maschine überladen" ; 
			status = "Fehler"; 
		}
	}
	
	public void stop() {
		programm = "aus"; 
		lademenge = 0 ; 
		status = "bereit"; 
		on = false; 
		
	}

}
