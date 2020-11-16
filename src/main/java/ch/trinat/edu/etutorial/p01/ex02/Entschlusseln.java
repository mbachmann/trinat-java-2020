package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Entschlusseln {

	public static void main(String[] args) {
	        /* programm das ein Wort verschl�sselt */ 
		
			String newLine = System.getProperty("line.separator");
			System.out.print("Bitte geben Sie den Buchstaben ein, den Sie entschl�sseln m�chten: ");
			Scanner eingabe = new Scanner(System.in);
		    String x = eingabe.next();
			char buchstabe = x.charAt(0);  /* Variabel f�r ein Zeichen */
			int chiff_schluessel;   // Variabel f�r einen Schluessel 
			int buchstabe_ascii = buchstabe; // Variabel zur speicherung der Ordnungszahl des eingegebenen Zeichens
			int buchstabe_ascii_chiff; // Variable zur Speicherung des chiffrierten Werts
			
			System.out.print("Bitte geben Sie den Schl�ssel ein: ");
			Scanner eingabe1 = new Scanner(System.in);
			chiff_schluessel =eingabe.nextInt();
			buchstabe_ascii_chiff = buchstabe_ascii + chiff_schluessel;
			char buchstabe_chiff = (char) buchstabe_ascii_chiff;
			
			System.out.print("Sie haben "+ buchstabe + " und " + chiff_schluessel + " eingegeben");
			System.out.print(newLine + "Das entschl�sselte Zeichen ist: " + buchstabe_chiff);
			
			eingabe.close();
			eingabe1.close();

	}

}
