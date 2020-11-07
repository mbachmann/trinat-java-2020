package ch.trinat.edu.etutorial.p01.ex04.spiel;
import java.util.Scanner;

public class Spiel 
{
	public static void main(String[] args) 
	{
		int summe=0, anzahl;
		
		try(Scanner eingabe = new Scanner(System.in))
		{
		    System.out.print("Wie viel Karten möchten Sie? ");
		    anzahl=eingabe.nextInt();
		    
			int [] karten;//deklariert
			karten = new int [anzahl];//speicherplatz
			//kurzform: int [] karten = new int [6];

			for (int i=0; i<anzahl; i++)
			{
			    System.out.print("Geben Sie den Wert der Karte ein: ");
				karten[i] = eingabe.nextInt();
			}
		
		    System.out.println("Sie haben eingegeben: ");
			for (int i=0; i<anzahl; i++)
			{
				int x=i+1;
			    System.out.println(x +". Karte: "+ karten[i]);
			}
			for (int index=0; index<anzahl; index++)
			{
			    summe = summe + karten[index];
			}
		    System.out.println("Summe: " + summe);
		}
	}
}
