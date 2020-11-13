package ch.trinat.edu.etutorial.p02.ex02;
import java.util.Scanner;
public class Box {
	Scanner eingabe = new Scanner(System.in);
	
	private double  Höhe ; 
	private double  Breite; 
	private double  Tiefe;
	
	
	// Getter und Setter für die drei Attribute
	public double getHöhe() {
		return Höhe;
	}

	public void setHöhe(double höhe) {
		Höhe = höhe;
	}

	public double getBreite() {
		return Breite;
	}

	public void setBreite(double breite) {
		Breite = breite;
	}

	public double getTiefe() {
		return Tiefe;
	}

	public void setTiefe(double tiefe) {
		Tiefe = tiefe;
	}
	
	// Default-Konstruktor ( Standart Box)
	public Box() {
		Höhe = 1.0 ;
		Breite = 1.0 ;
		Tiefe = 1.0 ; 
	}
	
	public void printStandadbox() {
		System.out.println( " Standart boxen: " + Höhe + " " + Breite + " " + Tiefe );
		System.out.println( " Volum ist von : " + getVolum());
		System.out.println( " Oberfläche ist von :" + getSurface());
	}
	
	// Konstruktor um drei Werte zu übergeben 
	public Box (double Höhe, double Breite, double Tiefe) {
		this.Höhe = Höhe; 
		this.Breite = Breite; 
		this.Tiefe = Tiefe; 
	}
	
	// KopierKonstruktor
	public Box ( Box x ) {
		Höhe = x.Höhe;
		Breite = x.Breite; 
		Tiefe = x.Tiefe;
	}
	
	public double getVolum() {
		
		double volum; 
		volum = Höhe*Breite*Tiefe; 
				 
		return volum;
		
	}
	
	
	
	public double getSurface() {
		
		double surface ; 
		surface = 2*Höhe*Breite + 2*Höhe*Tiefe + 2*Breite*Tiefe ; 
		
		return surface ; 
	}
	
	
	public void equals() {
		
		
	}
	
	public int getZufallHöhe() {

		int zufallh;
		zufallh = (int) (Math.random() * 100) + 1;
		Höhe = zufallh ; 
		return zufallh;
		
	}
	
	public int getZufallBreite() {
		int zufallb;
		zufallb = (int) (Math.random() * 100) + 1;
		Breite = zufallb;
		return zufallb;
	}
	
	public int getZufallTiefe() {
		int zufallt;
		zufallt = (int) (Math.random() * 100) + 1;
		Tiefe = zufallt;
		return zufallt;
	}
	
	public void printZufälligeBoxen() {
		System.out.println ( " Zufällige Boxen " + getZufallHöhe() + " " + getZufallBreite() + " " + getZufallTiefe() );
		System.out.println( " Volum ist von : " + getVolum());
		System.out.println( " Oberfläche ist von :" + getSurface());
		
	}
	
	public Box clone() {
		// mit Default-Konstruktor
		Box p = new Box();
		p.Breite = this.Breite;
		p.Höhe = this.Höhe;
		p.Tiefe = this.Tiefe;

		return p;

	}
	
	public void printclone() {
		System.out.println( " Clone Boxen : " );
		System.out.println( " Volum ist von : " + getVolum());
		System.out.println( " Oberfläche ist von :" + getSurface());
		
	}

	

}
