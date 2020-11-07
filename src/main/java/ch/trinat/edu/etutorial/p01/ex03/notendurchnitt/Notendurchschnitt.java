package ch.trinat.edu.etutorial.p01.ex03.notendurchnitt;
import java.util.Scanner;

public class Notendurchschnitt 
{
	public static void main(String[] args) 
	{
		// Variabel deklarieren.
		float note, summe=0, durchnitt;
		int zähler=0;
		
		try(Scanner scanner = new Scanner(System.in))
		{			
			System.out.println("Bitte geben Sie ihre Noten ein (0 für Eingabe beenden): ");
			do 
			{
				zähler++;
				System.out.print(zähler +". Note: ");
				note = scanner.nextFloat();
				summe+=note;
			}
			while(note!=0);
			
			zähler-=1;
			durchnitt=summe/zähler;
			System.out.print("Sie haben "+zähler+" Noten eingegeben. Schnitt = " + durchnitt);
		}
	}
}
