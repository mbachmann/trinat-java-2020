package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Wohnblock {

	public static void main(String[] args) {
		
		Scanner eingabe1 = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		
		int wohnungen;
		int stockwerke;
		
		System.out.println("Wie viele Stockwerke möchten Sie ?");
		wohnungen = eingabe1.nextInt();
		System.out.println("Wie viele Wohnungen pro Stockwerk möchten Sie ?");
		stockwerke = eingabe2.nextInt();
		
		for(int i=0; i<wohnungen; i++) {
			for(int j=0; j<=stockwerke; j++) {
				System.out.print("[" + i + "," + j + "]");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
