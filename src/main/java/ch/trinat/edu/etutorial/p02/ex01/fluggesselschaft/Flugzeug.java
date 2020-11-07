package ch.trinat.edu.etutorial.p02.ex01.fluggesselschaft;

public class Flugzeug {
	String bezeichnung;
	int idNummer, sitze;
	double geschwindigkeit, reichweite;

	public void printInfo() {
		System.out.println(bezeichnung+": "+ sitze +" Sitze bei einer "
				+ "Geschwindigkeit von "+ geschwindigkeit +
				" km/h und einer Reichweite von "+ reichweite +" km ");
	}
	public double getTime(double dist) {
		double time;
		time=dist/geschwindigkeit;
		return time;
	}
	public int getCapacity(int tage) {
		int capacity= tage*sitze;
		return capacity;
	}
}
