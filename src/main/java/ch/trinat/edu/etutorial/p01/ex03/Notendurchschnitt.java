// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Notendurchschnitt {

	public static void main(String[] args) {
		
		float note = 1;
		float zähler = -1;
		float summe = 0;
		float schnitt = 0;
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Bitte geben Sie Ihre Noten ein (0 für Eingabe beenden)");
			note = scanner.nextFloat();
			summe = summe + note;
			zähler = zähler + 1;
			
		}while (note!=0);
		
		schnitt = summe/zähler;
		System.out.println("Ihr Notenschnitt lautet: " +schnitt);

	}

}
