package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Lottozahlen {

	public static void main(String[] args) {
		// Array f�r 6 Lottozahlen
		int[] lottozahlen = new int[6];
		int max = lottozahlen[0];
		int min = lottozahlen[0];

		// Ziehung der Lottozahlen
		for (int i = 0; i < lottozahlen.length; i++) {
			lottozahlen[i] = (int) (Math.random() * 49) + 1;

			// doppelte Ziehung verhindern
			for (int j = 0; j < i; j++) {
				if (lottozahlen[j] == lottozahlen[i]) {
					i--;
				}
			}
		}

		// Ausgabe der Zahlen am Bildschirm
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.println(lottozahlen[i]);
		}
		
		for ( int k = 0 ; k < lottozahlen.length ; k++) {
			if ( lottozahlen[k] > max ) {
				max = lottozahlen[k];
			}
			
			if ( lottozahlen[k] < min ) {
				min = lottozahlen[k]; 
			}
		}
		
		System.out.println( " Max : " + max ); 
		System.out.println( " Min : " + min ); 
		
		// Sortierung Algorithmus 
		
		boolean sorted = false ; 
		int temp;
		while( !sorted) { // macht den Programme bis dass sorted nicht mehr true ist  
			sorted = true ; 
			for ( int a = 0 ; a<lottozahlen.length - 1 ; a++ ) {
				if(lottozahlen[a] > lottozahlen[a + 1 ] ) {
					temp = lottozahlen[a];
					lottozahlen[a] = lottozahlen[a + 1 ] ;
					lottozahlen[ a + 1 ] = temp; 
					sorted = false ; 
				}
			}
		}
		
		for ( int b = 0 ; b < lottozahlen.length ; b++ ) {
				
		System.out.println( lottozahlen[b]);
		}
	}

}
