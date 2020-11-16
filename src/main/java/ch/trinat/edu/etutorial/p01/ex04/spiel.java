package ch.trinat.edu.etutorial.p01.ex04;
import java.util.Scanner;

public class spiel {

	public static void main(String[] args) {
	
	Scanner eingabe = new Scanner(System.in);
	Scanner eingabe1 = new Scanner(System.in);
	int summe = 0;
    int user_eingabe;

	System.out.print("Wie viele Karten m�chten Sie? ");
	user_eingabe = eingabe.nextInt();
	
	int [] karten = new int [user_eingabe];
	
	for (int i = 0; i < karten.length; i++) {
		System.out.print("Geben Sie den Wert der Karte ein: ");
		karten [i] = eingabe.nextInt();
	}
	
	
	System.out.println("Sie haben eingegeben: ");
	for (int i=0; i < karten.length; i++) {
	    System.out.println( karten[i]);
	}
	

	for (int index = 0; index < karten.length; index++) {
	    summe = summe + karten[index];
	}
	
	System.out.print("Summe: " + summe);
	

eingabe.close();
eingabe1.close();	
			
	}
	
}
