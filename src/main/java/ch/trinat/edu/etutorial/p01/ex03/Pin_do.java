package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class Pin_do {

	public static void main(String[] args) {
		int a, b, c;
		boolean zustand;
		int versuche;
		
		Scanner scanner = new Scanner(System.in);
		zustand = false;
		versuche = 3;
		
		do  {
			System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
			System.out.print("1. Ziffer: ");
			a = scanner.nextInt();
			System.out.print("2. Ziffer: ");
			b = scanner.nextInt();
			System.out.print("3. Ziffer: ");
			c = scanner.nextInt();
			System.out.println("Sie haben eingegeben: "+a+b+c);
			
			versuche = versuche - 1;
			
			if (a == 0 && b == 0 && c == 7) {
				zustand = true;
				System.out.println("Offen");
			}
			else System.out.println("Falscher Pin, noch " + versuche + " versuche!!");
			
		}
		while (zustand == false && versuche != 0);
	}

}