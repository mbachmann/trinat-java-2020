package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);  
		
		String a; 
		String b;
		String a_hilf; // a_hilf ist eine Hilfsvariable für Zwischenspeischerung.
		
		System.out.println("Geben Sie einen Namen ein :");
		a = eingabe.next(); //Initialisierung 
		
		System.out.println("Geben Sie einen Namen ein :");
		b = eingabe.next();
		
		a_hilf = a;
		a = b;
		b = a_hilf;
		
		
		System.out.println( a + " und "  + b ); //( + ) gibt den Wert a und b am Bildschirm 
		
		eingabe.close();
	}

}
