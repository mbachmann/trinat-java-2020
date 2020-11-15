package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		String a, b, swap;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		a = input.next();
		System.out.println("Enter the second word: ");
		b = input.next();
		System.out.println("First word: " + a + "\nSecond word: " + b);

		swap = a;
		a = b;
		b = swap;

		System.out.println("\nThe first word is now " + a + "\nThe second word is now " + b);
		input.close();
	}

}
