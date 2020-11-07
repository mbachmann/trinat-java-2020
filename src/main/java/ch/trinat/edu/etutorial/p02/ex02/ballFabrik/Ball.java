package ch.trinat.edu.etutorial.p02.ex02.ballFabrik;

public class Ball {
	private double radius;
	static double meinPi = 3.1415;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//Default-Konstruktor - Radius auf 1 setzen.
	public Ball() {
	    radius = 1;
	}
	
	//Parametrisierter Konstruktor.
	public Ball(double radius){
	    this.radius = radius;
	}
	
	//Kopier-Konstruktor.
	public Ball(Ball b) {
	    radius = b.getRadius();
	}
	
	public double getVolume() {
		double volume = Math.round(4/3*meinPi*Math.pow(radius,3));
		return volume;
	}
	
	public double getSurface() {
		double surface = Math.round(meinPi*4*Math.pow(radius,2));
		return surface;
	}
	
	public void print() {
		System.out.println("Radius: " + radius + "cm");
		System.out.println("Volumen: " + getVolume()+ "cm3");
		System.out.println("Oberfläche: " + getSurface()+ "cm2");
	}
}
