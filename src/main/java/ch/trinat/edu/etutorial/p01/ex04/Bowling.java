//Mischa Kissling
//07/2020

package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Bowling {

	public static void main(String[] args) {
		
		int runden;
		int spieler;
		int punkte;
		
		System.out.println("Wie viele möchten heute mitspielen?");
		Scanner eingabe = new Scanner(System.in);
		spieler = eingabe.nextInt();
		System.out.println("Wie viele Runden möchten gespielt werden?");
		runden = eingabe.nextInt();
		
		//Zusammenstellung Tabelle
		int summen[] = new int [spieler];
		int resultate [][] = new int [spieler][runden];
		
		for (int i=0 ; i<runden ; i++) {
			int w = i+1;
			System.out.println("Runde " + w + "!");
			
			for (int j=0 ; j<spieler ; j++) {
				int x = j+1;
				do {
					System.out.println("Spieler " + x + ", wie viele Punkte haben Sie erreicht?");
					punkte = eingabe.nextInt();
				} while (punkte<0 || punkte>10);	//Kontrolle ob Wert<0 oder Wert>10 ist
					resultate [j][i] = punkte;		//Platzierung in der Tabelle
				
			}
		}
		
		//Anzeige Tabelle
		System.out.println("            Spieler");
		System.out.print("           ");
		for (int k=0; k < spieler ; k++) {
			int l = k+1;
			System.out.print(l + "   ");
		}
		System.out.println("");
		System.out.println("--------------------");
		/* System.out.println("           1   2   3   4   5   6   7   8   9   10");
		Möglichkeit Loop:
		Damit es nicht bis 10 geht wenn nicht 10 Spieler spielen*/
		
		for (int k=0 ; k<runden ; k++) {
			int y = k+1;
			System.out.print(y + ". Runde   ");
			for (int l=0 ; l<spieler ; l++) {
				System.out.print(resultate[l][k] + "   ");
			}
				
			System.out.println();
				
		}
		
		//Zusammenstellung Summen
		for (int s=0 ; s<spieler ; s++) {
			for (int t=0 ; t<runden ; t++) {
				summen[s] = summen[s] + resultate[s][t];
			}
			
		}
		
		//Anzeige Summen
		System.out.println();
		System.out.print("Total      ");
		for (int u=0 ; u<spieler ; u++ ) {
			System.out.print(summen[u] + "  ");
		}
		
		System.out.println();
		System.out.println();
		
		//Wer hat gewonnen?
		int max = 0;
		int max_index = 0;
		max = summen[max_index];
		for (int n=0 ; n<summen.length ; n++) {
			if (summen[n]>max) {
				max = summen[n];
				max_index = n+1; // Hier noch plus 1, JAVA beginnt mit 0 zu zählen
			}
			
		}
		
		// Wenn höchste Punktzahl 1 war, wird "Punkten" entsprechend angepasst
		String punkt_beschreibung = "Punkten";		
		if (max == 1) {
			punkt_beschreibung = "Punkt";
		} 
		
		if (max_index == 0) { // Falls das Spiel unentschieden ausgegangen ist
			System.out.println("Es ist unentschieden ausgegangen. Die höchste Punktzahl war " + max + " " + punkt_beschreibung + "!");
		} else {		
		System.out.println("Der Gewinner ist Spieler " + max_index + " mit " + max + " " + punkt_beschreibung + "!");
		}
		
		System.out.println("Herzliche Gratulation");
		
		eingabe.close();
	}

}
