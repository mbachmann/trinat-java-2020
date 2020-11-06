// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Bremsweg {

	public static void main(String[] args) {
		int geschwindigkeit;
		int reaktionsweg;
		int bremsweg;
		int anhalteweg;
		System.out.println("Geben Sie Ihre Geschwindigkeit ein");
		Scanner eingabe = new Scanner(System.in);
		geschwindigkeit = eingabe.nextInt();
		
		reaktionsweg = 3 * (geschwindigkeit/10);
		bremsweg = (geschwindigkeit/10) * (geschwindigkeit/10);
		anhalteweg = reaktionsweg + bremsweg;
		
		System.out.println("Ihr Reaktionsweg ist " + reaktionsweg + " Meter");
		System.out.println("Ihr Bremsweg ist " + bremsweg + " Meter");
		System.out.println("TOTAL");
		System.out.println("Ihr Anhalteweg ist " + anhalteweg + " Meter");
		eingabe.close();
	}
}