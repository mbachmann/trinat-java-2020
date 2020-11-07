package ch.trinat.edu.etutorial.p01.ex02.zinseszins;

import java.util.Scanner;

public class Zinseszins 
{
	public static void main(String[] args) 
	{
		// Variablen werden Deklariert.
		double geld,prozent,zins;
		final int jahr = 11;
		
		try (Scanner eingabe = new Scanner(System.in)) 
		{
			System.out.println("Wie viel CHF wollen Sie anlegen?");
			geld = eingabe.nextDouble(); //Eingabe der Variabel "geld".
			System.out.println("Zu wie viel Prozent?");
			prozent = eingabe.nextDouble(); //Eingabe der Variabel "prozent".
		}
		
		for (int i = 1; i < jahr; i++) 
		{
			zins=Math.round(geld * (prozent / 100)); // Berechnung der Variabel "zins".
			geld=Math.round(geld + zins); // Berechnung der Variabel "ged".
			System.out.println("Im "+ i +" Jahr gibt es "+ zins + " CHF Zins. Neuer Kontostand: " + geld + " CHF.");
		}
	}
}
