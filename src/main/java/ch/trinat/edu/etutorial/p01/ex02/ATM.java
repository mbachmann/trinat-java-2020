package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float sum, remainder;
//		int note10, note20, note50, note100;

		System.out.println("Enter a sum to withdraw: ");
		sum = input.nextFloat();
		System.out.println("Entered sum: " + sum);

		System.out.println("\nThe sum contains:\n\n" + (int) sum / 100 + " note(s) of 100");
		// integer division with integer remainder
		sum = sum % 100;
//		System.out.println("Sum: " + sum);

		System.out.println((int) sum / 50 + " note(s) of 50");
		sum = sum % 50;
//		System.out.println("Sum: " + sum);

		System.out.println((int) sum / 20 + " note(s) of 20");
		sum = sum % 20;
//		System.out.println("Sum: " + sum);

		System.out.println((int) sum / 10 + " note(s) of 10");
		remainder = sum % 10;
		System.out.println("Remainder: " + remainder);

		input.close();
	}

}
