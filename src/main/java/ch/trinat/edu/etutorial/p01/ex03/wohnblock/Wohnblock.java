package ch.trinat.edu.etutorial.p01.ex03.wohnblock;
import java.util.Scanner;

public class Wohnblock 
{
	public static void main(String[] args) 
	{
			try(Scanner eingabe = new Scanner(System.in))
			{
				System.out.println("Wie viele Stockwerke möchten Sie?");
				int stockwerke = eingabe.nextInt();
				System.out.println("Wie viele Wohnungen pro Stockwerk möchten Sie?");
				int wohnungen = eingabe.nextInt();
			
			for(int j=0;j<stockwerke;j++) // Schleife für die Stockwerke.
			{
				for(int i=0;i<wohnungen;i++) // Schleife für die Wohnungen.
				{
				    System.out.print("["+j+","+i+"]");
				}
				System.out.println();
			}
		}
	}
}
