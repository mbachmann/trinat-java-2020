package ch.trinat.edu.etutorial.p01.ex02.bremsweg;
import java.util.Scanner;

public class Bremsweg 
{
	public static void main(String[] args) 
	{
		double geschwindigkeit,reaktionsweg,bremsweg,anhalteweg; // Variablen werden Deklariert.
		
		try (Scanner eingabe = new Scanner(System.in)) 
		{
			System.out.println("Geben Sie die Geschwindigkeit in km/h an!");
			geschwindigkeit = eingabe.nextDouble(); //Die Eingabe wird in der Variabel "geschwindigkeit" geschrieben.
		}
		
		reaktionsweg = Math.round(3*(geschwindigkeit)/10); //Berechnung der Variabel "reaktionsweg".
		bremsweg = Math.round(((geschwindigkeit)/10)*(geschwindigkeit)/10); //Berechnung der Variabel "bremssweg".
		anhalteweg = reaktionsweg + bremsweg; //Berechnung der Variabel "anhaltweg".
		
		// Zuletzt werden alle Resultate in der Konsole ausgegeben.
		System.out.println("Geschwindigkeit: "+ geschwindigkeit + " km/h");
		System.out.println("Der Reaktionsweg: "+ reaktionsweg + "m");
		System.out.println("Der Bremsweg: "+ bremsweg + "m");
		System.out.println("Der Anhalteweg entspricht somit: "+ anhalteweg + "m!");
	}
}
