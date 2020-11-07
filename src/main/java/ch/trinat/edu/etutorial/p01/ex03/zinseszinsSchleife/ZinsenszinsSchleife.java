package ch.trinat.edu.etutorial.p01.ex03.zinseszinsSchleife;

import java.util.Scanner;

public class ZinsenszinsSchleife 
{
	public static void main(String[] args) 
	{
		// Variabel deklarieren.
		double geld,prozent,zins;
		int jahr;
		
		try (Scanner eingabe = new Scanner(System.in)) 
		{
			System.out.println("Wie viel CHF wollen Sie anlegen?");
			geld = eingabe.nextDouble(); //Eingabe der Variabel "geld".
			System.out.println("Zu wie viel Prozent?");
			prozent = eingabe.nextDouble(); //Eingabe der Variabel "prozent".
			System.out.println("Für wieviel Jahre?");
			jahr = eingabe.nextInt(); //Eingabe der Variabel "jahr".
		}
		
		for (int i=1; i < jahr+1; i++) 
		{
			zins=Math.round(geld*(prozent/100));
			geld=Math.round(geld+zins);
			System.out.println("Im "+ i +" Jahr gibt es "+ zins + " CHF Zins. Neuer Kontostand: " + geld + " CHF.");
		}
	}
}
