// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Chiffre {
	
	//Caesar-Verschlüsselung für ein beliebiges Zeichen

	public static void main(String[] args) {
		String zeichen;
		int chiffSchluessel;	//Variable für den Schlüssel
		char buchstabe;			//Variable für ein Zeichen
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Geben Sie ein Zeichen ein");
		zeichen = eingabe.next();
		buchstabe = zeichen.charAt(0);
		System.out.println("Geben Sie einen Schlüssel ein");
		chiffSchluessel = eingabe.nextInt();
		System.out.println("Sie haben " + zeichen + " und " + chiffSchluessel + " eingegeben");
		
		int buchstabeAscii;
		buchstabeAscii = (int) buchstabe;
		int buchstabeAsciiChiff;
		buchstabeAsciiChiff = buchstabeAscii - chiffSchluessel;
		
		char buchstabeChiff;
		buchstabeChiff = (char) buchstabeAsciiChiff;
		
		System.out.println("Das verschlüsselte Zeichen ist: " + buchstabeChiff);
		eingabe.close();
	}

}