// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Wohnblock {

	public static void main(String[] args) {
		
		int appartments;
		int etagen;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Anzahl Wohnungen: ");
		appartments = scanner.nextInt();
		
		System.out.print("Anzahl Stockwerke: ");
		etagen = scanner.nextInt();
		
		int wohnungen;
		int stockwerke;
		
		for (stockwerke=0; stockwerke<etagen; stockwerke++) {
			
			for (wohnungen=1; wohnungen<=appartments; wohnungen++) {
				System.out.print("[" + stockwerke + "," + wohnungen + "]");
			
			}
			System.out.println();
		}
	}

}