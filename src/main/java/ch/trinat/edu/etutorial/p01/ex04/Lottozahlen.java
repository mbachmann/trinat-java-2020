package ch.trinat.edu.etutorial.p01.ex04;

public class Lottozahlen {

	public static void main(String[] args) {
		
		int max;
		int mini;
		int positionmax;
		int positionmini;
		
		max = 0;
		mini = 100;
		positionmax = 0;
		positionmini = 0;
		
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

		// Ausgabe der Zahlen am Bildschirm
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.println(lottozahlen[i]);
			if (lottozahlen[i] > max) {
				max = lottozahlen[i];
				positionmax = i + 1;
			}
			if (lottozahlen[i] < mini) {
				mini = lottozahlen[i];
				positionmini = i + 1;	
			}
		}
		
		System.out.println("Der höchste Werte ist " + max + " in der position " + positionmax + ".");
		System.out.println("Der kleinste Werte ist " + mini + " in der position " + positionmini + ".");
	}

}
