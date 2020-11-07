package ch.trinat.edu.etutorial.p01.ex02.kreis;
import java.util.Scanner;

public class Kreis 
{
	public static void main(String[] args) 
	{
		try (Scanner eingabe = new Scanner(System.in)) 
		{
			double radius,kreisfläche,kreisumfang; // Deklarieren der benötigten Variabeln.
			System.out.println("Geben Sie den Radius ein!");
			radius = eingabe.nextDouble(); //Eingabe wird in der Variabel "radius" gespeichert.
			
			kreisfläche = Math.round(2*Math.PI*radius*100)/100.0; //Berechnung der Variabel "kreisfläche".
			kreisumfang = Math.round(Math.PI*Math.pow(radius, 2)*100)/100.0; //Berechnung der Variabel "kreisumfang".
			// "Math.round" dient zur abrundung des Resultats auf Zwei Stellen nach dem Kommazeichen.
			// "Math.pow" ermöglicht es uns die Variabel "radius" zu quadrieren.
			
			System.out.println("Radius: "+radius);
			System.out.println("Der Umfang ist: "+kreisfläche);
			System.out.println("Die Fläche ist: "+kreisumfang);
			// Zuletzt werden die Resultate in der Konsole ausgegeben.
		}
	}
}