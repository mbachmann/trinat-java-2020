package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class ApartmentBlock {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int apartments, floors;

		System.out.println("How many floors?");
		floors = input.nextInt();
		System.out.println("How many apartments per floor?");
		apartments = input.nextInt();

		for (int f = 0; f < floors; f++) {
			for (int a = 1; a <= apartments; a++) { // Wohnungsnr. fangt bei 1 an
				System.out.print("[" + f + "," + a + "]");
				if (a == apartments) {
					System.out.println();
				}
			}
		}
		input.close();
	}

}
