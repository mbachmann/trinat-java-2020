//Mischa Kissling
//09/2020


package ch.trinat.edu.etutorial.p02.ex02;

public class Ball {
	
		
	//Attribute
	private double radius;
	static double Pi = 3.1415;
	static double gesVol;
	static double gesOberfl;	
		
	//Parametrisierter Konstruktor
	public Ball (double radius) {
		this.radius = radius;
		gesVol = gesVol + this.getVol();
		gesOberfl = gesOberfl + this.getOberfl();
	}
	
	//Kopierkonstruktor
	public Ball clone() {
		Ball clone = new Ball(this.radius);
		return clone;
	}
	

	public double getRadius() {
		return radius;
	}

	public static double getGesVol() {
		return gesVol;
	}

	public static double getGesOberfl() {
		return gesOberfl;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getVol () {
		return this.radius * this.radius * this.radius * Pi * (4/3);
	}
	public double getOberfl () {
		return this.radius * this.radius * Pi *4;
	}
	public void print() {
		System.out.println("Radius: " + getRadius());
		System.out.println("Oberfläche" + getOberfl());
		System.out.println("Volumen: " + getVol());
		System.out.println();
	}
	
	
}