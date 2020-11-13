package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class Wohnblock {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x , y ; 

		System.out.println(" Wie viele Stockwerke möchten Sie ? "); 

		x = scanner.nextInt();

		System.out.println(" Wie viele Wohnungen pro Stockwerk möchten Sie ? ");

		y = scanner.nextInt();



		for ( int stockwerke = 0 ; stockwerke < x  ; stockwerke ++ ) { // äussere Schleife // " -" weil man von 0 mit die 
			// numerierung anfangen wollen 

			for (int wohnungen = 1 ; wohnungen <= y ; wohnungen ++ ) { // innere Schleife 

				System.out.print("[" + stockwerke + " , " + wohnungen + " ]"); // nur "print" ohne "ln" werden die Zeichen nebeneinander gesetzt. 
			}

			System.out.println();
		}
		scanner.close();
	}

}
