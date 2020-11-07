package ch.trinat.edu.etutorial.p01.ex03.zahlenRaten;
import java.util.Scanner;

public class ZahlenRaten 
{
	public static void main(String[] args) 
	{
		int eingabe, versuche=0;
		int zahl;
		boolean zustand=false;
		final int min=1, max=100;
		zahl=(int)Math.round(Math.random()*(max-min+1)+min);
		
		try (Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Gesucht ist eine Zahl zwischen 1 und 100.");
			do 
			{
				versuche++;
				System.out.println("Raten Sie..."); 
				
				do
				{
					eingabe = scanner.nextInt(); //Eingabe einer Zahl
					if ((eingabe < min) || (eingabe > max))
					{
						System.out.println("Fehlermedung! Die Zahl muss sich zwischen 1 und 100 befinden.");
					}
				}while((eingabe < min) || (eingabe > max));
				
				if (eingabe==zahl)
				{
					System.out.println("Erraten!"); 
					System.out.println("Sie haben "+versuche+" Versuche benötigt!");	
					zustand=true;
				}
				else if (eingabe<zahl)
				{
					System.out.println("Zu klein!"); 
				}
				else if (eingabe>zahl)
				{
					System.out.println("Zu gross!"); 
				}
			}while(zustand==false);
		}
	}
}
