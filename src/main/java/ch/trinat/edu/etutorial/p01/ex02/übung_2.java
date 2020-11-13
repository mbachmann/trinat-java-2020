package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;
public class übung_2 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		int konto, y ;
		System.out.println(" Geben Sie ein wie viel Geld Ihr auf dem Konto haben : ");
		konto= eingabe.nextInt();
		System.out.println(" Geben Sie ein wie viel Prozent :");
		 y = eingabe.nextInt();
		 
		for ( int x = 0; x<10; x++ ) {
		
		int zins ;
		
		
		zins =  (int)(konto* y);
	
		konto = konto + zins;
		
		
		System.out.println(" Im " + x + " Jahr gibt es " + zins + " Zins. Neuer Kontostand : " + konto + " Fr. "  );
		
		
		eingabe.close();
		}
	}

}
