package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		// Programm das Schloss simuliert mit for loop
		
		int a, b, c; // User eingabe Variabeln
		Scanner scanner = new Scanner(System.in);
		
		for (int x = 0; x<3; x++) {  // for loop solange es nicht bis 3 gez�hlt hat, widerholt sich es 
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
			System.out.print("offen");
	}
		else {
			System.out.print("falscher pin");
		}}
	
	scanner.close();
  }

	
}