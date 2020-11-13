package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class Pin_do_while_Schleife {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner scanner = new Scanner(System.in);
		 
        int versuche ; 
        versuche = 3 ;
		boolean zustand;
		zustand = false; 
		
		do { 
			
		System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
		System.out.print("1. Ziffer: ");
		a = scanner.nextInt();
		System.out.print("2. Ziffer: ");
		b = scanner.nextInt();
		System.out.print("3. Ziffer: ");
		c = scanner.nextInt();
		System.out.println("Sie haben eingegeben: "+a+b+c);
		versuche  = versuche -1;
		
		
		if ( a == 0 && b == 0 && c == 7 ) {  // && um mehrere Bedingungen zu schreiben 
	  System.out.println( " offen ");
	  zustand = true; // änderung des zustandes, wenn der Pin richtig ist 
		  
	  }
		
		else { System.out.println(" Falscher PIN. Noch " + versuche + " Versuche "); }
		
		} while ((zustand == false) && ( versuche >= 1) );
	}
}