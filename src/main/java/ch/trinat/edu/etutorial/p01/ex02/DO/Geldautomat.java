package ch.trinat.edu.etutorial.p01.ex02.DO;

import java.util.Scanner;

public class Geldautomat {

	public static void main(String[] args) {
		// Programm das einen Geldautomaten simuliert
		
		String newLine = System.getProperty("line.separator");
		
		System.out.print("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS" + newLine + "****************************************" + newLine + "Wie viel m�chten Sie abheben: " );
		Scanner eingabe = new Scanner(System.in);
		Scanner eingabe1 = new Scanner(System.in);
		
		int Geld = eingabe.nextInt(); // Variabel der usser Eingabe
		System.out.println("Eingegebener Geldbetrag: " + Geld + " Fr");
	    int Geld_real = Geld; // zweite Variabel die die erste speichert
		int Hundert = 100; // Variabel f�r Hunderter Banknote
		int funfzig = 50; // Variabel f�r funfziger Banknote
		int zwanzig = 20; // Variabel f�r zwanziger Banknote
		int zehn = 10; // Variabel f�r Zehner Banknote
		int Hundert_zahl; // Variabel f�r Zahl von Hunderter Banknoten
		int funfzig_zahl; // Variabel f�r Zahl von funfziger Banknoten
		int zwanzig_zahl; // Variabel f�r Zahl von zwanziger Banknoten
		int zehn_zahl; // Variabel f�r Zahl von zehner Banknoten
		int max_geld = 1000;; // Variabel f�r max Geld abheben
        int Geld_real_alt = Geld; // dritte Variabel die die erste speichert
		
		if (Geld > max_geld) {
			System.out.print("Sie k�nnen nur 1000 Fr auf einmal abheben");
		}
		
		else {
		 Hundert_zahl = Geld / Hundert; 
		 Geld_real = Geld_real % Hundert;
		
		 
		 funfzig_zahl = Geld_real / funfzig;
		 Geld_real = Geld_real % funfzig;
		 

		 zwanzig_zahl = Geld_real / zwanzig;
		 Geld_real = Geld_real % zwanzig;
		 
		 
		 zehn_zahl = Geld_real / zehn;
		 Geld_real = Geld_real % zehn;
		 
		 if (Geld_real > 0) { 
			 System.out.println("Es musste abgerundet werden um: " + Geld_real + " Fr" + newLine + newLine + "Sie erhalten: ");
			 if (Hundert_zahl != 0) {
			 System.out.println("100er: " + Hundert_zahl);}
			 if (funfzig_zahl != 0) {
			 System.out.println("50er: " + funfzig_zahl);}
			 if (zwanzig_zahl != 0) { 
			 System.out.println("20er :" + zwanzig_zahl);}
			 if (zehn_zahl != 0) {
			 System.out.println("10er: " + zehn_zahl);}
			 
			 System.out.print(newLine + "M�chten sie kleinere Banknoten ? (1 = ja / andere Zahl = nein): ");
			 int Geld_2 = eingabe1.nextInt();; // Variabel der usser Eingabe 2
			 if (Geld_2 == 1 ) {
				 
				 System.out.println(newLine + "Sie erhalten: ");
				 
				 zwanzig_zahl = Geld_real_alt / zwanzig;
				 Geld_real_alt = Geld_real_alt % zwanzig;
				 System.out.println("20er :" + zwanzig_zahl);
				 
				 zehn_zahl = Geld_real_alt / zehn;
				 Geld_real_alt = Geld_real_alt % zehn;
				 System.out.println("10er: " + zehn_zahl);
				 System.out.println(newLine + "Wie danken ihnen f�r ihren Besuch bei unserer Bank");
			 } 
			 else { 
				System.out.println(newLine + "Wir danken ihnen f�r ihren Besuch bei unserer Bank");
			 }
			 
			 }
		 
		 else if (Geld_real == 0) {
			     System.out.println("Sie erhalten: ");
			     if (Hundert_zahl != 0) {
				 System.out.println("100er: " + Hundert_zahl);}
				 if (funfzig_zahl != 0) {
				 System.out.println("50er: " + funfzig_zahl);}
				 if (zwanzig_zahl != 0) { 
				 System.out.println("20er :" + zwanzig_zahl);}
				 if (zehn_zahl != 0) {
				 System.out.println("10er: " + zehn_zahl);}
				 
				 System.out.print(newLine + "M�chten sie kleinere Banknoten ? (1 = ja / andere Zahl = nein): ");
				 int Geld_2 = eingabe1.nextInt();; // Variabel der usser Eingabe 2
				 if (Geld_2 == 1 ) {
					 
					 System.out.println(newLine + "Sie erhalten: ");
					 
					 zwanzig_zahl = Geld_real_alt / zwanzig;
					 Geld_real_alt = Geld_real_alt % zwanzig;
					 System.out.println("20er :" + zwanzig_zahl);
					 
					 zehn_zahl = Geld_real_alt / zehn;
					 Geld_real_alt = Geld_real_alt % zehn;
					 System.out.println("10er: " + zehn_zahl);
					 System.out.println(newLine + "Wie danken ihnen f�r ihren Besuch bei unserer Bank");
				 } 
				 else { 
					System.out.println(newLine + "Wir danken ihnen f�r ihren Besuch bei unserer Bank");
				 }
		}
		 
		}
		eingabe.close();
		eingabe1.close();
	}

}
