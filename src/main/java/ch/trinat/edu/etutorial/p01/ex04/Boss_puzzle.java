package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Boss_puzzle {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);

		int zug_zeile, zug_spalte, zeile_leer, spalte_leer;
		char[][] brett = new char[3][3];

		brett[0][0] = '3';
		brett[0][1] = '4';
		brett[0][2] = ' ';
		brett[1][0] = '7';
		brett[1][1] = '8';
		brett[1][2] = '5';
		brett[2][0] = '2';
		brett[2][1] = '1';
		brett[2][2] = '6';

		System.out.println(" S 1 2 3 ");
		System.out.println("Z -------");

		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "¦ ");
			for (int j = 0; j < 3; j++) {

				System.out.print(brett[i][j] + " ");

			}

			System.out.println();
		}

		zeile_leer = 0; // somit haben wir initialisiert wo der leere Feld am anfang sich befindet
		spalte_leer = 2;

		zug_zeile = 0;

		while (zug_zeile != 9) {

			System.out.println(" Welches Feld möchten Sie verschieben ? ");

			System.out.println(" Zeile : ");
			zug_zeile = eingabe.nextInt();

			System.out.println(" Spalte : ");
			zug_spalte = eingabe.nextInt();

			brett[zeile_leer][spalte_leer] = brett[zug_zeile - 1][zug_spalte - 1]; // somit können wir auswählen wo der
																					// leere Feld sich befinden soll
			brett[zug_zeile - 1][zug_spalte - 1] = ' ';

			zeile_leer = zug_zeile - 1; // somit speichern wir die neue Position des leeres Feldes
			spalte_leer = zug_spalte - 1;

			System.out.println(" S 1 2 3 ");
			System.out.println("Z -------");

			for (int i = 0; i < 3; i++) {
				System.out.print((i + 1) + "¦ ");
				for (int j = 0; j < 3; j++) {

					System.out.print(brett[i][j] + " ");

				}

				System.out.println();
			}

			System.out.println(zug_zeile++); // Aktualisierung

			System.out.println(" Drücken Sie 9 für Abbruch ");
			zug_zeile = eingabe.nextInt();

		}
		eingabe.close();
	}

}
