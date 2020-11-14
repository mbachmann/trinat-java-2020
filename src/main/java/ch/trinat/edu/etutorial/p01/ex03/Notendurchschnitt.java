package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Notendurchschnitt {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		double note;
		double zahler, zahler_hilf;
		double durchschnitt;
		int menge;
		
		zahler_hilf = 0;
		menge = 0;
		System.out.println("Bitte geben Sie ihre Noten ein (0 für Eingabe beenden):");
		
		do {
			menge ++;
			System.out.print(menge + ". Note:  ");
			note = eingabe.nextDouble();
			zahler = note + zahler_hilf;
			zahler_hilf = zahler;
			
		}
		while(note != 0);
		
		menge = menge-1;
		
		durchschnitt = Math.round(zahler/menge * 100)/100.0;
		
		System.out.println("Sie haben " + menge + " Noten eingegeben. Schnitt =" + durchschnitt);
		
		
		
		
		

	}

}
