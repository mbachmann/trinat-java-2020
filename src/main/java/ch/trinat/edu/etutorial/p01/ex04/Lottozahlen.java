//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p01.ex04;

public class Lottozahlen {

	public static void main(String[] args) {
		// Array für 6 Lottozahlen
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

		// Ausgabe der Zahlen am Bildschirm
		System.out.println("Die Zahlen sind:");
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.print(lottozahlen[i] + "  ");
		}
		
		System.out.println();
		System.out.println();
		
		//Evaluation der höchsten Zahl
		int max = 0;
		int max_index = 0;
		max = lottozahlen[max_index];
		for (int n=0 ; n<lottozahlen.length ; n++) {
			if (lottozahlen[n]>max) {
				max = lottozahlen[n];
				max_index = n+1; // Hier noch plus 1, JAVA beginnt mit 0 zu zählen
			}
				
		}
		
		System.out.println("Die grösste Zahl ist die " + max);
				
		//Evaluation der tiefsten Zahl
		int min = 0;
		int min_index = 0;
		min = lottozahlen[min_index];
		for (int n=0 ; n<lottozahlen.length ; n++) {
			if (lottozahlen[n]<min) {
				min = lottozahlen[n];
				min_index = n+1; // Hier noch plus 1, JAVA beginnt mit 0 zu zählen
			}
					
		}
		
		System.out.println("Die kleinste Zahl ist die " + min);
		
		//Bubble Sort 
		
		//int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		int n = lottozahlen.length;
		for (int i=0 ; i<n-1 ; i++) {
			for (int j=0 ; j<n-i-1 ; j++) {
				if (lottozahlen[j] > lottozahlen[j+1]) {	//Tausch von arr[j+1] und arr[j]
					int temp = lottozahlen[j];
					lottozahlen[j] = lottozahlen[j+1];
					lottozahlen[j+1] = temp;
					
				}
			}
		}
		
		//Ausgabe des sortierten Arrays
		System.out.println();
		System.out.println("Sortierter Array");
		for (int i=0; i<n; ++i) {
			System.out.print(lottozahlen[i] + " ");
		} 
		  
	}
	
}
