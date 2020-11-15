//package ch.trinat.edu.etutorial.p01.ex05;
//
//import java.util.Scanner;
//import terminal.VT;
//import terminal.VTerm;
//
//public class Pandemic2 { // mit User Input für Länge und % Chance auf Infektion
//
//	// global matrix for storing the population static
//	static int[][] population = new int[101][101];
//	static VTerm console = VTerm.getInstance(125, 125, "Pandemic", VT.CS_TINY);// Fenster grösser wegen 100x100 matrix
//	static int infectionProbability; // wird in diese Version durch input angegeben
//
//	public static void main(String[] args) {
//		int i, j; // Counter variable for the loops
//		int days;
//		Scanner input = new Scanner(System.in);
//		System.out.println("--- Contagion simulator ---\n");
//		System.out.println("How many days will the simulation last?");
//		days = input.nextInt();
//		System.out.println("What chance of getting infected? (1/x)");
//		infectionProbability = input.nextInt();
//
//		// The values in the array population are set to 0
//		for (i = 0; i < 101; i++) {
//			for (j = 0; j < 101; j++) {
//				population[i][j] = 0;
//			}
//		}
//
//		print();// print population[][]
//
//		console.delay(500); // Wait 500 milliseconds
//
//		init();// init Methode => 3p infiziert
//
//		// Infektionsablauf
//		for (int tage = 0; tage < days; tage++) {
//			for (i = 1; i < 100; i++) {// 20 im Tut
//				for (j = 1; j < 100; j++) {// 50 im Tut => kontrolle
//					/*
//					 * gecheckt: in der infection-Methode geht man durch x+1,y+1 etc. => für
//					 * Nachbar-check. geht von 1 bis 20, sonst geht man ausser dem Array-Bereich
//					 */
//					infection(i, j);// calculation of the infection
//				}
//			}
//
//			console.clearScreen(); // Delete the content of console
//			console.println("Tag " + tage);
//
//			// Screen-Output Methode
//			print();
//			console.delay(200);
//		}
//
//		// Close the console with enter
//		console.readyToExit(true);
//	}
//
//	/* neuen Methoden */
//
//	// output Bevölkerung
//	public static void print() {
//		// Output in the screen of the console (Typ VTerm)
//		int i, j; // Counter variable for the loops
//		for (i = 0; i < 101; i++) {// counter Variablen für Schleifen deklariert
//			for (j = 0; j < 101; j++) {
//				if ((population[i][j] > 0) && (population[i][j] < 8)) {
//					console.print("" + population[i][j]);
//				} else {
//					console.print(' ');
//				}
//			}
//			console.println();
//		}
//	}
//
//	public static void infection(int x, int y) {
//		int randomInfect;
//		if (population[x][y] == 0) {
//			if ((infectious(x - 1, y)) || (infectious(x + 1, y)) || (infectious(x, y + 1)) || (infectious(x, y - 1))) {
//				// calculation of the infection
//				randomInfect = (int) (Math.random() * infectionProbability);
//				if (randomInfect == 0) {
//					population[x][y] = 1;
//				}
//			}
//		} else if (population[x][y] < 8) {
//			population[x][y]++;
//		}
//	}
//
//	public static void init() {
//		int x, y; // Variablen um Position einzutragen
//		for (int i = 0; i < 3; i++) {
//			x = (int) (Math.random() * 100) + 1;
//			y = (int) (Math.random() * 100) + 1;
//			population[x][y] = 1;
//		}
//	}
//
//	public static boolean infectious(int x, int y) {
//		boolean contagious;
//		if ((population[x][y] > 0) && (population[x][y] < 8)) {
//			contagious = true;
//		} else
//			contagious = false;
//		return contagious;
//	}
//}