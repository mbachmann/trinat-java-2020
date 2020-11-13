package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;
public class Chiffre_Passwort {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		
		char buchstabe; // Variable für das Zeichnen 
		int chiff_schluessel;  // Variable für den Schlüssel
		int buchstabe_ascii; // VAriable zur Speicherung der Ordnungszahl des eingegebenen Zeichens
		int buchstabe_ascii_chiff; // Variable zur Speicherung des chiffrierten Werts 
		char buchstabe_chiff; // Variable für das verschlüsselte Zeichen
		
		System.out.println( " geben Sie einen Schlüssel ein :");
		chiff_schluessel =eingabe.nextInt();
		
		System.out.println( " Geben Sie ein Zeichnen ein : ");
		String x = eingabe.next();
		char buchstabee = x.charAt(0); // Java beginnt bei 0 nicht bei 1 
		
		
		System.out.println ("Eingabe Schlüssel : " + chiff_schluessel);
		System.out.println(" Eingabe Zeichnen : " + buchstabee);
		
		
		buchstabe_ascii = (int) buchstabee; // um den Ordnungszahl des eingegebenen Zeichen zu bestimmen 
		
		buchstabe_ascii_chiff = buchstabe_ascii - chiff_schluessel; // Substraktion um den chiffrierten Wert zu erhalten
		
		buchstabe_chiff = (char) buchstabe_ascii_chiff; //Umwandlung von einen Zahlenwert in einen Zeichen
		
		System.out.println( " Das verschlüsselte Zeichen ist : " + buchstabe_chiff ); // Bildschirmausgabe 
		

	}

}
