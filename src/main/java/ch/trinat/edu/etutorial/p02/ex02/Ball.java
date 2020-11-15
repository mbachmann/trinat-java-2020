package ch.trinat.edu.etutorial.p02.ex02;

public class Ball {
	private double radius;
	private final double PI = 3.1415;

	// default Kontruktor
	public Ball() {
		radius = 1;
	}

	// Param Kontruktor
	public Ball(double r) {
		this.radius = r;
	}

	// Kopie Konstruktor
	public Ball(Ball b) {
		this.radius = b.radius;
	}

	public void print() {
		System.out.println("Radius: " + Math.round(radius * 100.0) / 100.0 + "\tVolume: "
				+ Math.round(((4.0 / 3.0) * PI * radius * radius * radius) * 100.0) / 100.0 + "   Surface: "
				+ Math.round(4 * PI * radius * radius * 100.0) / 100.0);
	}

	public double volume() {
		return (4.0 / 3.0) * PI * radius * radius * radius;
	}

	public double surface() {
		return 4 * PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
