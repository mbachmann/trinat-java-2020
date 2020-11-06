//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p02.ex01;

public class Flugzeug {
	
	String bezeichnung;
	int idNummer;
	int sitze;
	double geschwindigkeit;
	double reichweite;
	
	public void printInfo() {
		System.out.println(bezeichnung + ": " + sitze + " Sitze, " + geschwindigkeit + " km/h mit Reichweite " + reichweite);
	}
	
	public double getTime (double dist) {
		double time = 0;
		time = dist / geschwindigkeit;
		return time;
	}
	
	public int getCapacity (int tage) {
		int capacity = tage*sitze;
		return capacity;
	}
}
