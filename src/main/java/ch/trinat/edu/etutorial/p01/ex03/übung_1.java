package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class übung_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double x, noten, summe, durchschnitt;
		int zähler;
		zähler = 0;
		summe = 0;

		System.out.println(" Bitte geben Sie ihre Noten ein ( 0 für Eingabe beenden ): ");

		do {

			noten = scanner.nextInt();
			x = noten;

			System.out.println(" Note : " + noten);
			zähler = zähler + 1;

			summe = summe + noten;

			

		} while (x != 0);
        
		durchschnitt = summe / (zähler-1);
		System.out.println(" Durchschnitt : " + durchschnitt);

		scanner.close();

	}

}
