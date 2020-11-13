package ch.trinat.edu.etutorial.p02.ex01;

public class Flugzeug {
	String bezeichnung;
	int idNummer;
	int sitze;
	double geschwindigkeit; // pour avoir un chiffre apres la virgule 
	double  reichweite;
	
	

	
	
	public void printinfo() {
		
		System.out.print( bezeichnung + ": ");
		System.out.print( sitze + " Sitze ");
		System.out.print( geschwindigkeit + " km/h ");
		System.out.println( " mit Reichweite " + reichweite + " km");
		
		
		
	}
	
	public double getTime(double dist) {
		
		double time = 0 ;
		time = dist/geschwindigkeit;
		return time;
		
	}
	
	public int getCapacity(int tage) {
		
		int capacity = tage * sitze; 
		return capacity ; 
	}
}

