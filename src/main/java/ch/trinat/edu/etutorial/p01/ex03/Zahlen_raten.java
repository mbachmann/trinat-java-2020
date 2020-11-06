// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Zahlen_raten {

	public static void main(String[] args) {

		int solution = 1;
		int guess = 0;
		int versuche = 0;
		boolean ok = false;

		do {

			System.out.println("Spieler 1:");
			System.out.println("Bitte gib eine Zahl zwischen 1 und 100 ein!");

			Scanner losung = new Scanner(System.in);
			solution = losung.nextInt();

		} while (solution < 1 || solution >= 100);

		for (int i = 0; i<= 20; i++) {
			System.out.println();
		}

		System.out.println("Spieler 2:");
		System.out.println("Gesucht ist eine Zahl zwischen 1 und 100.");

		while (ok == false) {

			System.out.println("Raten Sie!");
			Scanner raten = new Scanner(System.in);
			guess = raten.nextInt();
			versuche = versuche+1;

			if (solution < guess) {
				System.out.println("zu gross");
			}
			else if (solution > guess) {
				System.out.println("zu klein");
			}
			else if (solution == guess) {
				ok = true;
				System.out.println("Super, Sie haben " + versuche+ " Versuche gebraucht");
			}

		}
		
	}

}
