package ch.trinat.edu.etutorial.p01.ex05;

import terminal.VT;
import terminal.VTerm;

public class Pandemic {
	// global matrix for storing the population static
	static int[][] population = new int[21][51];
	// 2e Matrix zum speichern von 1e/2e infizierung
	static int[][] population2 = new int[21][51];
	static VTerm console = VTerm.getInstance(30, 80, "Pandemic", VT.CS_TINY);

	/*
	 * infectionProbability wird in diese Version auf 20% eingestellt & beeinflusst
	 * durch # infizierte Nachbarn
	 */

	static int cured = 0; // # Leute die an Tag 8 wieder gesund sind
	static int neverInfected = 1000; // 20x50 Leute wurden am Anfang nie infiziert
	static int sick = 0; // zum berechnen der # kranke Leute Ende Programm

	public static void main(String[] args) {
		int i, j; // Counter variable for the loops

		// The values in the array population are set to 0
		for (i = 0; i < 21; i++) {
			for (j = 0; j < 51; j++) {
				population[i][j] = 0;
			}
		}

		// Werte für Population2 auf false
		for (i = 0; i < 21; i++) {
			for (j = 0; j < 51; j++) {
				population2[i][j] = 0;
			}
		}

		print();// print population[][]

		console.delay(500); // Wait 500 milliseconds

		init();// init Methode => 3p infiziert

		// Infektionsablauf
		for (int tage = 0; tage < 20; tage++) {
			for (i = 1; i < 20; i++) {// 20 im Tut
				for (j = 1; j < 50; j++) {// 50 im Tut => kontrolle
					/*
					 * gecheckt: in der infection-Methode geht man durch x+1,y+1 etc. => für
					 * Nachbar-check. geht von 1 bis 20, sonst geht man ausser dem Array-Bereich
					 */
					infection(i, j);// calculation of the infection
				}
			}

			console.clearScreen(); // Delete the content of console
			console.println("Tag " + tage);

			// Screen-Output Methode
			print();
			console.delay(200);
		}

		// Berechnung von Stats & output
		stats();
		console.println();
		console.println("Simulation steps: 20");
		console.println("Number of people who were not ill yet: " + neverInfected);
		console.println("Number of ill people now: " + sick);
		console.println("Number of cured people: " + cured);

		// Close the console with enter
		console.readyToExit(true);
	}

	/* neuen Methoden */

	// output Bevölkerung
	public static void print() {
		// Output in the screen of the console (Typ VTerm)
		int i, j; // Counter variable for the loops
		for (i = 0; i < 21; i++) {// counter Variablen für Schleifen deklariert
			for (j = 0; j < 51; j++) {
				if ((population[i][j] > 0) && (population[i][j] < 8)) {
					console.print("" + population[i][j]);
				} else {
					console.print(' ');
				}
			}
			console.println();
		}
	}

	public static void infection(int x, int y) {
		int randomInfect;
		int infectionProbability = 5;
		if ((population[x][y] == 0)) {
			if ((infectious(x - 1, y)) || (infectious(x + 1, y)) || (infectious(x, y + 1)) || (infectious(x, y - 1))) {
				// für jeder Nachbar mit Virus wird die Probabilität höher
				if (infectious(x - 1, y)) {
					infectionProbability--;
				}
				if (infectious(x + 1, y)) {
					infectionProbability--;
				}
				if (infectious(x, y + 1)) {
					infectionProbability--;
				}
				if (infectious(x, y - 1)) {
					infectionProbability--;
				}
				randomInfect = (int) (Math.random() * infectionProbability);
				if (randomInfect == 0) {
					population[x][y] = 1;
					population2[x][y]++;
				}
			}
		} else if (population[x][y] < 12) {
			population[x][y]++;
		}

		if (population[x][y] == 8) {
			cured++;
		}
		if (population[x][y] == 11) {
			population[x][y] = 0;
		}
	}

	// 3 Leute random infiziert
	public static void init() {
		int x, y; // Variablen um Position einzutragen
		for (int i = 0; i < 3; i++) {
			x = (int) (Math.random() * 20) + 1;
			y = (int) (Math.random() * 50) + 1;
			population[x][y] = 1;
		}
	}

	// check ob jemand zwischen 1 & 8 Tage krank ist & anstecken kann
	public static boolean infectious(int x, int y) {
		boolean contagious;
		if ((population[x][y] > 0) && (population[x][y] < 8)) {
			contagious = true;
		} else
			contagious = false;
		return contagious;
	}

	// berechnet uninfizierte/kranke Leute
	public static void stats() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 50; j++) {
				if (population2[i][j] != 0) {
					neverInfected--;
				}
			}
		}
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 51; j++) {
				if ((population[i][j] > 0) && (population[i][j] < 8)) {
					sick++;
				}
			}
		}

	}
}