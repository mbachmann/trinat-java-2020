package ch.trinat.edu.etutorial.p01.ex02.dechiffre;
import java.util.Scanner;

/* 
 * Wort: <XVVN[ 
 * Chiffrier-Schlüssel: 23 
 * Neues Wort: Sommer
*/

public class Dechiffre 
{
	public static void main(String[] args) 
	{
		char buchstabe, buchstabe_chiff; // Variable für das Zeichen - und verschlüsselt.
		int chiff_schluessel; // Variable für den Schlüssel.
		int buchstabe_ascii, buchstabe_ascii_chiff; // Ordnungszahl des Zeichens - und verschlüsselt.
		String x; // Variable für die Eingabe des Zeichen.
		
		try (Scanner eingabe = new Scanner(System.in)) //Wartet auf die Eingaben.
		{
			System.out.println("Geben Sie ein Zeichen ein!");
			x =eingabe.next(); //Eingabe eines Wortes in der Variabel "x" (String).
			buchstabe = x.charAt(0); // Erster Buchstabe des Wortes wird in der Variabel "buchstabe" geschrieben.
			System.out.println("Geben Sie einen Schlüssel ein!");
			chiff_schluessel =eingabe.nextInt(); // Auslesen des schlüssel und speicherung in der Variabel "chiff_schluessel".
		}
		System.out.println("Sie haben "+ buchstabe +  " und " + chiff_schluessel + " eingegeben");
		buchstabe_ascii = (int) buchstabe;  // Ordnungszahl des Zeichen wird ermittellt.
		buchstabe_ascii_chiff = buchstabe_ascii + chiff_schluessel; // Entschlüsselung findet statt.
		buchstabe_chiff = (char) buchstabe_ascii_chiff; // Die neue Ordungszahl wir wieder zu einem Buchstabe umgewandelt.
		System.out.println("Das verschlüsselte Zeichen ist: " + buchstabe_chiff); // Der entschlüsselte Buchstabe wird ausgegeben.
	}
}

