package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;
public class übung_3 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		int zahl, x; 
		
		
		boolean zustand ; 
		zustand = false ; 
		System.out.println(" Schreiben Sie die zahl zu erraten !!"); 
		zahl = eingabe.nextInt();
		
		
		while ( zustand == false ) {
					
		System.out.println(" Schreiben Sie eine Zahl viel glück "); 
		x = eingabe.nextInt();
		
		if ( x < 0 ) { // man kann keinen Wert eingeben, der 0 oder kleiner als 0 ist 
			System.out.println( " STOP !! "); 
			zustand = true ;
		}
		
		else if ( x> 100 ) { // man kann keinen Wert eingeben, der 100 oder grösser als 100 ist 
			System.out.println(" STOP !!");
			zustand = true ; 
		}
			
		else if (x < zahl ) {
			System.out.println(" Die Zahl ist zu klein"); 
		}
		
		else if ( x > zahl ) {
			System.out.println(" Die zahl ist zu gross"); 
		}
		
		else if ( x == zahl ){
			System.out.println( " Sie haben es Erraten !!!!! SUPER ");
			zustand = true ; 
			
		}
		
		}

	eingabe.close();
	}

}
