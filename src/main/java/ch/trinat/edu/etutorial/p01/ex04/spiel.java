package ch.trinat.edu.etutorial.p01.ex04;
import java.util.Scanner;


public class spiel {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in); // Array's indizes fängen bei 0 an 
       
		int anzahl;
        System.out.println( " Wie viele Karten möchten Sie ? ");
        anzahl = eingabe.nextInt();
        
		int [] karten ; 
		                            // die beide Scritten werden oft so geschrieben : int [] karten = new int [6] 
		karten = new int [anzahl] ;
		
		int summe ; 
		summe = 0 ; 		
		
		
		// einlesen der Array Werte : 
		for( int i = 0 ; i< karten.length ; i++) { // length um zu wisse wie gross das Array ist 
			System.out.println("Geben Sie den Wert der Karte ein :"); 
			karten[i] = eingabe.nextInt();
			
		}
		
		System.out.println( " Sie haben eingegeben : "); 
		
		// Ausgabe der Array Werte : 
		for (int i = 0 ; i< karten.length ; i++) {
			System.out.println( karten[i]);
		}
		
		// Summierung den Werten der Schleife 
		for ( int i = 0 ; i< karten.length ; i++) {
			summe = summe + karten[i] ; 
		}
		
		System.out.println( " Summe : " + summe ); 
		
	}

}
