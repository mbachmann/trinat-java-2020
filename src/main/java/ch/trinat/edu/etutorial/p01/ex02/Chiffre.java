package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Chiffre {

	public static void main(String[] args) {
		Scanner eingabe1 = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		
		String Zeichen;
		int chiff_schluessel;
		char buchstabe;
		int buchstabe_ascii;
		char buchstabe_chiff;
		int buchstabe_ascii_chiff;
		
		System.out.println("Geben Sie ein Zeichen ein :");
		Zeichen = eingabe1.next();
		buchstabe = Zeichen.charAt(0);
		
		System.out.println("Geben Sie einen Schlussel ein :");
		chiff_schluessel = eingabe2.nextInt();
		System.out.println("Sie haben " + buchstabe + " und " + chiff_schluessel + " eingegeben.");
		
		buchstabe_ascii = (int) buchstabe;
		buchstabe_ascii_chiff = buchstabe_ascii - chiff_schluessel;
		buchstabe_chiff = (char) buchstabe_ascii_chiff;
		
		System.out.println("Der verschlusselte Zeichen ist : " +  buchstabe_chiff);
	}

}
