package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Sortieralgorithmen {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		int schleifen;
		int wiederholungen;
		int zahlenhilfe;
		
		wiederholungen = 0;
		
		System.out.print("Wie viele nummern wollen sie ? ");
		schleifen = eingabe.nextInt();
		
		int[] zahlen = new int[schleifen];
		
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = (int) (Math.random() * 49) + 1;

			for (int j = 0; j < i; j++) {
				if (zahlen[j] == zahlen[i]) {
					i--;
				}
			}
		}

		while (wiederholungen < schleifen) {
			wiederholungen ++;
			for (int i = 0; i < zahlen.length; i++) {
				System.out.print(zahlen[i] + " ");
				if(i >= 1) {
					if (zahlen[i-1] > zahlen[i]) {
						zahlenhilfe = zahlen[i];
						zahlen[i] = zahlen[i-1];
						zahlen[i-1] = zahlenhilfe;
					}
					
				}
			
			}
			
			System.out.println();
			
		}
		
		eingabe.close();

		
		
		
		
		
		
	}

}
