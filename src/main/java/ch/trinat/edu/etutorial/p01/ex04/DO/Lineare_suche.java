package ch.trinat.edu.etutorial.p01.ex04.DO;

public class Lineare_suche {

	public static void main(String[] args) {
		// Array f�r 6 Lottozahlen
		int[] lottozahlen = new int[6];

		int min = lottozahlen[0];
		int max = lottozahlen[0];

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
		
		
		// Lineare suche von max und min
		min = lottozahlen[0];
		max = lottozahlen[0];
		for (int a = 0; a < lottozahlen.length; a++) {
			
			if (min > lottozahlen[a]) {
				min = lottozahlen[a];}
	
			if (max < lottozahlen[a]) {
				max = lottozahlen[a];}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		
	
	
	}}



