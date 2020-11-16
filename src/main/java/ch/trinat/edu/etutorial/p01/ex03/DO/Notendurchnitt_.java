package ch.trinat.edu.etutorial.p01.ex03.DO;


import java.util.Scanner;

public class Notendurchnitt_ {

	public static void main(String[] args) {
		// Programm das den Noten Schnitt berechnett
		
		int number = 2;
		System.out.println("Bitte geben Sie ihre Noten ein (0 f�r Eingabe beenden): ");
		System.out.print("1. ");
		Scanner eingabe = new Scanner(System.in);
		int zahler = 0; // zahler: wieviele Noten
		double Durschnitt=0; // End resultat
		double Noten = eingabe.nextDouble(); // Variablien f�r die Noten
		double Noten_neu = Noten; // Summe der Noten
		
		while (Noten != 0) {
	    System.out.print(number + ". ");
	    Noten = eingabe.nextDouble();
	    zahler = zahler + 1;
	    number = number + 1;
	    Noten_neu = Noten + Noten_neu;
	    Durschnitt = Noten_neu/zahler;
		}
		
		System.out.print("Sie haben " + zahler + " Noten eingegeben. Schnitt: " + Durschnitt);
		
        eingabe.close();
	}

}
