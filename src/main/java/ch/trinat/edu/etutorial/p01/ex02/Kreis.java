package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;

public class Kreis {

	public static void main(String[] args) {
		
        System.out.println("Bitte geben Sie den Radius an: ");
		
		Scanner eingabe = new Scanner(System.in);
	    double radius = eingabe.nextDouble();
	    final double pi = 3.14159265359;
	    double umfang = 2*pi*radius;
	    double flasche = radius*radius*pi;
	    
	    flasche = Math.round(flasche*100)/100.0;
	    umfang = Math.round(umfang*100)/100.0;
	    
		System.out.println("der Umfang ist "+umfang+", die Fl�sche ist "+flasche);
		eingabe.close();

	}

}
