package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Spiel {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		int [] karten = new int [6];
		int summe;
		int anzahl;
		
		summe = 0;
		
		System.out.print("Wie viele Karten haben sie ? ");
		anzahl = eingabe.nextInt();
		
		for(int i=0; i<anzahl; i++) {
			System.out.print("Wert der Karte " + (i+1) + ": ");
			karten [i] = eingabe.nextInt();
		}
		
		System.out.print("Sie haben folgende werte eingegeben :");
				
		for(int i=0; i<anzahl; i++) {
			System.out.print(karten [i] + ", ");
			summe = summe + karten [i];
		}
		
		System.out.println();
		System.out.println("Die summe ist : " + summe);
		
		eingabe.close();
	}

}
