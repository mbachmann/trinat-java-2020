package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Zahlen_raten {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		int zahl;
		int geraten;
		int versuche;
		boolean win;
		
		versuche = 0;
		win = false;
		
		System.out.println("Ein Spieler soll die zahl die gesucht werden muss eingeben (zwischen 0 und 100) :");
		zahl = eingabe.nextInt();

		do {
			versuche ++;
			System.out.println("Raten Sie");
			geraten = eingabe.nextInt();
			if(geraten == zahl) {
				System.out.println("Erraten!!  In " + versuche + " mal geraten.");
				win = true;
			}
			else if(geraten < zahl){
				System.out.println("Mehr");
			}
			else if(geraten > zahl){
				System.out.println("Weniger");
			}
		}
		while(win != true);
	}
}
