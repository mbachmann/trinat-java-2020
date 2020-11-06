// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class BossPuzzle {

	public static void main(String[] args) {
		
		char [][] feld = new char [3][3];
		
		//Startfeld
		feld [0][0] = '3';
		feld [0][1] = '4';
		feld [0][2] = ' ';
		feld [1][0] = '7';
		feld [1][1] = '8';
		feld [1][2] = '5';
		feld [2][0] = '2';
		feld [2][1] = '1';
		feld [2][2] = '6';
		
		//Ausgabe des Spielfeldes
		System.out.println("S   1 2 3");
		System.out.println("Z -------");
		for (int i=0 ; i<3 ; i++) {
			System.out.print(i+1 + " " + "| " );
			for (int j=0 ; j<3 ; j++) {
				System.out.print(feld[i][j] + " ");
			}
			System.out.println();
		}
		

		int zug_zeile = 0;
		int zug_spalte = 0;
		int leer_zeile = 0;
		int leer_spalte = 2;
		while (zug_zeile != 9) {
		
			//Benutzereingabe welches Feld verschoben werden soll
			System.out.println("Welches Feld möchten Sie verschieben?");
			System.out.println("Zeile (9 für Abbruch): ");
			Scanner eingabe = new Scanner(System.in);
			zug_zeile = eingabe.nextInt();
			System.out.println("Spalte: ");
			zug_spalte = eingabe.nextInt();
		
			zug_zeile = zug_zeile - 1;		//Korrektur um -1
			zug_spalte = zug_spalte - 1;	//Korrektur um -1
		
			feld [leer_zeile][leer_spalte] = feld [zug_zeile][zug_spalte];
			feld [zug_zeile][zug_spalte] = ' ';
			leer_zeile = zug_zeile;
			leer_spalte = zug_spalte;
		
			System.out.println("S   1 2 3");			//Optische Hilfe durch Visualisierung Spaltennummer
			System.out.println("Z -------");			//Optische Hilfe durch Visualisierung Zeile
			for (int i=0 ; i<3 ; i++) {
				System.out.print(i+1 + " | " );			//Optische Hilfe durch Trennung mit Leerschlag und |
				for (int j=0 ; j<3 ; j++) {
					System.out.print(feld[i][j] + " ");	//Optische Hilfe durch Trennung mit Leerschlag nach jeder Zahl
				}
				System.out.println();
			}
			eingabe.close();
		}
		
	}

}
