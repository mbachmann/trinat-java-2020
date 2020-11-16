package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class Pin_while {

	public static void main(String[] args) {
		// Programm das Schloss simuliert mit while loop
		
		
        int a, b, c; // User eingabe Variabeln
        boolean zustand = false; // der zustand false solange es nicht im programm umge�ndert wird
        int versuche = 0; // versuche
        int ausgabe = 2; // wieviele versuche der User noch bleiben
		Scanner scanner = new Scanner(System.in);
		String newLine = System.getProperty("line.separator");
		
		
		while ((zustand == false) && (versuche < 3)) { // while loop solange es nicht bis 3 gez�hlt hat oder es true ist, widerholt sich es 
		ausgabe = ausgabe - versuche; 
		versuche = versuche + 1; 
		System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
		System.out.print("1. Ziffer: ");
		a = scanner.nextInt();
		System.out.print("2. Ziffer: ");
		b = scanner.nextInt();
		System.out.print("3. Ziffer: ");
		c = scanner.nextInt();
		System.out.println("Sie haben eingegeben: "+a+b+c);
		if (a==0 && b==0 && c==7)
		{ 
			
			zustand = true;
			System.out.print("offen");
			
		}
		
		else {
			
			if (ausgabe == 2) {
			System.out.println("Falscher Pin. Sie haben noch: " + ausgabe + " versuche" + newLine);
			}
			
			else if (ausgabe == 1) {
				System.out.println("Falscher Pin. Sie haben noch: " + ausgabe + " versuch" + newLine);	
			}
			
			else {
				System.out.println("Falscher Pin. Sie haben keinen Versuch mehr ");	
			}
			
			}
		} 
	
		scanner.close();
	}
	
} 


