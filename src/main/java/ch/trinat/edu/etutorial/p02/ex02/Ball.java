package ch.trinat.edu.etutorial.p02.ex02;

public class Ball {
	
	double radius ; 
	private double Mein_PI=3.1415;
	
	
	
	// Default_Konstruktor
	public Ball( ) {
		radius = 1;
				
	}
	
	//Parametrisierter Konstruktor
	public Ball( double radius ) {
		this.radius = radius;
		
	}
	
	// Kopier-Konstruktor 
	public Ball ( Ball x ) {
		radius = x.radius;
	}

	// Getter und Setter für den Radius 
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void print() {
		
		System.out.println(" der Radius ist von : " + radius); 
		System.out.println(" Das Volumen ist von :" + Volumen());
		System.out.println(" Die Oberfläche ist von "+ Oberfläche());
		
		
	}
	
	public double TotalVolumen() {
		double totalvolumen = 0 ; 
		totalvolumen = totalvolumen + Volumen();
		
		return totalvolumen;
	}
	
	public double Volumen() {
		double volumen;
		volumen = ((4*Mein_PI*(radius*radius*radius))/3);
		
		return volumen ; 
	}
	
	public double Oberfläche() {
		double oberfläche;
		oberfläche = 4*Mein_PI*(radius*radius);
		
		return oberfläche; 
	}
	
	public int getZufall() {

		int zufall;
		zufall = (int) (Math.random() * 10);
		radius = zufall ; 
		return zufall;
	}
	
	
	
	
	
	
	

}
