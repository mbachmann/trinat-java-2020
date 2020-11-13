package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;
public class übung_2 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		float konto;
		int y , w;
		System.out.println(" Geben Sie wie viel Jahre : "); 
		w = eingabe.nextInt();
		System.out.println(" Geben Sie ein wie viel Geld Ihr auf dem Konto haben : ");
		konto= eingabe.nextInt();
		System.out.println(" Geben Sie ein wie viel Prozent :");
		y = eingabe.nextInt();
		 
		for ( int x = 0; x<w; x++ ) {
		
		float zins ;
		
		
		zins =  (int)(konto* y/100);
	
		konto = konto + zins;
		
		
		System.out.println(" Im " + x + " Jahr gibt es " + zins + " Zins. Neuer Kontostand : " + konto + " Fr. "  );
		
		
		
		}
	}

}
