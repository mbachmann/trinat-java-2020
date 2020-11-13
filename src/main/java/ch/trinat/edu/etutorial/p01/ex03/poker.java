package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class poker {
	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		int farbe1, farbe2, farbe3, farbe4, farbe5, wert1, wert2, wert3, wert4, wert5;

		System.out.println("P O K E R");
		System.out.println("*********");
		System.out.println("Information zur Codierung der Karten");
		System.out.println("WERT");
		System.out.println("-----");
		System.out.println("2 bis 10: wie Kartenwert");
		System.out.println("11: Junge");
		System.out.println("12: Dame");
		System.out.println("13: K�nig");
		System.out.println("14: As");
		System.out.println("FARBE");
		System.out.println("-----");
		System.out.println("1: Pik");
		System.out.println("2: Herz");
		System.out.println("3: Kreuz");
		System.out.println("4: Karo");

		System.out.println("EINGABE IHRER KARTEN");
		System.out.println("--------------------");
		System.out.println("Geben Sie Ihre h�chste Karte ein!");

		System.out.print("1. Wert: ");
		wert1 = eingabe.nextInt();

		System.out.print("1. Farbe: ");
		farbe1 = eingabe.nextInt();

		System.out.print("2. Wert: ");
		wert2 = eingabe.nextInt();
		// Um sicher zu sein, dass der Ersten Wert der grössere ist
		if (wert2 > wert1) {
			System.out.println(" Der Wert 2 ist grösser als der Wert 1 !!! Nicht möglich Bitte neu Tippen ");
			wert2 = eingabe.nextInt();
		}

		System.out.print("2. Farbe: ");
		farbe2 = eingabe.nextInt();
		if (farbe2 > farbe1) {
			System.out.println(" Die Farbe 2 ist grösser als die Farbe 1 !!! Nicht möglich Bitte neu Tippen ");
			farbe2 = eingabe.nextInt();
		}

		System.out.print("3. Wert: ");
		wert3 = eingabe.nextInt();
		if (wert3 > wert2) {
			System.out.println(" Der Wert 3 ist grösser als der Wert 2 !!! Nicht möglich Bitte neu Tippen ");
			wert3 = eingabe.nextInt();
		}

		System.out.print("3. Farbe: ");
		farbe3 = eingabe.nextInt();
		if (farbe3 > farbe2) {
			System.out.println(" Die Farbe 3 ist grösser als die Farbe 3 !!! Nicht möglich Bitte neu Tippen ");
			farbe3 = eingabe.nextInt();
		}

		System.out.print("4. Wert: ");
		wert4 = eingabe.nextInt();
		if (wert4 > wert3) {
			System.out.println(" Der Wert 4 ist grösser als der Wert 3 !!! Nicht möglich Bitte neu Tippen ");
			wert4 = eingabe.nextInt();
		}

		System.out.print("4. Farbe: ");
		farbe4 = eingabe.nextInt();
		if (farbe4 > farbe3) {
			System.out.println(" Die Farbe 4 ist grösser als die Farbe 4 !!! Nicht möglich Bitte neu Tippen ");
			farbe4 = eingabe.nextInt();
		}

		System.out.print("5. Wert: ");
		wert5 = eingabe.nextInt();
		if (wert5 > wert4) {
			System.out.println(" Der Wert 5 ist grösser als der Wert 4 !!! Nicht möglich Bitte neu Tippen ");
			wert5 = eingabe.nextInt();
		}

		System.out.print("5. Farbe: ");
		farbe5 = eingabe.nextInt();
		if (farbe5 > farbe4) {
			System.out.println(" Die Farbe 5 ist grösser als die Farbe 4 !!! Nicht möglich Bitte neu Tippen ");
			farbe5 = eingabe.nextInt();
		}

		System.out.println("Sie haben eingegeben:");
		System.out.println("*********************");
		System.out.println("Karte 1: Wert: " + wert1 + " Farbe: " + farbe1);
		System.out.println("Karte 2: Wert: " + wert2 + " Farbe: " + farbe2);
		System.out.println("Karte 3: Wert: " + wert3 + " Farbe: " + farbe3);
		System.out.println("Karte 4: Wert: " + wert4 + " Farbe: " + farbe4);
		System.out.println("Karte 5: Wert: " + wert5 + " Farbe: " + farbe5);

		// Bewertung der Hand

		// && um mehrere bedingungen schreiben zu können
		if ((wert1 == 14) && (wert2 == 13) && (wert3 == 12) && (wert4 == 11) && (wert5 == 10) && (farbe1 == farbe2)
				&& (farbe2 == farbe3) && (farbe3 == farbe4) && (farbe4 == farbe5)) {
			System.out.println(" Royal Flush");

		}

		else if ((farbe1 == farbe2) && (farbe2 == farbe3) && (farbe3 == farbe4) && (farbe4 == farbe5)) {
			System.out.println(" Flush ");
		}

		else if ((wert1 == wert2) && (wert2 == wert3) && (wert3 == wert4)) {
			System.out.println(" Four Kind");
		}

		else if ((wert1 == wert2) && (wert2 == wert3) && (wert4 == wert5)) {
			System.out.println(" Full House ");
		}

		else if ((wert1 == wert2) && (wert2 == wert3)) {
			System.out.println(" Tree Kind ");

		}
		eingabe.close();

	}
}
