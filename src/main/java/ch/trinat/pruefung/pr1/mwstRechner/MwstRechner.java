package ch.trinat.pruefung.pr1.mwstRechner;

import java.util.Scanner;

public class MwstRechner {

	public static void main(String[] args) {

		int choice=0;
		double kaufpreis, resultat;
		final double mwst=0.19;
		Scanner eingabe = new Scanner(System.in);
		
		do {
			System.out.println("Wilkommen bei MwstRechner 2000!");
			System.out.println("Geben Sie jetzt bitte den Kaufpreis ein.");
			kaufpreis = eingabe.nextDouble(); //Eingabe der Variabel "kaufpreis".
			System.out.println("Drücken Sie für den Nettobetrag\t ->\t 1");
			System.out.println("Drücken Sie für Bruttobetrag\t ->\t 2");
			System.out.println("Um Abzubrechen, drücken Sie\t ->\t 3");
			choice = eingabe.nextInt(); //Eingabe der Variabel "choice".

			switch(choice) {
			case 1:
				resultat=Math.round((kaufpreis-kaufpreis*mwst)*100)/100.00;
				System.out.println("Das Resultat Netto:"); 
				System.out.println("Netto ist für "+ kaufpreis +"€" + " gleich " + resultat + "€.\n");
				break;

			case 2:
				resultat=Math.round((kaufpreis+kaufpreis*mwst)*100)/100.00;
				System.out.println("Das Resultat Brutto:"); 
				System.out.println("Brutto ist für "+ kaufpreis +"€" + " gleich " + resultat + "€.\n");
				break;

			case 3:
				System.out.println("Vielen Dank und bis zum nächsten Mal!");
				break;

			default:
				System.out.println("!!!Falsche Eingabe!!!\n");
			}
		} while(choice!=3);
		eingabe.close();
	}
}
