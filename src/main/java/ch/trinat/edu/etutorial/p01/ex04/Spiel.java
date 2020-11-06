// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Spiel {

	public static void main(String[] args) {
		
		int [] karten;
		int summe = 0;
		int x = 0;
		System.out.println("Wie viele Karten hätten Sie gerne?");
		Scanner kartenzahl = new Scanner(System.in);
		x = kartenzahl.nextInt();
		karten = new int [x];
		//oder
		//int [] karten = new int [x];
		
		Scanner karteninput = new Scanner(System.in);
		
		//Einlesen Array
		for (int i=0 ; i<karten.length ; i++) {
			System.out.println("Geben Sie den Wert der Karte ein:");
			karten[i] = karteninput.nextInt();
		}
		
		//Ausgabe Array
		for (int i=0 ; i<karten.length ; i++) {
			System.out.println(karten[i]);
		}
		
		//Summe in Array
		for (int i=0 ; i<karten.length ; i++) {
			summe = summe + karten[i];
		}
		
		System.out.println("Die Summe Ihrer Karten ist: " + summe);
		

	}

}
