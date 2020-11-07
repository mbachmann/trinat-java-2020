package ch.trinat.edu.etutorial.p01.ex02.chiffre;
import java.util.Scanner;

public class Chiffre 
{
	public static void main(String[] args) 
	{
		// Deklarierung der benötigten Variabeln:
		char buchstabe, buchstabe_chiff; // Variabel für das Zeichen - und verschlüsselt.
		int chiff_schluessel; // Variabel für den Schlüssel.
		int buchstabe_ascii, buchstabe_ascii_chiff; // Ordnungszahl des Zeichens - und verschlüsselt.
		String x; // Variabel für die Eingabe des Zeichen.
		
		// Eingabe des Zeichens und des Schlüssels:
		try (Scanner eingabe = new Scanner(System.in)) //Wartet auf die Eingabe.
		{
			System.out.println("Geben Sie ein Zeichen ein!");
			x =eingabe.next(); //Eingabe eines Wortes in der Variabel "x" (String).
			buchstabe = x.charAt(0); // Erster Buchstabe des Wortes wird in der Variabel "buchstabe" geschrieben.
			System.out.println("Geben Sie einen Schlüssel ein!");
			chiff_schluessel =eingabe.nextInt();// Auslesen des schlüssel und speicherung in der Variabel "chiff_schluessel".
		}
		
		System.out.println("Sie haben "+ buchstabe +  " und " + chiff_schluessel + " eingegeben");
		buchstabe_ascii = (int) buchstabe; // Ordnungszahl des Zeichen wird ermittellt.
		buchstabe_ascii_chiff = buchstabe_ascii - chiff_schluessel; // Verschlüsselung findet statt.
		buchstabe_chiff = (char) buchstabe_ascii_chiff; // Die neue Ordungszahl wir wieder zu einem Buchstabe umgewandelt.
		System.out.println("Das verschlüsselte Zeichen ist: " + buchstabe_chiff); // Der verschlüsselte Buchstabe wird ausgegeben.
	}
}
