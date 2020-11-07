package ch.trinat.edu.etutorial.p01.ex03.pinDo;
import java.util.Scanner;

public class PinDo 
{
	public static void main(String[] args)
		{
			// Variabel deklarieren.
			int a, b, c;
			boolean zustand=false;
			int versuche=3;
			
			try(Scanner scanner = new Scanner(System.in))
			{
				do
				{
					System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
					System.out.print("1. Ziffer: ");
					a = scanner.nextInt();
					System.out.print("2. Ziffer: ");
					b = scanner.nextInt();
					System.out.print("3. Ziffer: ");
					c = scanner.nextInt();
					System.out.println("Sie haben eingegeben: "+a+b+c);
					if (a==0 && b==0 && c==7)
					{
						System.out.print("Offen!");
						zustand=true;
					}
					else
					{
						System.out.println("Falscher Pin!");
						versuche-=1; // Versuche werden aktualisiert.
						System.out.println("Noch "+versuche+" Versuche!");
					}
				}
				while((zustand == false) && (versuche!=0));
			}
		}
}
