// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Entschluesseln {
	
	//Caesar-Entschlüsselung für einen beliebiges Zeichen

	public static void main(String[] args) {
		String zeichen;
		int chiff_schluessel;	//Variable für den Schlüssel
		char buchstabe;			//Variable für ein Zeichen
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Geben Sie ein Zeichen ein");
		zeichen = eingabe.next();
		buchstabe = zeichen.charAt(0);
		System.out.println("Geben Sie einen Schlüssel ein");
		chiff_schluessel = eingabe.nextInt();
		System.out.println("Sie haben " + zeichen + " und " + chiff_schluessel + " eingegeben");
		
		int buchstabe_ascii;
		buchstabe_ascii = (int) buchstabe;
		int buchstabe_ascii_chiff;
		buchstabe_ascii_chiff = buchstabe_ascii + chiff_schluessel;
		
		char buchstabe_chiff;
		buchstabe_chiff = (char) buchstabe_ascii_chiff;
		
		System.out.println("Das verschlüsselte Zeichen ist: " + buchstabe_chiff);
		eingabe.close();
	}

}
