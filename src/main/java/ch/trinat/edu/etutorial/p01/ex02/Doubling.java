package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Doubling {

	public static void main(String[] args) {
		double number;
		Scanner input = new Scanner(System.in);
		// still a string here
		System.out.println("Enter a number to double: ");
		// number = input.nextInt();
		// converts input to integer (when possible - think about managing bad input)
		number = input.nextDouble();
		number *= 2;
		System.out.println("Doubled number is: " + number);
		input.close();

	}

}
