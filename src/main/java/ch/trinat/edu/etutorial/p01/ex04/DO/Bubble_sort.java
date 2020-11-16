package ch.trinat.edu.etutorial.p01.ex04.DO;

public class Bubble_sort {

	public static void main(String[] args) {
		// Array f�r 6 Lottozahlen
		int[] lottozahlen = new int[6];

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


		int min = lottozahlen[0];
		int tempVar;

		int n = lottozahlen.length;

		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-1; j++) { 

				if (lottozahlen[j] > lottozahlen[j+1]) { 
					// swap array[j+1] und array[i] 

					int temp = lottozahlen[j]; 
					lottozahlen[j] = lottozahlen[j+1]; 
					lottozahlen[j+1] = temp; 
				} 

			}


		// Ausgabe der Zahlen am Bildschirm
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.println(lottozahlen[i]);

		}

	}
	
}
